package com.Collections;
import java.util.*;
class LinkedHashSetdemo{
public static void main(String[] args){
LinkedHashSet<Integer>lhs  = new LinkedHashSet<Integer>();
lhs.add(12);
lhs.add(12);
lhs.add(23);
lhs.add(11);
lhs.add(45);
lhs.add(56);
lhs.add(67);
System.out.println("Set:"+lhs);

Iterator it = lhs.iterator();
while(it.hasNext()){
System.out.println(it.next()+" ");
                       }
              }
    }
