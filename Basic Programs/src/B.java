class B {
	public static void main(String args[]) {

		String s="suresh ";//immutable
			s.concat("welcome");//suresh welcome
		System.out.println(s);
		
		
		StringBuffer sb=new StringBuffer("suresh");
		sb.append(" welcome to capgemini");
		System.out.println(sb);
	}
}
