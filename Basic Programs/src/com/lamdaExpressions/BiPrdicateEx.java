package com.lamdaExpressions;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class BiPrdicateEx {
public static void main(String[] args) {

BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;


IntPredicate p1=(a)->a%2==0;

System.out.println(p.test(12,11));
System.out.println(p.test(12,12));
}
}
