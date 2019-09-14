package com.Collections;
import java.util.ArrayList;
class  ArrayListdemo
{
public static void main(String [] args){
//creation of ArrayList
ArrayList<String> al = new ArrayList<String>();//10===>(10*3/2)+1===>16,25
//adding elements to the ArrayList
al.add("Nokia");
al.add("Samsung");
al.add("Sony");
al.add("Celkon");
al.add("HTC");
al.add("HTC");
al.add(1,"welcome");
al.set(3, "vijay");
//al.add(1);
System.out.println(al);
System.out.println(al.size());//8
al.remove("HTC");
ArrayList<String> al1 = new ArrayList<String>();
al1.addAll(al);
al1.add("sandeep");
System.out.println(al1);
System.out.println(al1.containsAll(al));//true
al1.retainAll(al);
System.out.println(al1);//
System.out.println(al1.contains("HTC"));//true
al1.clear();
System.out.println(al1.isEmpty());
/*Iterator it = al.iterator();
while(it.hasNext())
{
	String check=(String) it.next();
	if(check.equals("Nokia"))
	{
		it.remove();
	}
	else
	{
System.out.println(check);
	}
}*/
   }
}