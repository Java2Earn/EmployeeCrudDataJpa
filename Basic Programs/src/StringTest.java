
public class StringTest {
public static void main(String[] args) {
	String s="ibm";//scp  ibm--->s
	String s1="ibm1";//	ibm1--->s1
	String s2=new String("ibm");//heap
	
	System.out.println(s.equals(s1));//true
	System.out.println(s==s1);//true
	System.out.println(s.equals(s2));//true
	System.out.println(s==s2);//false

	
	
	
}
}
