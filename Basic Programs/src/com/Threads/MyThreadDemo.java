package com.Threads;

class MyThread2 implements Runnable
{
 public void run()
 {
  System.out.println("concurrent thread started running.."+Thread.currentThread().getId());
 }
}
class MyThreadDemo
{
 public static void main( String args[] )
 {
  MyThread2 mt = new MyThread2();
  Thread t = new Thread(mt);
  Thread t1 = new Thread(mt);
  t.start();
  t1.start();
 }
}