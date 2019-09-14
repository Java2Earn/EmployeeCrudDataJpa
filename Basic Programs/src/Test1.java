class Test1 
{
	int a=129;
	public static final synchronized  void main(String[] args) 
	{
		Test1 t=new Test1();
		System.out.println(t.a);
	}
}