package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Test 
{
public static void main(String[] args) throws IOException {
	Emp e=new Emp();
	e.setAtmpin(1111);
    e.setId(1);
    e.setName("suresh");
	FileOutputStream fos=new FileOutputStream("anuragemp.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("done");
}
}
