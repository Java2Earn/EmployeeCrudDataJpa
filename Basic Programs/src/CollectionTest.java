class Testw
{
	int a=123;
	int b=1;
	}
public class CollectionTest 
{
	int a=1234;
	Testw t;//has-a
public CollectionTest(Testw testw) {
		t=testw;
	}
public static void main(String[] args) {
	CollectionTest ct=new CollectionTest(new Testw());
	ct.a=0;
	System.out.println(ct.a);

}
}
