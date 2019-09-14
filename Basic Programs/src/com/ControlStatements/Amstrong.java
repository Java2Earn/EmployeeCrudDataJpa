package com.ControlStatements;
import java.util.Scanner;
public class Amstrong 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,x = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amstrong number");
	int n=sc.nextInt();
	//System.out.println("your entered number is"+i);
/*	if(i<1000)
	{
	a=i%10;	
	d=i/10;	
	b=d%10;	
	c=d/10;
	x=(a*a*a)+(b*b*b)+(c*c*c);
	}
	if(x==i)
	{
		System.out.println("the number is amstrong number"+i);
		
	}
	else
	{
		
		System.out.println("enter  amstrong number");
	}
	*/
	int temp=n;
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("number is Amstrong");
	}
	else
	{
		System.out.println("number is not Amstrong");
	}
	}
	
	

}
