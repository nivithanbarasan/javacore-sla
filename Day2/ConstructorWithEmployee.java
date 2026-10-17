package com.assignment.java;

public class ConstructorWithEmployee{
	int employeeId;
    String employeeName;
    double salary;
	ConstructorWithEmployee(int employeeId, String employeeName,double salary){
		this.employeeId=employeeId;
	    this.employeeName=employeeName;
	    this.salary=salary;
	}
	double annualsalary() {
		return salary*12;
	}
	 void calculateAnnualSalary() {
		 System.out.println("employee id :"+employeeId);
		 System.out.println("employee name :"+employeeName);
		 System.out.println("salary :"+salary);
		 System.out.println("annual salary :"+annualsalary());
	 }
	public static void main(String[] args) {
		ConstructorWithEmployee obj=new ConstructorWithEmployee(101,"Arun",25000);
		ConstructorWithEmployee obj1=new ConstructorWithEmployee(102,"Divya",35000);
		ConstructorWithEmployee obj2=new ConstructorWithEmployee(103,"Kumar",40000);
		obj.calculateAnnualSalary();
		obj1.calculateAnnualSalary();
		obj2.calculateAnnualSalary();
		
//		3.Scenario: A company needs to store different employee details when each employee joins. 
//		Requirements: 
//		1. Create a class Employee with employeeId, employeeName, and salary. 
//		2. Create a parameterized constructor that accepts all three values. 
//		3. Create a method calculateAnnualSalary() that calculates annual salary. 
//		4. Create three employee objects with different details and display their annual salaries. 
//		Sample input: 
//		● Employee 1: 101, "Arun", 25000 
//		● Employee 2: 102, "Divya", 35000 
//		● Employee 3: 103, "Kumar", 40000 
//		Task: Calculate and display the annual salary for each employee. 
		
		
	}
	

}
