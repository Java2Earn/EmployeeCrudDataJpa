package com.Threads;

public class DeamonThreadEx extends Thread{

	   public void run(){  
			
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing");  
		  }  
		  else{  
		      System.out.println("user(normal) thread executing");  
	          }  
	   }  
	   public static void main(String[] args){  
		 DeamonThreadEx t1=new DeamonThreadEx();
		 DeamonThreadEx t2=new DeamonThreadEx();   
	        t1.setDaemon(true);
	        t1.start(); 
	        t2.start();  
	   } 
	}
