package com.basc;
class A{
	public void m1(){
		System.out.println("A classmethod");
	}
	    public A() {
	     m1();
			System.out.println("Default Constructor");
		}
	    public A(int s) {
	    	this();
			System.out.println("Parameterized Constructor"+this);
 
	    }
}

public class Test1 {
	

	public static void main(String[] args) {
		
	A a=new A(10);
	
	
	}

}
