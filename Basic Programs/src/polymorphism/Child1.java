package polymorphism;
class Parent1
{
static 	void properties()
	{
		System.out.println("100 crores properties");
	}
static	void marriage()
	{
		System.out.println("x");
	}
}
public class Child1 extends Parent1
{
	static void marriage()
	{
		System.out.println("apra");
	}
	public static void main(String[] args) 
	{
		Child1 ch=new Child1();
		ch.properties();
		Child1.marriage();
	}
}
