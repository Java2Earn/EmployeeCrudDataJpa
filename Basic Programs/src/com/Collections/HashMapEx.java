package com.Collections;

import java.util.HashMap;
import java.util.Scanner;
class Employee3{
	int eid;
	String ename;
	int esal;
	public Employee3(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee Info :id=" + eid + ", ename=" + ename + ", esal=" + esal
		;
	}
}
public class HashMapEx {
public static void main(String[] args) {
	Employee3 e=new Employee3(23,"sandeep",1000);
	Employee3 e1=new Employee3(223,"suresh",3000);
	Employee3 e2=new Employee3(423,"ramesh",4000);
	Employee3 e3=new Employee3(523,"naresh",6000);
	HashMap<String,Employee3> hm=new HashMap<String,Employee3>();
	hm.put("9494348734",e);
	hm.put("9866502069",e1);
	hm.put("9866602069",e2);
	hm.put("9866702069",e3);
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter mobile number");
	String mobileNo=sc.next();
	Employee3 emp=	hm.get(mobileNo);
	System.out.println("Your Old sal:"+emp.esal);
	System.out.println("Your Updated sal:"+(emp.esal+1000));
	
	}
}
