package controller;

import java.io.*;
import java.net.*;

public class CaroServer {
	private ServerSocket socketOfServer;
	private User user1, user2;

	public CaroServer() {
		System.out.println("Server started !");
	}

	public void runServer() {
		try {
			socketOfServer = new ServerSocket(5000, 2);

			while (true) {
				try {
					user1 = new User(socketOfServer.accept(), "user1");
					System.out.println("Client 1 connected successfully !");

					user2 = new User(socketOfServer.accept(), "user2");
					System.out.println("Client 1 connected successfully !");

					while (true) {
						user1.start();
						user2.start();
					}
				} catch (Exception e) {
				}
			}
		} catch (EOFException e) {
			System.out.println("Client disconnected !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		CaroServer server = new CaroServer();
		server.runServer();
	}

	// create thread for every user connected
	private class User extends Thread {
		private Socket socketOfServer;
		private ObjectInputStream input;
		private ObjectOutputStream output;
		String name;

		public User(Socket socket, String name) {
			socketOfServer = socket;
			this.name = name;
			try {
				input = new ObjectInputStream(socketOfServer.getInputStream());
				output = new ObjectOutputStream(socketOfServer.getOutputStream());
			} catch (IOException e) {
				System.exit(1);
			}
		}

		public ObjectInputStream getObjectInputStream() {
			return this.input;
		}

		public ObjectOutputStream getObjectOutputStream() {
			return this.output;
		}

		public synchronized void changeTurn(User userA, User userB) {
			try {
				StringBuffer st = new StringBuffer();
				String data = userA.getObjectInputStream().readObject().toString();
				st.append(data);

				userB.getObjectOutputStream().writeObject(data);
			} catch (Exception e) {
			}
		}

		public void run() {
			while (true) {
				if (name.equals("user1")) {
					changeTurn(this, user2);
				} else {
					changeTurn(this, user1);

				}
			}
		}
	}
}
