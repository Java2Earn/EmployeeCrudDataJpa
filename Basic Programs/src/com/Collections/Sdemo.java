package com.Collections;
import java.util.StringTokenizer;
class Sdemo{
public static void main(String[] args){
String str = "one a two a three a four a five a six a seven a eight a nine a ten";
StringTokenizer  st = new StringTokenizer(str, "a");//(str,”a”);
System.out.println(st.countTokens());
while (st.hasMoreTokens()){  //has MoreElements
System.out.println(st.nextToken());
                }
          }
  }
