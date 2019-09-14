package com.Exceptions;

public class ThrowEx {
public void pass(int marks) {
if (marks < 35) {
throw new ArithmeticException("You are Failed");
} else {
System.out.println(" You are Pass : " + marks);
}
}
public static void main(String[] args) {
ThrowEx m = new ThrowEx();
m.pass(33);
}
}