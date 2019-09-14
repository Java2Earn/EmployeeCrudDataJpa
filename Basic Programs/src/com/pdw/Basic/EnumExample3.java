package com.pdw.Basic;
class EnumExample3 {
	enum Season {
		WINTER, SPRING, SUMMER, FALL;
	}
public static void main(String[] args) {
		Season s = Season.WINTER;// enum type is required to access WINTER
		System.out.println(s);
	}
}
