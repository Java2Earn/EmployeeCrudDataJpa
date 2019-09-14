package com.pdw.Basic;
enum months 
{
	jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec;
	months()
	{
		System.out.println("enum-constructor");
	}
}
class EnumEx 
{
	public EnumEx() {
		System.out.println("Welcome-constructor");
	}
	public static void main(String[] args) 
	{
		//values(we cant find in API bcoz its provided by enum implicitl)
		EnumEx e=new EnumEx();
		months m[] = months.values();
		for (months m2 : m) {
			System.out.println(m2+"  "+m2.ordinal());
		}
	}
}