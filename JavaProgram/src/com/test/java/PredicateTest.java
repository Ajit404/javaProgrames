package com.test.java;

import java.util.function.Function;

public class PredicateTest {

	public static void main(String[] args) {

		Function<String, String> f = m -> m.toLowerCase();
		System.out.println(f.apply("JHHDDJ"));

	}

}
	