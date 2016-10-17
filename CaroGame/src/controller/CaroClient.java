package controller;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Locale;
import java.awt.event.*;

import javax.swing.*;

import model.Cell;
import utils.ResourceUtils;

public class CaroClient extends JFrame implements Runnable, ActionListener {
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";// Message send position i, j of cell clicked
	private String hostname;
	private Socket client;

	private Cell[][] cells;

	private int length = ResourceUtils.LENGTH_BOARD;
	private int width = ResourceUtils.WIDTH_BOARD;
	private GridBagConstraints contraints = new GridBagConstraints();
	private GridBagLayout layout = new GridBagLayout();
	private static int i, j;

	/*
	 * order = 1 => X order = 2 => O
	 */
	private int order;

	private boolean isTicked = false;

	private boolean haveWinner = false;

	private int playerWin = 0;

	public CaroClient(String host, int order) {
		super("Client " + order);
		this.order = order;

		hostname = host;

		Container container = getContentPane();
		container.setLayout(layout);
		contraints.fill = GridBagConstraints.BOTH;
		cells = new Cell[length][width];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				contraints.gridx = i;
				contraints.gridy = j;
				contraints.weightx = 2;
				contraints.weighty = 2;
				cells[i][j] = new Cell(false);
				layout.setConstraints(cells[i][j], contraints);
				cells[i][j].setIcon(new ImageIcon(ResourceUtils.BACKGROUND_CELL));
				container.add(cells[i][j]);

				cells[i][j].addActionListener(this);
			}
		}

		setJMenuBar(createJMenuBar());

		setSize(45 * ResourceUtils.LENGTH_BOARD, 45 * ResourceUtils.WIDTH_BOARD);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JMenuBar createJMenuBar() {
		JMenuBar mb = new JMenuBar();
		String[] help = { "Help", "", "About" };
		mb.add(createJMenu("Help", help, KeyEvent.VK_H));
		return mb;
	}

	private JMenu createJMenu(String menuName, String itemName[], int key) {
		JMenu m = new JMenu(menuName);
		m.addActionListener(this);
		m.setMnemonic(key);

		for (int i = 0; i < itemName.length; i++) {
			if (itemName[i].equals("")) {
				m.add(new JSeparator());
			} else {
				m.add(createJMenuItem(itemName[i]));
			}
		}

		return m;
	}

	private JMenuItem createJMenuItem(String itName) {
		JMenuItem mi = new JMenuItem(itName);
		mi.addActionListener(this);
		return mi;
	}

	public void run() {
		try {
			connectToServer();
			getStreams();
			processConnection();
			closeConnection();
		} catch (EOFException e) {
			System.out.println("Server terminated connection !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void connectToServer() {
		try {
			client = new Socket(InetAddress.getByName(hostname), 5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getStreams() throws IOException {
		output = new ObjectOutputStream(client.getOutputStream());
		output.flush();
		input = new ObjectInputStream(client.getInputStream());
	}

	private void processConnection() throws IOException {
		do {
			try {
				message = (String) input.readObject();
				if (message.length() == 1) {
					playerWin = Integer.parseInt(message);
				} else {
					int i = getI();
					int j = getJ();
					int _order = getOrder();
					cells[i][j].setStatus(true);

					if (_order == 1) {
						cells[i][j].setIcon(new ImageIcon(ResourceUtils.ICON_X));
						cells[i][j].setValue(1);
					} else if (_order == 2) {
						cells[i][j].setIcon(new ImageIcon(ResourceUtils.ICON_O));
						cells[i][j].setValue(2);
					}

					isTicked = false;

					playerWin = checkWin(i, j);
					if (playerWin != 0) {
						JOptionPane.showMessageDialog(CaroClient.this, "Client " + playerWin + " win !");
						haveWinner = true;

						StringBuffer buffer = new StringBuffer(1024);
						buffer.append(playerWin);
						sendData(buffer.toString());

						break;
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	private void closeConnection() throws IOException {
		output.close();
		input.close();
		client.close();
	}

	private void sendData(String message) {
		try {
			System.out.println("Receive from server " + message);
			output.writeObject(message);
			output.flush();
		} catch (IOException e) {
			System.err.println("Error while write Object !");
		}
	}

	public synchronized void actionPerformed(ActionEvent event) {
		if (playerWin != 0) {
			JOptionPane.showMessageDialog(CaroClient.this, "Client " + playerWin + " win ! Game finished !");
		} else {
			StringBuffer buffer = new StringBuffer(1024);
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < width; j++) {
					/*
					 * button isTiked or client clicked 2 times --> invalid
					 */
					if (cells[i][j] == event.getSource() && (cells[i][j].isStatus() == true || isTicked == true)) {
						JOptionPane.showMessageDialog(CaroClient.this, "Not your turn !");
					} else if (cells[i][j] == event.getSource() && order == 1 && cells[i][j].isStatus() == false) {
						// client 1
						cells[i][j].setIcon(new ImageIcon(ResourceUtils.ICON_X));
						cells[i][j].setStatus(true);
						cells[i][j].setValue(1);

						// send message to server
						buffer.append(i).append(",").append(j).append(",").append(order);
						sendData(buffer.toString());
						isTicked = true;

					} else if (cells[i][j] == event.getSource() && order == 2 && cells[i][j].isStatus() == false) {
						// client 2
						cells[i][j].setIcon(new ImageIcon(ResourceUtils.ICON_O));
						cells[i][j].setStatus(true);
						cells[i][j].setValue(2);

						// send message to server
						buffer.append(i).append(",").append(j).append(",").append(order);
						sendData(buffer.toString());
						isTicked = true;

					}
					cells[i][j].setAutoscrolls(false);
					cells[i][j].setRolloverEnabled(false);
				}
			}
		}
	}

	public int getI() {
		String i = message.substring(0, message.indexOf(","));
		try {
			int positionRow = Integer.parseInt(i);
			return positionRow;
		} catch (Exception e) {
			return -1;
		}
	}

	public int getJ() {
		String j = message.substring(message.indexOf(",") + 1, message.lastIndexOf(","));
		try {
			int positionCol = Integer.parseInt(j);
			return positionCol;
		} catch (Exception e) {
			return -1;
		}
	}

	public int getOrder() {
		String stt = message.substring(message.lastIndexOf(",") + 1);
		try {
			int _order = Integer.parseInt(stt);
			return _order;
		} catch (Exception e) {
			return -1;
		}
	}

	private int checkWin(int row, int col) {
		int[][] rc = { { 0, -1, 0, 1 }, { -1, 0, 1, 0 }, { 1, -1, -1, 1 }, { -1, -1, 1, 1 } };
		int i = row, j = col;
		for (int direction = 0; direction < 4; direction++) {
			int count = 0;
			System.out.println("[" + direction + "]-" + "[" + row + "," + col + "]  ");

			i = row;
			j = col;
			while (i > 0 && i < cells.length && j > 0 && j < cells.length
					&& cells[i][j].getValue() == cells[row][col].getValue()) {
				count++;
				if (count == 5) {
					return cells[row][col].getValue();
				}
				System.out.print("\t[" + i + "," + j + "]  ");
				i += rc[direction][0];
				j += rc[direction][1];
				System.out.println("--->[" + i + "," + j + "]  ");
			}
			System.out.println("\tcount1 : " + count);

			count--;
			i = row;
			j = col;
			while (i > 0 && i < cells.length && j > 0 && j < cells.length
					&& cells[i][j].getValue() == cells[row][col].getValue()) {
				count++;
				if (count == 5) {
					return cells[row][col].getValue();
				}
				System.out.print("\t[" + i + "," + j + "]  ");
				i += rc[direction][2];
				j += rc[direction][3];
				System.out.println("--->[" + i + "," + j + "]  ");
			}
			System.out.println("\tcount : " + count);
		}
		return 0;
	}
}