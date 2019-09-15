package com.test.java;

@FunctionalInterface
interface A{
	
	public void m1();
	
	default void show() {
		
		System.out.println("GFHJH");
	}
}

@FunctionalInterface
interface B extends A{
	
	
	
}



public class FunctionalTest {

	public static void main(String[] args) {
		A test = ()->System.out.println();
		test.show();
		
		

	}

}
