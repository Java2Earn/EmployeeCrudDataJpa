package com.Collections;
import java.util.HashSet;
import java.util.Iterator;
class Empl
{	private int eid;
	private String ename;
	private int esal;
	public Empl(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public String toString() {	
		return eid+" "+ename+" "+esal;
	}
	}
public class ArrayListEx2 {
	public static void main(String[] args) {
		Empl e=new Empl(1,"suresh",1234);
		Empl e1=new Empl(2,"naresh",2345);
		Empl e2=new Empl(3,"ramesh",4321);
		HashSet<Empl> al = new HashSet<Empl>();
		al.add(e);
		al.add(e1);
		al.add(e1);
		al.add(e2);
		System.out.println(al);
		Iterator<Empl> emps=al.iterator();
		while(emps.hasNext())
		{
			System.out.println(emps.next());
		}
	
	}

}
