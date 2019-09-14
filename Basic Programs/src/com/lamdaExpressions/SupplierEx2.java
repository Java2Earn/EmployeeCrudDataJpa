package com.lamdaExpressions;

import java.util.function.Supplier;
//generating otp number using supplier
public class SupplierEx2 {
public static void main(String[] args) {
	Supplier<String> sup=()->{
		String otpNum="";
		for(int i=0;i<6;i++){
			otpNum=otpNum+(int)(Math.random()*10);
		}
		return otpNum;
	};
	System.out.println(sup.get());
}
}
