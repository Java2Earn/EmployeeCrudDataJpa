package com.Collections;
import java.util.*;
class LinkedHashMapdemo{
public static void main(String[] args){
TreeMap<String,Integer> lhm = new TreeMap<String,Integer>();
lhm.put  ("hari",33);
lhm.put ("Ravi",11);
lhm.put ("Salman",22);

System.out.println(lhm);
Set<String> s = lhm.keySet();
System.out.println("key:"+s);
Iterator it = s.iterator();
while(it.hasNext()){
Object o = it.next();
String str = (String)o;
System.out.println(str+"  "+lhm.get(str)); }
Collection<Integer> c = lhm.values();
System.out.println("Values:"+c); }
  }
