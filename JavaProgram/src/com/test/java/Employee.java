package com.test.java;

public class Employee {

	public Employee() {
		super();

	}

	public Employee(String name, int empId, double salary, String city) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.city = city;
	}

	private String name;
	private int empId;
	private double salary;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", city=" + city + "]";
	}

}
