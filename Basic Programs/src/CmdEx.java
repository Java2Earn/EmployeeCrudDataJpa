import java.util.Scanner;

public class CmdEx 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your empid");
		int eid=sc.nextInt();
		System.out.println("enter your username");
				String uname=sc.next();
		System.out.println("enter your password");
				String pwd=sc.next();
				if(uname.equals("sandeep")&&pwd.equals("sandeep@123"))
					System.out.println("Login Success");
				else
					System.out.println("please enter valid username and password");
				sc.close();
	}
}