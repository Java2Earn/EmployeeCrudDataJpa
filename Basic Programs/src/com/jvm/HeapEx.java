package com.jvm;
public class HeapEx {
	public static void main(String[] args) {
		long mb=1024*1024;
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory());
		System.out.println("maximum memory  "+r.maxMemory()/mb);
		System.out.println(	"free memory    "+r.freeMemory()/mb);
		System.out.println("total memory    "+r.totalMemory()/mb);
		System.out.println("consumed memory "+(r.totalMemory()-r.freeMemory())/mb);
	}
//increasing heap size ==>java -Xmx512m HeapEx
//increasing heap size ==>java -Xms10m HeapEx
}
