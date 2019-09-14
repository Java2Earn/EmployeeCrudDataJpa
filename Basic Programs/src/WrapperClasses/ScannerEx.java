package WrapperClasses;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your empid :");
		int eid = sc.nextInt();
		System.out.println("Enter your address");
		String loc = sc.next();
		System.out.println("gender M/F :");
		String gender = sc.next();
		System.out.println(gender);
		char gender1 = gender.charAt(0);
		if(eid==123)
		{
		System.out.println("your complete info : name  " + name + "  eid:  "
				+ eid + "" + " address:  " + loc + "  gender:  " + gender1);
		}else
		{
			System.out.println("Enter valid empid");
		}
		sc.close();
	}}
