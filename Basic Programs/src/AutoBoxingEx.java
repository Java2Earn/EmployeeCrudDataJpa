public class AutoBoxingEx 
{
public static void main(String[] args) {

	int a=10;//4 bytes
	//boxing
	Integer a1=new Integer(a);
	a1.valueOf(a);
	System.out.println(a1);
	//auto boxing
	Integer a2=a;
	
	
	System.out.println("a2 value is"+a2);
	Integer i=new Integer(20);
	//un-boxing
	int x=i.intValue();
	System.out.println(x);
	//auto un-boxing
	int y=i;
}
}
