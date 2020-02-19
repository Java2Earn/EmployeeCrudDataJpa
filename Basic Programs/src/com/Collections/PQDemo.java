package com.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
class PQDemo{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("z");  
queue.add("b");  
queue.add("c");  
queue.add("d");  
queue.add("e"); 
  System.out.println(queue); 
  System.out.println(queue.element());//z
  System.out.println(queue.peek());
  System.out.println("head:"+queue.poll()); //null 
System.out.println("head:"+queue.remove()); //exception
System.out.println(queue); 
System.out.println("iterating the queue elements:");

Iterator itr=queue.iterator();  

while(itr.hasNext()){  
System.out.println(itr.next());  
}
queue.remove();  //fifo
queue.poll();  //fifo

System.out.println("after removing two elements:");  

Iterator<String> itr2=queue.iterator();  

while(itr2.hasNext()){  
System.out.println(itr2.next());}}}