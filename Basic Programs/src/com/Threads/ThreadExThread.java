package com.Threads;
class Test7 extends Thread
{
  public void run()
   {
	  System.out.println(Thread.currentThread());
	  Thread.currentThread().setPriority(1);
	  Thread.currentThread().setName("sandeep");
	  System.out.println(Thread.currentThread().getName());
	  System.	 out.println(Thread.currentThread());
   for(int i=0;i<10;i++)
    System.out.println("child thread");
 }
}
public class ThreadExThread
{
public static void main(String args[])
{
	
	System.out.println(Thread.currentThread());
	Thread.currentThread().setName("ibm");
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread());
	Test7 t=new Test7();
	t.start();
	
for(int i=0;i<10;i++)
   {
   System.out.println("main thread");
    }
}
}