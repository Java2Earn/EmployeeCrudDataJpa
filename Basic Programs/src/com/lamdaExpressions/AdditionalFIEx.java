package com.lamdaExpressions;

import java.util.function.Predicate;

public class AdditionalFIEx {
	public static void main(String[] args) {

		int[] values = { 1,20,2, 10, 34, 23, 45, 33 };

		Predicate<Integer> pre = i -> i % 2 == 0;//IntPredicate
	
		for (int val : values) {
			if (pre.test(val)) {
				System.out.println(val);
			}
		}

	}
}
