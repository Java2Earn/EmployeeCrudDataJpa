package com.Exceptions;
class Cal {
	public void div(String a, String b) throws Exception
			 {
		int c = Integer.parseInt(a) / Integer.parseInt(b);
		System.out.println(c);
	}
}
public class ThrowsEx1 {
	public static void main(String[] args) {
		Cal ob = new Cal();
					try {
						ob.div("10","2");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		
		
	}
}