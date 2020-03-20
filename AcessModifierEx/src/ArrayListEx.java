import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListEx 
{
	public static void main(String[] args) 
	{
	
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=sb.reverse();
		System.out.println(sb1);
		
		
		
		
		ArrayList al=new ArrayList();//10
			
				al.add(10);
				al.add(12);
				al.add(1);
				al.add(123);
				al.add(4);
				al.add(12);
				al.add(1212);
				al.add(4,"sandeep");	
				al.remove(3);
				System.out.println(al);
				
				ArrayList al1=new ArrayList();
				al1.add("pawan");
				al1.add("cho");
				al1.addAll(1,al);
				System.out.println(al1);
				al1.retainAll(al);
				System.out.println(al1);
				
				
				
				
		
	}
}
