package com.Collections;

import java.util.LinkedList;

public class LinkedListEx
{
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.addFirst(123);
	l.add(2, 90);

	System.out.println(l);
}
}
