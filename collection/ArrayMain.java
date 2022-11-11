package com.te.collection;
import java.util.Iterator;

public class ArrayMain {
	public static void main(String[] args) {
		ArrayListDemo arrayListDemo=new ArrayListDemo(5);
		arrayListDemo.add(10);
		arrayListDemo.add(20);
		arrayListDemo.add(30);
		arrayListDemo.add(30);
		arrayListDemo.add(30);
		arrayListDemo.add(30);
		arrayListDemo.add(30);
		System.out.println(arrayListDemo);
		System.out.println("--------------------------");
		System.out.println(arrayListDemo.size());
		System.out.println("--------------------------");
		for(int i=0;i<arrayListDemo.size();i++) {
			System.out.println(arrayListDemo.get(i));
		}
		System.out.println("------------------");
		Iterator iterator=arrayListDemo.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
}
	}
}