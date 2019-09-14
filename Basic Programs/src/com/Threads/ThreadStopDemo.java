package com.Threads;
class Server implements Runnable {
	private volatile boolean exit = false;
	public void run() {
		while (!exit) {
			System.out.println("Server is running.....");
		}
		System.out.println("Server is stopped....");
	}
	public void stop() {
		exit = true;
	}
}
public class ThreadStopDemo {
	public static void main(String args[]) throws InterruptedException {
		Server myServer = new Server();
		Thread t1 = new Thread(myServer, "T1");
		t1.start(); 
	}
}
