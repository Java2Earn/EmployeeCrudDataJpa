package polymorphism;

class Area
{
 void find(int i,int j)
 {
  System.out.println("Area is"+(i*j)) ;
 }
 
 void find(int l, int b,int h)
 {
  System.out.println("Area is"+(l*b*h));
 }
 
 public static void main (String[] args)
 {
  Area  ar = new Area();
  ar.find('s','h');     //find(int l, int b) is method is called. 
  ar.find(4,6,2);    //find(int l, int b,int h) is called.
 }
}


