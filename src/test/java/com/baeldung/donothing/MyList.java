package com.baeldung.donothing;

import java.util.AbstractList;

public class MyList {

	public void add(int index, String element) {
		// no-op
		System.out.println("I'M HERE in this real add()!");
	}
}