package com.String;

public class NumberOfWordsInString {
	public static int countWordsUsingSplit(String input) {
	    if (input == null || input.isEmpty()) {
	      return 0;
	    }
	    String[] words = input.split("\\s+");
	    return words.length;
	  }
	public static void main(String[] args) {
		int count=countWordsUsingSplit("welcome    to    java programming");
		System.out.println(count);
	}
}
