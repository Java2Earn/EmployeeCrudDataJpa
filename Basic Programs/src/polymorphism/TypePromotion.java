package polymorphism;

class TypePromotion {
	void sum(char a) {
		System.out.println(a);
	}
	void sum(float a) {
		System.out.println(a);
	}

	public static void main(String args[]) {
		TypePromotion obj = new TypePromotion();
		obj.sum(1.5f);// now second int literal will be promoted to long
		obj.sum('A');

	}
}
