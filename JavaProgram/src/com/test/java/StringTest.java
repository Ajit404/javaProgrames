package com.test.java;

public class StringTest {

	public void show(Boolean obj) {

		System.out.println("StringBuffer Calling");

	}

	public void show(String str) {

		System.out.println("String Calling");

	}

	public static void main(String[] args) {

		StringTest t = new StringTest();

		t.show("ss");

	}

}
