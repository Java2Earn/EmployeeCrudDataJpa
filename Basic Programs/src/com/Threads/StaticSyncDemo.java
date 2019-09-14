package com.Threads;
class Account1{
 synchronized static void showAccount1(String accountName){
     System.out.println("My account name is "+accountName+" Holder Name is "+Thread.currentThread().getName());
     try{
       Thread.sleep(500);
     }catch(Exception e){}
   }
}
class MyThread1 extends Thread{
    public void run(){
       Account1.showAccount1("gmail.com");
  }
}
class MyThread6 extends Thread{
    public void run(){
       Account1.showAccount1("Linkedin.com");
    }
}
class MyThread3 extends Thread{
    public void run(){
       Account1.showAccount1("Facebook.com");
    }
}
class MyThread4 extends Thread{
    public void run(){
       Account1.showAccount1("Twitter.com");
    }
}
class StaticSyncDemo{
    public static void main(String t[]){
       MyThread1 t1 = new MyThread1();
       MyThread6 t2 = new MyThread6();
       MyThread3 t3 = new MyThread3();
       MyThread4 t4 = new MyThread4();
       t1.setName("sandeep");
       t2.setName("ramesh");
       t3.setName("suresh");
       t4.setName("naresh");       
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}