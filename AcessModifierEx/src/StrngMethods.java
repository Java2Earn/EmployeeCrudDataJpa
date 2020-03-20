public class StrngMethods {
	public static void main(String[] args) {

		String s="welcome";//immutable
		String s1="to ibm";
		String s3=s.concat(s1);
		System.out.println(s3);
		
		
		StringBuffer sb=new StringBuffer("welcome");//mutable
		sb.append(" to ibm");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("welcome");//mutable
		sb1.append(" to ibm");
		System.out.println(sb1);
		
		
		/*String s="ibm banglore";
		String s1="IBM";
		String s2=new String("ibm");
		System.out.println(s.equals(s1));//false
		System.out.println(s.equals(s2));//true
		System.out.println(s==s1);//false
		System.out.println(s==s2);//false
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		String a="x";
		String b="z";
		System.out.println(b.compareTo(a));
	*/
	}
}
