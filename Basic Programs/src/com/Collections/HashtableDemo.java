package com.Collections;
import java.util.*;
class HashtableDemo
{
public static void main(String []args){
Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
ht.put("xyz ",67);
ht.put(" mno",23);
ht.put("pqr",89);
ht.put("ijk",39);
ht.put(" abc",89);
ht.put(" def",99);
System.out.println(ht);
Enumeration e = ht.keys();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
                }
           }
    }
