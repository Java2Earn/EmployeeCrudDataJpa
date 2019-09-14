package com.Collections1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("welcome.properties");

		p.load(fi);

		System.out.println(p);

		String s = p.getProperty("id");
		System.out.println(s);

		p.setProperty("name", "sandeep123");

		FileOutputStream fos = new FileOutputStream("welcome.properties");
		p.store(fos, "update using Properties class");


		System.out.println(s);

	}
}
