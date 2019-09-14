package com.lamdaExpressions;

import java.util.function.Predicate;

public class PredicateFunctinalInterfaceEx1 {
public static void main(String[] args) {
	String str[]={"suresh","ramesh","rajesh","ragus","rajendra"};

	Predicate<String> p=s->s.length()%2==0;//>5;
	for(String s1:str)
		if(p.test(s1))
			System.out.println(s1);
	
}
}
