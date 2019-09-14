package com.Threads;
class Test1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			Thread.yield();
			System.out.println(Thread.currentThread());
		}
	}
}
class YieldEx1 {
	public static void main(String args[]) {
	
		Thread t = new Thread();
		t.setPriority(1);
		System.out.println(Thread.currentThread());
		
		
		Test1 t1 = new Test1();
		Thread.currentThread().setPriority(10);
		
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}