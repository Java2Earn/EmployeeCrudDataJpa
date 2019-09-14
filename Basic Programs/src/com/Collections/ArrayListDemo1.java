package com.Collections;

import java.util.ArrayList;
class Emp{
	int eid;
	String ename;
	int esal;
	public Emp(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	
}
public class ArrayListDemo1 {
	public static void main(String[] args) {
	Emp e=new  Emp(123,"qwerty",1200);
	Emp e1=new  Emp(124,"suresh",12000);
	Emp e2=new  Emp(125,"ramesh",12030);
	Emp e3=new  Emp(126,"naresh",1202);
	ArrayList al=new ArrayList();
	al.add(e);al.add(e1);al.add(e2);al.add(e3);
	System.out.println(al);
	
	}
}
