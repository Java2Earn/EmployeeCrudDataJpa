package WrapperClasses;
public class AutoBoxingEx {
	public static void main(String[] args) 
	{	
		
		int a=20;
		Integer a1=new Integer(a);//boxing
		Integer a2=a;//auto-boxing
		System.out.println(a1);
		System.out.println(a2);
		
		Integer i=new Integer(12);
		//System.out.println(i);
		int a3=i.intValue();//un-boxing
		int a4=Integer.valueOf(i);
		int a5=i;//auto-un-boxing

		System.out.println(a3);
		System.out.println(a4);
	}
}
