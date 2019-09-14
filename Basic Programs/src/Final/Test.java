package Final;
class A {
	 int a = 111;
	public void m1() {
		this.a = ++a;
		System.out.println("After increment value is" + a);
	}
}
public class Test extends A {
	public void m1() {
	super.a = --a;
		System.out.println("After decrement value is" + a);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();
		A a=new A();
		a.m1();
	}
}
