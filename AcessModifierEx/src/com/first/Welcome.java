package com.first;
class A {//
	 int a = 123;
 public void add() {
		a = ++a;
		int b = 11;
		System.out.println(a + b);
	}}
public class Welcome extends A {
	@Override
	public void add() {
		a = --a;
		int b = 11;
		System.out.println(a + b);
	}
	public static void main(String args[]) {
		
		System.out.println("updated in GIT");
		Welcome e = new Welcome();
		e.add();
	}}