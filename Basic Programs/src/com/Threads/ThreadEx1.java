package com.Threads;


class ThreadEx1 implements Runnable 
{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());//10
		Thread.currentThread().setPriority(5);
		Thread.currentThread().setName("sandeep");
		System.out.println(Thread.currentThread());//10
		System.out.println(Thread.currentThread().isAlive());
		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread");
		}
	}
	public static void main(String args[]){
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread());//5
		Thread.currentThread().setName("mainThread");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread());//10
		ThreadEx1 tx = new ThreadEx1();
		Thread t=new Thread(tx);
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main Thread");
		}
	}
}
