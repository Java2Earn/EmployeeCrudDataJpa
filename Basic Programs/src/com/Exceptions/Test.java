package com.Exceptions;
class MyException extends Exception//Throwable
{ //private String a;
MyException(String a)
 {
 // this.a=a;
  System.out.println(a);
 }
}
class Test
{
 static void validate(String username,String password) throws MyException
 {
  if((username.equals(password)))
	  System.out.println("login success");
  else 
    throw new MyException("username and password should be same");
  
 }
 public static void main(String[] args)
 {
			try {
				validate("a","a");
			} catch (MyException e) {
				e.printStackTrace();
			}
	}}