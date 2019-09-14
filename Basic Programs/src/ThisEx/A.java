package ThisEx;
public class A 
{
	int a;
	int b;
	A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void m1()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
	A a=new A(12,13);
	a.m1();
	}
}