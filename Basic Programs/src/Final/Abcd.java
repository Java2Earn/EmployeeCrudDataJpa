package Final;
 class FinalEx
{
 int a=10;
  void add()
{
	a=a+1;
System.out.println("hello"+a);	
}
}

 class xyz extends FinalEx
 {
	 void add()
	 {
		 a=a+2;
		 System.out.println("welcome"+a);
	 }  
 }
 class Abcd extends FinalEx
{
	public static void main(String[] args) 
	{
	Abcd a=new Abcd();
	xyz x=new xyz();
		a.add();	
		x.add();
	}
}














