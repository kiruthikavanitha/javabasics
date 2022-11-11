package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo implements Iterable{
	private Object a[];
	private int position;
public ArrayListDemo(int arraysize) {
	 this.a=new Object[arraysize];
}
public void add(Object arr) {
	if(this.position>=this.a.length) {
		grow();
	}
	this.a[position++]=arr;
}
public Object get(int index) {
	return this.a[index];
}
public int size() {
	return this.position;
}
public void grow(){
	Object temp[]=new Object[this.a.length+5];
	System.arraycopy(this.a, 0, temp, 0, this.a.length);
	a=temp;
}
public String toString() {
	String string="["+a[0];
	for(int i=1;i<size();i++) {
	string+=","+a[i];
	}
	string+="]";
	return string;
}
public Iterator iterator() {
	return new MyItr();
}
private class MyItr implements Iterator{
	private int b;
	@Override
	public boolean hasNext() {
	 	if(b<size()) {
			return true;
		}
		return false;
	}
	@Override
	public Object next() {
		return a[b++];
	}
	
}

}
