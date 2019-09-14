package com.lamdaExpressions;

interface Display{  
    public String print();//with out param
}  
public class Second{  
public static void main(String[] args) {  
	Display s=()->{  
        return "welcome to java8 lamda expressions";  
    };  
    System.out.println(s.print());  
}  
}  