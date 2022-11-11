package com.te.collection;

import java.util.Comparator;

public class CompareBySmarks implements Comparator<StudImp> {

	@Override
	public int compare(StudImp o1, StudImp o2) {
		return o1.smarks-o2.smarks;
	}

}
