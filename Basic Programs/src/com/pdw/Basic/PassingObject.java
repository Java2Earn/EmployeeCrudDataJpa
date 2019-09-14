package com.pdw.Basic;

class Printer {
	public void print(Paper p) {
		p.setText("Get Lost");
	}
}

class Paper {
	String text;

	public void setText(String t) {
		text = t;
	}

	public String getText() {
		return text;
	}

}
public class PassingObject {

	public static void main(String[] args) {
		
		Paper p=new Paper();
		p.setText("Hello World");
		System.out.println(p.getText());
		
		Printer p1=new Printer();
		p1.print(p);
		System.out.println(p.getText());
		
	}

}
