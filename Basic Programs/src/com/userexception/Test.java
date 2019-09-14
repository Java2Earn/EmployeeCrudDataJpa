package com.userexception;

public class Test 
{
void display(int sal) throws SalException
{
if(sal<1)
{
	throw new SalException("salary should be grater than 1");
	}
else
{
	System.out.println("welcome");
	}
}
}
