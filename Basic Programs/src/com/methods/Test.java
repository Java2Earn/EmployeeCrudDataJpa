package com.methods;

public class Test
{
    public void callByValue(int x)
    {
        x=200;
    }
    public static void main(String[] args)
    {
       int x=50;
        Test t = new Test();
        t.callByValue(x);	//function call
        System.out.println(x);
    }
    
}