package io.task;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		FileInOut f = new FileInOut();
		Scanner sc = new Scanner(System.in);
		int eid;
		String ename;
		FileOutputStream fos = new FileOutputStream("task.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i =0;i<2;i++) {
			System.out.println("enter the id:");
			eid = sc.nextInt();
			System.out.println("enter the name:");
			ename = sc.next();
			Bean B = new Bean(eid, ename);
			oos.writeObject(B);
		}
		f.read();	
		sc.close();
	}
}
