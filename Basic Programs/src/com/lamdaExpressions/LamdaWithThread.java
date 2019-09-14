package com.lamdaExpressions;

public class LamdaWithThread {
	public static void main(String args[]) {
		Runnable r=()->{
			System.out.println(Thread.currentThread());
			for (int i = 0; i <= 5; i++) {
				System.out.println("Child Thread");}};
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main Thread");
		}
		System.out.println(Thread.currentThread());
	}
}
