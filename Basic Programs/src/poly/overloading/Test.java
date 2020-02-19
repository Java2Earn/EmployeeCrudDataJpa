package poly.overloading;
class A {
	static void add() {
		System.out.println("default method");
	}
	static void add(int a, int b) {
		System.out.println("addition of two numbers(int) is: " + (a + b));
	}
	static void add(float a,float b) {
		System.out.println("addition of two numbers(float) is: " +(a + b));
	}
	static void add(int a,float b) {
		System.out.println("addition of two numbers(int,float) is: "+(a + b));
	}
	static	void add(float a,int b) {
		System.out.println("addition of two numbers(float,int) is: "+(a + b));
	}}
class Test {
	public static void main(String[] args) {
		A.add();
		A.add('v','h');
		A.add(12.123f,20.12f);
		A.add(12.9f,20);
		A.add(12,20.14f);}}
/*
byte-->short-->int-->long-->float-->double
		||
		char */

