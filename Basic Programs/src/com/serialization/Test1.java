package com.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test1 {
	public static void main(String[] args)throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("cit.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e2=(Emp) ois.readObject();
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getAtmpin());
	}
}
