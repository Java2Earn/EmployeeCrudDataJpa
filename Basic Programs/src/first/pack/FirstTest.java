package first.pack;

 class Test 
{
	void m1()
	{
		System.out.println("default method");
	}
private	void m2()
	{
	System.out.println("private method");
	}
public 	void m3()
{
	System.out.println("public method");
}
protected void m4()
{
	System.out.println("protected method");
}
}
 
public class FirstTest extends Test
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1();
		t.m3();
		t.m4();
	}
}


