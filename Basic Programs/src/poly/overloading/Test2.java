package poly.overloading;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=4;i++){
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter Your Product Name");
		String pName=sc.next();
		pName+=sc.nextLine();
		}
		
	}
}
