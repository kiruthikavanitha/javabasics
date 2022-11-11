package com.te.collection;

import java.util.Comparator;

public class CompareBySname implements Comparator<StudImp> {

	@Override
	public int compare(StudImp o1, StudImp o2) {
		return o1.sname.compareTo(o2.sname);
	}

	
	

}
