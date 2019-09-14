package com.Threads;

class Test4 extends Thread {

	@Override
	public void run() {
		String s[] = { "sandeep", "syed", "cho" };
		for (String s1 : s)
			System.out.println(s1);
	}
}
class RunnableThread {
	public static void main(String args[]) {
		Test4 t = new Test4();
		t.start();// run
	}
}
