package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee=new  Employee(10,"vani");
		Employee employee1=new  Employee(50,"keerthi");
		Employee employee2=new  Employee(40,"sam");
		Employee employee3=new  Employee(30,"raja");
		
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
		Collections.sort(arrayList,new CompareById());
		for(Employee employee4:arrayList) {
		System.out.println(employee4);
	}
		
	}
	
}
