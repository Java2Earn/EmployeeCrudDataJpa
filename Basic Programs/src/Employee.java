
class CompanyAddress
{	String location="manyata tech park";
	static String area="banglore";
	}
public class Employee 
{
int eid=1;
String ename="abhinav";
 CompanyAddress cadd;//HAS-A 
 void m1()
 	{
	 System.out.println("employee name is :"+ename);
	System.out.println("employee company location :"+cadd.area);
	}
public static void main(String[] args) 
{
	Employee e=new Employee();	
	e.m1();
}
}
