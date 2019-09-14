
public class GarbageCollectionEx{
int a;
int b;

  public void setData(int c,int d){
    a=c;
    b=d;
  }
  public void showData(){
    System.out.println("Value of a = "+a);
    System.out.println("Value of b = "+b);
  }
  public static void main(String args[]){
    GarbageCollectionEx s1 = new GarbageCollectionEx();
    GarbageCollectionEx s2 = new GarbageCollectionEx();
    s1.setData(1,2);
    s2.setData(3,4);
  }
}
