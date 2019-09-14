import java.util.Scanner;

public class ArgsEx
{
	public static void main(String args[])
	{	
		System.out.println("Welcome to Bank Application");
		System.out.println("1.Register");
		System.out.println("2.Login");
	Scanner sc=new Scanner(System.in);
	System.out.println("select 1 for REGISTER and 2 for LOGIN:");
	int option=sc.nextInt();
	
	switch(option)
	{
	case 1:
		System.out.println("register here");
		break;
	case 2:
	System.out.println("login");
		break;
	}
	
	
	}
	
} 