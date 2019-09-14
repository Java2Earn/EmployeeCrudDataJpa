package com.inheritance;

class Parent
{
    public void p1()
    {
        System.out.println("Parent method");
    }
}
public class InheritanceEx1 extends Parent 
{
    public void c1()
    {
        System.out.println("Child method");
    }
    
    public static void main(String[] args)
    {
    	InheritanceEx1 cobj = new InheritanceEx1();
        cobj.c1();   //method of Child class
        cobj.p1();   //method of Parent class 
    }
}
