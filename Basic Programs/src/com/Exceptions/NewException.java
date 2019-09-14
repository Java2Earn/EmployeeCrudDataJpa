package com.Exceptions;

public class NewException {
public static void main(String[] args) {
String s1=args[0]; //if we are not passing args
String s2=args[1];
int n1=Integer.parseInt (s1);
int n2=Integer.parseInt (s2);
int n3=n1/n2;
System.out.println ("DIVISION VALUE = "+n3);
}
}
