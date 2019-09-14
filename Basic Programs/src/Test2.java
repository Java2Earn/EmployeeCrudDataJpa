import java.util.ArrayList;
public class Test2
{
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();

	al.add("a");
	al.add("b");
	al.add("c");
	

	System.out.println(al);

	ArrayList<String> al1=new ArrayList<String>();

	al1.add("d");
	al1.add("e");
	al1.add("f");

	System.out.println(al1);
	
	al.addAll(1,al1);
	
	System.out.println(al);
	
	al.retainAll(al1);
	
	System.out.println(al);

	ArrayList al2=new ArrayList();

	al2.add(1);
	al2.add(2);
	al2.add(3);
	al2.remove(1);

	System.out.println(al2);
	
}
}
