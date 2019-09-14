package com.lamdaExpressions;
import java.util.ArrayList;
import java.util.function.BiFunction;
class Empl {
	int eid;
	String ename;
	public Empl(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;}}
public class BiFunctionEx {
	public static void main(String[] args) {
		ArrayList<Empl> al = new ArrayList<Empl>();
BiFunction<Integer, String, Empl> bif =(eid, ename)->new Empl(eid,ename);
		al.add(bif.apply(123, "suresh"));
		al.add(bif.apply(124, "ramesh"));
		al.add(bif.apply(125, "naresh"));
		
		for (Empl e : al) {
			System.out.println(e.eid + "  " + e.ename);
		
		}}}
