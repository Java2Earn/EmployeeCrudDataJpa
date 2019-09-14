class Test8{
	void m1()
	{
		System.out.println("m1 method of Test8 class");
	}
}
class Test9 extends Test8{
	void m2()
	{
		System.out.println("m2 method of Test9 class");
	}
}
public class Test7 extends Test8
{
	public static void main(String[] args) {
		Test7 t=new Test7();
		t.m1();
		Test9 t1=new Test9();
		t1.m1();t1.m2();
	}
}
