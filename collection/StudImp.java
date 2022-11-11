package com.te.collection;

public class StudImp {
 int sid;
 String sname;
 int sage;
 int smarks;
 public StudImp(int sid,String sname,int sage,int smarks) {
	 this.sid=sid;
	 this.sname=sname;
	 this.sage=sage;
	 this.smarks=smarks;
 }
 public String toString() {
	 return "student=[sid="+sid+", sname="+sname+", sage="+sage+", smarks="+smarks+"]";
 }
}
