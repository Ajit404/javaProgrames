package com.test.java;

interface Test{
	
	public void m1(int n);
}


public class LmbdaExp {
	
	public static void main(String[] args) {
		
		Test t = (n)->System.out.println(n*n);
		t.m1(10);
		t.m1(20);
		
		
	}		
		
		
	}
