package com.Exceptions;
class Exception2 {
	public static void main(String[] args) {
		try {
			int a1 =10;
			int b=2;
			int c=a1/b;
			System.out.println("division "+c);
		}catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		try
		{
		int a[]=new int[5];//0...4
		a[5]=7;
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);}//a[0],a[1]
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index  maximum size is 4");
		}
		System.out.println("remaining lines of code");
	}
}