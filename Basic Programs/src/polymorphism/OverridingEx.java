package polymorphism;
class Xyz
{
	void qwerty()
	{
		System.out.println("Hello");
	}
	void qwerty1()
	{
		System.out.println("welcome");
	}
}
public class OverridingEx extends Xyz
{
    void qwerty()
    {
    	System.out.println("hai");
    }
	 public static void main(String[] args) 
	{
		System.out.println("String arg");
		OverridingEx oe=new OverridingEx();
		oe.qwerty();
		oe.qwerty1();
	}

}
