package com.Collections;
import java.util.Stack;
public class StackEx
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("hello");//lifo
		s.push("hai");
		s.push(12);
		s.push(true);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(12));
	}
}
