
public class Emp1 
{
int eid;
String name;
int sal;
int age;
Address a;
public Emp1(int eid, String name, int sal, int age, Address a) {
	super();
	this.eid = eid;
	this.name = name;
	this.sal = sal;
	this.age = age;
	this.a = a;
}

	public String toString() {
		
		return " empid:"+eid+" empname:"+name+" esal:"+sal+"  emp age:"+age+" Address:"+a;
	}

}
