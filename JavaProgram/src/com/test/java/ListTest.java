package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(10);
		list.add(12);
		list.add(17);
		list.add(18);
		list.add(11);
		list.add(16);
		list.add(15);
		list.add(100);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(100));
		
	}

}
