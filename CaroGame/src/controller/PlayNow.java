package controller;

import javax.swing.JFrame;


public class PlayNow {
	public static void main(String args[]) {
		CaroClient caroClient;
		if (args.length == 0) {
			caroClient = new CaroClient("127.0.0.1", 2);
		} else {
			caroClient = new CaroClient(args[0], 1);
		}
		Thread t = new Thread(caroClient);
		t.start();
	}
}
