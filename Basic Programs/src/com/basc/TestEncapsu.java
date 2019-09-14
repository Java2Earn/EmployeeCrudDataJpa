package com.basc;

public class TestEncapsu 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		t.setEid(1);
		t.setEname("sandeep");
		t.setAddress("hyd");
		
		
		System.out.println(t.getEid());
		System.out.println(t.getAddress());
		System.out.println(t.getEname());
	}

}
