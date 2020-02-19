package ThisSuper;
class ParentEx {
	static int a=10;	
	public ParentEx() {
		this(122);
		System.out.println("dafault constructor of parent");}
	ParentEx(int a) 
	{   //this();
		System.out.println("Parent class parameterized constuructor"+a);
	}
	public void m1()
	{System.out.println("parent class method");}}
class SuperEx  extends ParentEx
{static	int a=20;
	SuperEx() 
	{	//super();
		super.m1();
		this.m1();
		System.out.println(this.a);//20
		System.out.println(super.a);//10
		System.out.println(this);//heap area address
		System.out.println("child class constuructor");}
	public void m1()
	{System.out.println("child class method");}
	public static void main(String args[]) 
	{
		SuperEx e=new SuperEx();
		System.out.println(e);//null
		ParentEx p= new ParentEx(112);	}}