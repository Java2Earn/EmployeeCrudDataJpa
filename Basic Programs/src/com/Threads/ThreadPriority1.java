package com.Threads;
class MyThread5 extends Thread
{
public void run()
{
	for(int i=0;i<10;i++)
	{try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();}	
	System.out.println("Child thread");
	}}}
class ThreadPriority1
{
public static void main(String args[]) throws InterruptedException
{
System.out.println(Thread.currentThread().getPriority());//5
MyThread5 t=new MyThread5();
t.start();
for(int i=0;i<10;i++)
{
	Thread.sleep(1000);
System.out.println("main thread");
}
}
}

