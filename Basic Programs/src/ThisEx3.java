
class ThisEx3 {
	int a = 10;
	void m1(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this);
	}
	ThisEx3() {
		System.out.println("default");
	}

	ThisEx3(int a, int b) {
		this();// default consu
		this.m1(40);
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		ThisEx3 x = new ThisEx3(10, 20);//
		System.out.println(x);
		x.m1(20);
	}
}