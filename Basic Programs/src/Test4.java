
class T {
int a=123;
void m1()
{
a=++a;
System.out.println(a);
}
}
public class Test4 extends T
{
	void m1()
	{
	a=a+2;
	System.out.println(a);
	}
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.m1();
	}
	
	
	}
