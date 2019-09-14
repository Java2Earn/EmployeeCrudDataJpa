package java8.features;
class OuterClass
{
	void m1()
	{
		System.out.println("Welcome");
	}
	public static void main(String args[])
	{
		OuterClass oc=new OuterClass();
		oc.m1();
		OuterClass.InnerClass i=oc.new InnerClass();
		i.m1();
	}
	class InnerClass
	{
	void m1()
	{
		System.out.println("Hello");
	}	
	}
}