package com.cg.employee;

//Employee class created of which we have to create a jar file
public class Employee {
	private int empid;
	private String name;
	private double salary;

	// Constructor of Employee with parameters
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void disp() { // display method to display
		System.out.println("EmpId       Name       Salary");
		System.out.println(+empid + "       " + name + "       " + salary);
	}

}
