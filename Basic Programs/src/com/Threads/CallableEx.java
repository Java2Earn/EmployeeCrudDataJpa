package com.Threads;

import java.util.concurrent.Callable;

public class CallableEx implements Callable<Integer>
{
	public Integer call() throws Exception {
		
		return 123;
	}
	public static void main(String[] args) {
		CallableEx cal=new CallableEx();
		Thread t=new Thread();
		t.start();
		
	}

}
