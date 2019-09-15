package com.test.java;

public class OverridingTest {

	public void m1(int a){
		

		System.out.println("A");

	}

	public void m1(int a, int b) throws ArithmeticException {

		System.out.println("B");

	}

	public static void main(String[] args) {

		OverridingTest a = new OverridingTest();
		a.m1(4);

	}

}
