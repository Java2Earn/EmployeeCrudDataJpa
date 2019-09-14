
class Welcome12
{
	void m1()
	{
		System.out.println("welcome12 class method");
	}
	}
public class Welcome123 extends Welcome12
{
	 void m1()
	{
		System.out.println("welcome123 class method");
	}

	public static void main(String[] args) {
		Welcome123 w=new Welcome123();
		w.m1();
	}
	
}
