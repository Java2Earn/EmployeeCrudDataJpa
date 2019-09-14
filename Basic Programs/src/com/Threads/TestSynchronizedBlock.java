package com.Threads;
class PrintVal
{  
	 void print(int n){  
	   synchronized(this){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
	}   
	class MyThread11 extends Thread{  
		PrintVal p;  
	MyThread11(PrintVal p){  
	this.p=p;  
	}  
	public void run(){  
	p.print(5);  
	}   
	}  
	class MyThread12 extends Thread{  
		PrintVal p;  
	MyThread12(PrintVal p){  
	this.p=p;  
	}  
	public void run(){  
	p.print(100);  
	}  
	}  
	public class TestSynchronizedBlock{  
	public static void main(String args[]){  
		PrintVal obj = new PrintVal();//only one object  
	MyThread11 t1=new MyThread11(obj);  
	MyThread12 t2=new MyThread12(obj);  
	t1.start();  
	t2.start();  
	}  
	}  