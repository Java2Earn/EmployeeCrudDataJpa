package com.lamdaExpressions;

import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		// parameter can be anything and return void
		Consumer<String> con = i -> System.out.println(i);
		con.accept("welcome to capgemini");
		con.accept("welcome");
	}
}
