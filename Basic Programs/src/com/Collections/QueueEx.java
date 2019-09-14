package com.Collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx 
{

	public static void main(String[] args) 
	{
	Queue q=new  ArrayDeque<>();
     
	   q.add(1);
	   q.add(2);
	   q.add(0);
	   System.out.println(q);
	   q.poll();
	   System.out.println(q);
	   
	
	}

}
