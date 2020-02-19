package com.Collections;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx
{
	public static void main(String[] args) throws IOException 
	{
	TreeSet set=new TreeSet();
	
	set.add(12);
	set.add(14);
	set.add(90);
	set.add(190);
	set.add(13);
	set.add(1);
	set.add(12);
	System.out.println(set);
		
		
	}
	

}






//Comparable(I),Comparator(I)-->userdefined sorting order
//note:exept treeset and treemap every collection class will allow dissimilar type data
// treeset-->10,1,8,4,1,2-->ascending


