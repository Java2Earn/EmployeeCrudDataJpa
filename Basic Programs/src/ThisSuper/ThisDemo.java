package ThisSuper;
class Super
{
int a,b,c;
Super()
{
//this(1,2,3);
a=10;
b=20;
c=a*b;
System.out.println("the value of a is:"+a);
System.out.println("the value of b is:"+b);
System.out.println("the value of a*b is:"+c);
}

Super(int x , int y,int z)
{
System.out.println("the value of a is:"+x);
System.out.println("the value of b is:"+y);
System.out.println("the value of a*b is:"+z);
}

}
class ThisDemo extends Super
{
	ThisDemo()
{
super();
System.out.println("IT IS DERIVED DEFAUILT CONSTRUCTOR");
}
public static void main(String args[])
{

ThisDemo  d  = new ThisDemo();

}
}