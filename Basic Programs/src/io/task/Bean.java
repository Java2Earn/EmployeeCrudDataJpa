package io.task;

import java.io.Serializable;

public class Bean implements Serializable {
	public String toString() {
		return "Eid=" + Eid + ", Ename=" + Ename ;
	}
	int Eid;
	String Ename;
	public Bean(int eid, String ename) {
		//super();
		Eid = eid;
		Ename = ename;
	}
}
