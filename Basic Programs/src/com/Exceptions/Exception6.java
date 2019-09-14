package com.Exceptions;//our class should extends exception,Throwable
//parameterized constructor
class MyException1 extends Exception
{ 
	public MyException1(String errorMsg) 
	{
		super(errorMsg);
	}
	}
public class Exception6 
{static void validation(int age1) throws MyException1  
       {
     if(age1<18)
    	
        throw new MyException1("you are not eligiable for vote");//MyException1 obj
     else
      System.out.println("you are eligable to vote");
   }  
   public static void main(String args[]) throws MyException1
      {
	 
				Exception6.validation(16);
      System.out.println("rest of the code..."); }}