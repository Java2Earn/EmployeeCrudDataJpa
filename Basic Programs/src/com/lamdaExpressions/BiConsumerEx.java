package com.lamdaExpressions;
import java.util.ArrayList;
import java.util.function.BiConsumer;
class Employee1{
	String ename;
	double sal;
	public Employee1(String ename, double sal) {
		super();
		this.ename = ename;
		this.sal = sal;
	}
@Override
public String toString() {
	return ename+"  "+sal;}	}
public class BiConsumerEx {
	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		BiConsumer<Employee1,Double> bic = (emp,sal1) -> emp.sal=emp.sal+sal1;
		al.add(new Employee1("suresh",2000));
		al.add(new Employee1("naresh",3000));
		al.add(new Employee1("ramesg",4000));
		for (Employee1 e : al) {
			bic.accept(e, 10000.00);
		}
		System.out.println(al);
			}}