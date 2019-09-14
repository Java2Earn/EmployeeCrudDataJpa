import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ColectionTest {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(1,3);
	al.remove(2);
	List linkedlist=new LinkedList(al);//has-a
	al.addAll(linkedlist);
	linkedlist=al.subList(0,2);
	System.out.println(al);
	linkedlist.clear();
	System.out.println(al);
}
}
