package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	static int discount = 0;
	static String productName = null;
	static String part1 = null;
	static Map<String, Integer> output = new LinkedHashMap<String, Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of products");
		int noOfProducts = sc.nextInt();
		String Products[] = new String[noOfProducts];
		Integer discounts[] = new Integer[noOfProducts];
		for (int i = 0; i < noOfProducts; i++) {
			Products[i] = sc.next();
			String divide[] = Products[i].split(",");
			part1 = divide[0];
			String part2 = divide[1];
			String part3 = divide[2];
			int a = Integer.parseInt(part2);
			int b = Integer.parseInt(part3);
			discount = (a * b) / 100;
			discounts[i] = discount;
			output.put(part1, discount);
			System.out.println(output.size());
		}
		System.out.println(output);
		int minDiscount = Collections.min(Arrays.asList(discounts));

		Set<Entry<String, Integer>> set = output.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			int mapDiscount = entry.getValue();
			if (minDiscount == mapDiscount) {
				String productName = entry.getKey();
				System.out.println(productName + " "+ minDiscount);
			}
		}
	}
}
