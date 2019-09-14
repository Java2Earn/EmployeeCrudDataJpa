package second.pack;
public class SecondTest 
{
	public static void main(String[] args) 
	{
		//literal immutable
		String s="ibm";
	
		String s1="IBM India";
		
		//using new keyword
		String s2=new String("ibm");
		
		System.out.println(s.equalsIgnoreCase(s1));//false
		System.out.println(s==s1);
		System.out.println(s==s2);//false
		System.out.println(s1.compareTo(s));//0
	System.out.println(s1.toUpperCase());
		
		
		
		
		
		
	}
}
