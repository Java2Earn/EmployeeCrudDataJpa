package com.pdw.Basic;

class Student
{
//BINDING THE VARIABLES WITH METHODS KOWN AS ENCAPSULATION.
	
private int sid;
private String sname;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}

}

public class EncapsulationEx {

	public static void main(String[] args) 
	{
	Student s=new Student();
	s.setSid(1);
	s.setSname("sandeep");
	System.out.println(s.getSid()+"  " +s.getSname());

	}

}
