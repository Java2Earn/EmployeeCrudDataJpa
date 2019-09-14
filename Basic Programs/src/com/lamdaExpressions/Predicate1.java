package com.lamdaExpressions;

import java.util.function.Predicate;

public class Predicate1 {
public static void main(String[] args) {
	int []x={0,10,3,8,24,100,75,20,22};

	Predicate<Integer>p=i->i%2==0;
	Predicate<Integer>p1=i->i>10;
	//and,or,negate(predicate joining)
	
	System.out.println("The numbers greater than 10 and even:");
	for(int i1:x)
	{
	 	if(p.and(p1).test(i1))//or
		{
			System.out.println(i1);
		}
		if(p.negate().test(i1))//or
		{
			System.out.println(i1);
		}
		if(p.or(p1).test(i1))//or
		{
			System.out.println(i1);
		}
	}
}
}
