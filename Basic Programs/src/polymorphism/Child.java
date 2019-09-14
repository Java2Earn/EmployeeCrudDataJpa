package polymorphism;
 class Parent
{
void m1()
{
System.out.println("parent m1 method");	
}
}
public class Child extends Parent
{
void m1()
{
System.out.println("child m1 method");	
}
void m2()
{
System.out.println("child m2 method");	
}
	public static void main(String[] args) 
	{
		Parent p=new Child();
		p.m1();
		//compile time it will check parent 
		//class run time it will check in child class
	//	p.m2();
	Child c=(Child)p;
	c.m2();
	}
}
