package com.lamdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx1 
{
public static void main(String[] args) {
	Supplier<Date> sup=()->new Date();
	System.out.println(sup.get());
}
}



	
	
	
	