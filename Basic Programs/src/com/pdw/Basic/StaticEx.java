package com.pdw.Basic;

class Emp {
	int basicpay;
	int allowance;
	static int bonus =5000;

	public Emp(int x, int y) {
		basicpay = x;
		allowance = y;
	}
	void credit() {
	System.out.println("Sal Credited : " + (basicpay+allowance+bonus));
	}
}
public class StaticEx {
	public static void main(String[] args) {
		Emp admin = new Emp(15000,3000);
		Emp developer = new Emp(20000,4000);
		admin.credit();
		developer.credit();

		// static methods we can call directly or we can use class name,from
		// static environment.
		// we can't call non-static method's into static environment directly we
		// need to do instantiation.
	}

}
