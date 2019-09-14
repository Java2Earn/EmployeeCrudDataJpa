package ThisSuper;
class A 
{
	A() {
		this(12,1);
		System.out.println("A class Constructor ");
	}
	A(int a, int b) {
		System.out.println(a + b);
	}
	void m1() {
		System.out.println("m1 method");
		System.out.println(this);
	}
	void m2() {
		this.m1();
		System.out.println("m2 method");
	}
}
public class ThisEx2 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
		a1.m2();
	}
}
