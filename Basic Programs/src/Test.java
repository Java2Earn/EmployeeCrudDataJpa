abstract class A
{
}
public class Test
{
	byte c=100;
	int a=100;
	 float b=a;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Test t= new Test();
		t.display();
	}
}