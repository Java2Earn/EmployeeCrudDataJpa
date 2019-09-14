package poly.overloading;
class Parent
{
	public void m1()
	{
		System.out.println("Parent class m1 method");
	}
	public void m2()
	{
		System.out.println("Parent class m2 method");}}
class Test1 extends Parent
{
	public void m2()
	{
		System.out.println("Test class m2 method");}
	public void m3()
	{
		System.out.println("Test class m3 method");}
	public static void main(String[] args) {
		Test1 t=new  Test1();
		t.m1();
		t.m2();t.m3();
	}}