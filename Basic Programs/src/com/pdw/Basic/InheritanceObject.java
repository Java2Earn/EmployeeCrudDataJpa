package com.pdw.Basic;

public class InheritanceObject {

	public static void main(String[] args) 
	{
    CD c=new CD(4);	
	}

}
class AB
{
	AB()
	{
		System.out.println("AM  FROM  AB CLASS DEFAULT CONTRUCTOR");
	} 
	AB(int i)
	{
		System.out.println("Am from AB class Parameterized constructor");
	}
}
class CD extends AB
{
	CD()
	{
		System.out.println("AM  FROM  CD CLASS DEFAULT CONTRUCTOR");
	} 
	CD(int i)
	{
		System.out.println("Am from CD class Parameterized constructor");
	}
}