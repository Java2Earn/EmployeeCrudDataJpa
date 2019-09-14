
package com.Threads;

class A1 {
 public synchronized void display(B1 b)
 {
	 System.out.println("thread-1 starts execution of display");
	 try{
		 Thread.sleep(4000);
	 }catch(InterruptedException ie)
	 {
		 System.out.println(ie);
	 }
	 System.out.println("Thread-1 trying to call B1's print method");
	 b.print();
 }
	public synchronized void print()
	{
		System.out.println("A class print method");
	}
}
class B1 {
	 public synchronized void show(A1 a)
	 {
		 System.out.println("thread-2 starts execution of B1 show method");
		 try{
			 Thread.sleep(4000);
		 }catch(InterruptedException ie)
		 {
			 System.out.println(ie);
		 }
		 System.out.println("Thread-2 trying to call A's print method");
		 a.print();
	 }
		public synchronized void print()
		{
			System.out.println("B1 class print method");
		}
	}

public class DeadLock1 extends Thread
{
	A1 a=new A1();
	B1 b=new B1();
	public void m1() {
		this.start();
		a.display(b);//main thread
	}
	public void run()
	{
		b.show(a);//child thread
	}
	public static void main(String[] args) {
	
	DeadLock1 d=new DeadLock1();
	d.m1();
	}
	}