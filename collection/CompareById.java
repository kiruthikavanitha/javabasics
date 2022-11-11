package com.te.collection;

import java.util.Comparator;

public class CompareById implements Comparator<Employee>{
@Override
public int compare(Employee o1, Employee o2) {
	return o1.eid-o2.eid;
}
}

