package ThisSuper;
class SuperEx1
{
	void m1()
	{
		System.out.println("welcome");
	}
	}
public class ThisEx1 extends SuperEx1
{
 void method()
 {
	 System.out.println(this);//this.m1(),this(),this.a,this
 }
	public static void main(String[] args) 
	{
		ThisEx1 t=new ThisEx1();
		System.out.println(t);
		t.method();
	}

}
