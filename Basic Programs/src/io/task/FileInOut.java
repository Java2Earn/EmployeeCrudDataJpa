package io.task;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInOut {
	
	void read() throws Exception {
		try {
		FileInputStream fis = new FileInputStream("task.txt");
		Bean Be;
		ObjectInputStream ois = new ObjectInputStream(fis);
		while((Be =(Bean)ois.readObject())!=null) {
			System.out.println(Be);
		}
		}catch(Exception e) {
			System.out.println("End of FILE");
		}
		System.out.println("end of the file");
	}
}

