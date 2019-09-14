package polymorphism;

class Caluculate
{	
 void sum (short a, short b)
 {
  System.out.println("sum is"+(a+b)) ;
 }
 void sum (float a, float b)
 {
  System.out.println("sum is"+(a+b));
 }
 public static void main (String[] args)
 {
  Caluculate  cal = new Caluculate();
  cal.sum (1,1);      
  cal.sum ('a','b');//type promotion to next data type
  cal.sum (2.2f,3.2f);
 }
 
}