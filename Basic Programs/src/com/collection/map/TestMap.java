package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Employee {
	private String ename;
	private String eadd;
	private int esal;
	public Employee(String ename, String eadd, int esal) {
		super();
		this.ename = ename;
		this.eadd = eadd;
		this.esal = esal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return  ename + "           " + eadd
				+ "           " + esal;
	}}
public class TestMap {
	public static void main(String[] args) {
		Employee e1=new Employee("suresh", "hyd", 90000);
		Employee e2=new Employee("naresh", "delhi", 12000);
		Employee e3=new Employee("ramesh", "mumbai", 20000);
		Employee e4=new Employee("rajesh", "chennai", 10000);
		Employee e5=new Employee("akash", "hyd", 100);
		HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
		hm.put(1, e1);
		hm.put(3, e2);
		hm.put(2, e3);
		hm.put(4, e4);
		hm.put(5, e5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Application");
		System.out.println("1.Emp Info");
		System.out.println("2.Update Emp Salary");
		System.out.println("3.Display All Employees");
		System.out.println("4.Delete Empolyee");
		System.out.println("5.Add Empolyee");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter Empid to see empinfo!!!");
			int eid=sc.nextInt();
			Employee  result=hm.get(eid);
			//Employee e=(Employee) result;
			System.out.println(result);	
			break;
		case 2:
			System.out.println("Enter Empid to update Emp Salary !!!");
			int eid1=sc.nextInt();
			Object  result1=hm.get(eid1);
			Employee emp=(Employee) result1;//20000
			System.out.println("your  old salary :"+emp.getEsal());
			System.out.println("Enter salary to update!!!");
			int esal=sc.nextInt();//30000
			emp.setEsal(esal);
			System.out.println("Your updated Emp Info!!!! "+emp);
			break;
		case 3:
			Set set=hm.entrySet();
		Iterator itr=set.iterator();
		System.out.println("Empid     Empname    Address     salary    " );
		while(itr.hasNext()){
			Entry employees=(Entry) itr.next();
			
			System.out.println(employees.getKey()+"   "+employees.getValue() );
			}
			break;
		case 4:
			
			System.out.println("Enter Empid to Delete Emp !!!");
			int eid2=sc.nextInt();
			hm.remove(eid2);
			System.out.println("After Delete......");
			System.out.println(hm);
			break;
		case 5:
			System.out.println(hm);
			System.out.println("Enter Empinfo To Add  !!!");
			System.out.println("enter emp id");
			int key=sc.nextInt();
			System.out.println("enter emp name");
			String ename=sc.next();
			System.out.println("enter emp Address");
			String address=sc.next();
			System.out.println("enter emp  salary");
			int salary=sc.nextInt();
			Employee newEmp=new Employee(ename, address, salary);
			hm.put(key,newEmp);
			System.out.println("After Adding New Employee......");
			System.out.println(hm);
			break;
		}
		
		
	}
}
