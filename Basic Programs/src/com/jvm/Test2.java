package com.jvm;
public class Test2
{
 public static void main(String[] args)
 {
     Test2 t1 = new Test2();
     Test2 t2 = new Test2();
     // Nullifying the reference variable
     t1 = null;
     // requesting JVM for running Garbage Collector
     System.gc();
     // Nullifying the reference variable
     t2 = null;
     // requesting JVM for running Garbage Collector
     Runtime.getRuntime().gc();  
 }

 protected void finalize() throws Throwable
 {
     System.out.println("Garbage collector called");
     System.out.println("Object garbage collected : " + this);
 }
}
