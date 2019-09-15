package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ListEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Ajit", 101, 35300, "Pune"));
		list.add(new Employee("Rupesh", 201, 53000, "Ranchi"));
		list.add(new Employee("Mukesh", 401, 25300, "Mumbai"));
		list.add(new Employee("Rajesh", 301, 55300, "Delhi"));
		list.add(new Employee("Rahul", 501, 15300, "Pune"));

		Predicate<Employee> condition = list1 -> list1.getName().startsWith("A");
		
		//Collections.replaceAll(list, "Ajit", "Dangi");
		
		//list.removeIf(condition);
		
		//System.out.println(list);
		
		
		
		

		/*
		 * for (Employee emp : list) {
		 * 
		 * System.out.println("Employee Name: " + emp.getName() + "Emp ID: " +
		 * emp.getEmpId() + "Emp Salary: " + emp.getSalary() + " Emp City: " +
		 * emp.getCity()); }
		 */

	}

}
