package com.ControlStatements;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int r, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");//121
		int n = sc.nextInt();
		int t = n;
		while (n > 0) //121>0 true
		{
			r = n % 10;// 121%10==>r=1  //12%10==>r=2  // 1%10==>r=1
			n = n / 10;// 121/10==>n=12  // 12/10 n==>1  //1/10
			s = s * 10 + r;//0*10+1==>s=1  //1*10+2==>s=12 //12*10+1==>121
		}
		if (t == s)
			System.out.println("given number is palindrome");
		else
			System.out.println("given number is not palindrome");
	}

}
