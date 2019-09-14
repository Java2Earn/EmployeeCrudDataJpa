
public class StringEx {
public static void main(String[] args) {
	String s="sandeep";
	String s1="sandeep";//once
	String s3=new String("sandeep");
	String s4=new String("sandeep");
	String s2=new String("Syed");
	
	System.out.println(s.equals(s1));//true
	System.out.println(s.equals(s2));//false
	System.out.println(s.equals(s3));//true
	System.out.println(s==s1);//true
	System.out.println(s==s3);//false
	System.out.println(s3==s4);//false
	
}
}
