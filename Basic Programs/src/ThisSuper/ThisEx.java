package ThisSuper;
class Emp
{ int eid;
    String ename;
    Emp()
    {
	System.out.println("default constructor");
	} 
    Emp(String a)
    {this();
	System.out.println("single param constructor");
	} 
  Emp(int eid,String ename)
    {
	  this("10");
	  this.eid=eid;
	  this.ename=ename;
	  System.out.println("parameterized constructor");
     }}
public class ThisEx 
{public static void main(String[] args) 
	{	
		Emp e=new Emp(1,"sandeep");		
	}}
