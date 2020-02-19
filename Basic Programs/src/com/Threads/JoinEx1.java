package com.Threads;

class Test6 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("cild thread");
			yield();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}}}
class JoinEx1 {
	public static void main(String args[]) throws InterruptedException {
		Test6 t1 = new Test6();
		t1.start();
	
		  for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
