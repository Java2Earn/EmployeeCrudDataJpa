public class ArrayTask {
	public static void main(String[] args) {
		int a[] = new int[3];
		int b[] = { 1, 2, 3, 4, 5, 6 };
		//int c[] = { 1, 2, 3, 4, 5, 6, 7 };
		a = b;
		for (int i : a) {
			System.out.println(i);
		}
	}
}
