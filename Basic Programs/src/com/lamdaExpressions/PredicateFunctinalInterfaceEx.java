package com.lamdaExpressions;
import java.util.ArrayList;
import java.util.function.Predicate;
public class PredicateFunctinalInterfaceEx {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(123, "suresh", 2000));
		al.add(new Employee(124, "ramesh", 3000));
		al.add(new Employee(125, "rajesh", 4000));
		al.add(new Employee(126, "somesh", 8000));
		al.add(new Employee(127, "fasak", 20000));
		Predicate<Employee> p = e -> e.sal > 3000;
		for (Employee e1 : al) {
			if (p.test(e1)) {
	System.out.println(e1.ename + " " + e1.eid + " " + e1.sal);
			}}}}
class Employee {
	int eid;
	String ename;
	int sal;
	public Employee(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;}}