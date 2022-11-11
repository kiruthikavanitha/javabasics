package com.te.collection;

public class Employee implements Comparable<Employee>{
	int eid;
	String ename;
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	public String toString() {
		return "Employee=[empid="+eid +"," + "empname=" +ename+"]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.ename.compareTo(o.ename);
	}

}
