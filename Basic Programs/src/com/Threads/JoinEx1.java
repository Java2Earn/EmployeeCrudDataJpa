package com.Threads;

class Test6 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("cild thread");
		}
	}
}
class JoinEx1 {
	public static void main(String args[]) throws InterruptedException {
		Test6 t1 = new Test6();
		t1.start();
		t1.join();
		  for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}

// t1,t2,t3

// t1.join()

//