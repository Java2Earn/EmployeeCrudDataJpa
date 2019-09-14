package com.packages;

enum Months {
	jan, feb, mar, apr, june, july, august, sept, oct, nov, dec;
}

public class EnumEx {
	public static void main(String[] args) {

		Months month=Months.apr;
		System.out.println(month);
		
		for(Months m1:Months.values())
		{
			System.out.println(m1);
		}
	}
}
