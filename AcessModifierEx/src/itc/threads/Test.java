package itc.threads;

class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			//Thread.currentThread().setPriority(1);
			System.out.println(" User Thread"+Thread.currentThread());
		}
	}
}
class Test {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		ThreadEx t = new ThreadEx();
		t.start();
		for (int i = 1; i < 10; i++) {
			
			//Thread.currentThread().setName("dontsleep");
			
			System.out.println(" Main Thread"+Thread.currentThread());
		}
	}

}