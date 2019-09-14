package com.Threads;
class Test5 implements Runnable
{
  public void run()
   {
	  System.out.println(Thread.currentThread());
	 Thread.currentThread().setName("sandeep");
	 Thread.currentThread().setPriority(10);
	  System.out.println(Thread.currentThread());
	 
   for(int i=0;i<10;i++)
    System.out.println("thread");
 }
}//1-10
class MyThread
{
public static void main(String args[])//main thread
{
	Test5 t=new Test5();
	Thread t1=new Thread(t);
	System.out.println(Thread.currentThread());
	t1.start();//run
	
}
}