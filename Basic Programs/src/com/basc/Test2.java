package com.basc;
abstract class Welcome1
{
abstract void m3();
}
interface Welcome
{
	void m1();//public abstract void m1();
    void m2();
}
 class Test2 implements Welcome // try with extends abstract class 
{
public static void main(String[] args) {
	Test2 t=new Test2();
	t.m1();
	t.m2();
}
public void m1() {
System.out.println("interface m1 method");
}
public void m2() {
	System.out.println("interface m2 method");
}
}
