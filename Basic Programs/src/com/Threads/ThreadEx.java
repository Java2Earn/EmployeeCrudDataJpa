package com.Threads;

class ThreadE implements Runnable
{
	public void run() 
	{
	//	Thread.currentThread().setName("mythread");
		System.out.println(Thread.currentThread());	
		System.out.println("user created therad");
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("sandeep");
		System.out.println(Thread.currentThread());	
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class ThreadEx 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("mainThread");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread());
		ThreadE t1=new ThreadE();
		Thread t=new Thread(t1);
		t.start();
	}
}
