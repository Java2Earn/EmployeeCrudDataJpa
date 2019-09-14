package com.Collections;
import java.util.*;
class Hashmapdemo{
public static void main(String[] args){
LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
hm.put("amit",90);
hm.put("Salman",80);
hm.put("Khan",70);
hm.put("hari",60);
hm.put("amit",50);
hm.put("Ravi",99);
System.out.println(hm); //System.out.println("Elements:"+hm);
hm.remove("hari");
Set<String> s = hm.keySet();
System.out.println("keys:"+s);
Iterator it = s.iterator();
while(it.hasNext()){
Object o = it.next();
System.out.println(o + " " +hm.get(o));
         }
}
}





