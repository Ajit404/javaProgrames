package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private int salary;
	private String city;

	public Customer() {
	}

	public Customer(String name, int salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	public static void main(String[] args) {

		List<Customer> list1 = new ArrayList<Customer>();

		list1.add(new Customer("Ajit", 12000, "Pune"));
		list1.add(new Customer("XXX", 16000, "Mumbai"));
		list1.add(new Customer("Mukesh", 11000, "Ranchi"));
		list1.add(new Customer("Pallaw", 5000, "Pune"));
		
		
		//System.out.println(list1);
		
	//	Collections.sort(list1, (e1,e2)->(e1.salary<e2.salary)?-1:(e1.salary>e2.salary)?1:0);
		
		//Collections.sort(list1, (e1,e2)->(e1.name.compareTo(e2.name)));
		
	//	System.out.println(list1);
		
		
		List strList = new ArrayList<>();

		//add at last
		strList.add(0, "0");

		//add at specified index
		strList.add(1, "1");

		//replace
		//strList.set(1, "2");

		//remove
		//strList.remove("1");
		
		System.out.println(strList);
		
		
		
	}	
		 
}
