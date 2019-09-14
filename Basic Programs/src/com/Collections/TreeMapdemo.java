package com.Collections;
import java.util.*;
class TreeMapdemo{
public static void main(String[] args){
TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
tm.put("xmit",68);
tm.put("zhan",89);
tm.put("aari",66);
System.out.println(tm);
/*tm.remove("Khan");
Set<String> s = tm.keySet();
System.out.println("keys:"+s);
*/

/*
Iterator it = s.iterator();
while(it.hasNext()){
Object o = it.next();
String str = (String)o;
System.out.println(str+ " "+tm.get(str));
                  }
Collection<Integer>  c = tm.values();
System.out.println("Values:" + c);
*/        }
}
