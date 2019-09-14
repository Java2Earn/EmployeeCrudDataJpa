package com.Threads;
class TestJoin extends Thread
{  
	 public void run()
	 {  
	  for(int i=1;i<=5;i++)
	  {  
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]) throws InterruptedException 
	{  
	 TestJoin t1=new TestJoin();  
	 TestJoin t2=new TestJoin();  
	 TestJoin t3=new TestJoin();
	 t1.start();  
	 
	 t1.join();
	 t2.start(); 
	 t3.start();  
	 }  
	}  