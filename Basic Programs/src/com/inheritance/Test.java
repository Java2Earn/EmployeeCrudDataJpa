package com.inheritance;
class Address
{
String colony;
String city;
String state;
String country;
public Address(String colony, String city, String state, String country) 
{
	this.colony = colony;
	this.city = city;
	this.state = state;
	this.country = country;	
}
public String toString() {
	return "  colony  : " +colony+" city : "+city+" state :  "+state+" country : "+country;
}
}
class Employee
{
	int eid;
	String ename;
	String fname;
	int esal;
	Address address;
	public Employee(int eid, String ename, String fname, int esal,
			Address address) {
		this.eid = eid;
		this.ename = ename;
		this.fname = fname;
		this.esal = esal;
		this.address = address;
		System.out.println(eid+"  "+ename+"  "+fname+"  "+esal+"   "+address);
	}	
}
public class Test 
{	
	public static void main(String[] args) 
	
	{
		Address a=new Address("hitechcity","hyderabad","telangana","India");
		Employee e=new Employee(1,"usman","a",900000,a);
		Employee e1=new Employee(2,"siva","s",800000,a);
		Employee e2=new Employee(3,"teja","k",900000,a);
		Employee e3=new Employee(4,"ravi","m",700000,a);
	}

}
