package com.ControlStatements;

 class A
{
	public void show(int a)
	{
		System.out.println("the value of a is : "+a);
		
	}
  void show(int ... a)//var args method
  {
	  for(int i:a)
	  System.out.println("variable arguments are like : "+i);
  }
}
public class VarArgsEx {

	public static void main(String[] args)
	{
		A a=new A();
		a.show(1);
		

	}
	

}
