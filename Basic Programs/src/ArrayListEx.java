import java.util.ArrayList;


public class ArrayListEx
{
public static void main(String[] args) {
	
ArrayList al=new ArrayList();
	al.add("suresh");
	al.add("naresh");
	al.add("ramesh");
	al.add("suresh");
	al.add("rajesh");
	//System.out.println(al);
	
	ArrayList al1=new ArrayList();	
	
	al1.add(123);
	al1.add(143);
	al1.add(12);
	al1.add('x');
	al1.add(true);
	al1.addAll(al);
	System.out.println(al1);
	al1.removeAll(al);
	System.out.println(al1);
	
	
}
}
