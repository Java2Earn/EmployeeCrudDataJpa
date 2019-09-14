package com.Collections;
import java.util.ArrayList;
class Employee2
{
	private int eid;
	private String ename;
	public Employee2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " emp id:"+eid+" "+ename  ;
	}
}
class Vectordemo{
public static void main(String[] args){
	Employee2 e=new Employee2(123,"suresh");
	Employee2 e1=new Employee2(124,"naresh");
	Employee2 e2=new Employee2(125,"rajesh");
	ArrayList<Employee2> s=new ArrayList<Employee2>();
	
	s.add(e);
	s.add(e1);
	s.add(e2);
	
	System.out.println(s);
	
	
	
	
	
	
/*Vector<Integer> v = new Vector<Integer>();//generics 10 11->20-->40
v.add(0,34);
v.addElement(123);
v.add(44);
v.add(1,99);
v.add(2,24);
v.add(100);
v.add(100);
v.add(100);
v.add(100);
v.add(100);
v.add(100);
v.add(100);
System.out.println(v.remove(2));
//v.add("");
System.out.println(v.size());
System.out.println(v.capacity());

System.out.println("List:"+v);








Enumeration<Integer> e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());	
}

*/

/*System.out.print("List using for loop:");
for(int i=0;i<v.size();i++){
System.out.print(v.get(i)+ " ");
}
System.out.print("\n List using for each loop:");
for(int i:v){
System.out.print(i+" ");
}
ListIterator lit = v.listIterator();
//displaying the elements in forward direction
System.out.println("\n forward direction:");
while(lit.hasNext()){
System.out.println(lit.next()+ " ");
}//displaying the element in backward direction
System.out.println("\n backward direction:");
while(lit.hasPrevious()){
System.out.println(lit.previous()+" ");*/
              }
       }
