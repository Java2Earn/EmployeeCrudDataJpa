package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Test 
{
public static void main(String[] args) throws IOException {
	Emp e=new Emp();
	e.setAtmpin(1142);
    e.setId(3);
    e.setName("naresh");
	FileOutputStream fos=new FileOutputStream("cit.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("done");
}
}
