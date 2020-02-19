package com.Exceptions;//our class should extends exception,Throwable
import java.util.Scanner;
//parameterized constructor
class InvalidUserexception extends Throwable {
	public InvalidUserexception(String errorMsg) {
		super(errorMsg);
	}}
public class Exception6 {
	static void validation(String uname, String pass)
			throws InvalidUserexception {
		if (uname.equals("anurag") && pass.equals("capgemini"))

			System.out.println("Login Success"); // obj
		else
			throw new InvalidUserexception("Enter valid Credentials");// MyException1
	}
	public static void main(String args[]) throws InvalidUserexception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username :");
		String user = sc.next();
		System.out.println("Enter password :");
		String pwd = sc.next();
		Exception6.validation(user, pwd);
		System.out.println("rest of the code...");
	}
}