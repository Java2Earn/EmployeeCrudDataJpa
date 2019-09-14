package com.jvm;
class Student 
{
	public String getName()
	{
		return null;
	}
	public int getRollno()
	{
		return 10;
	}
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException 
	{
		/*Student s=new Student();
		Class c=s.getClass();
		System.out.println(c);
		Student s1=new Student();
		Class c1=s.getClass();
		System.out.println(c1);
		System.out.println(c1.hashCode()+" "+c.hashCode());
		*/
	/*	int count=0;
		Class c=Class.forName("com.jvm.Student");
		Method []m=c.getDeclaredMethods();
		Constructor name=c.getDeclaredConstructor();
		System.out.println(name);
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);	*/
	}

}
