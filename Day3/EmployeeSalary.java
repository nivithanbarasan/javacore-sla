package com.assignment.java;

public class EmployeeSalary {
double salary;
double allowance;
double grosssalary;
double deductions;
double netsalary;

	double calculateSalary(double salary,double allowance) {
		this.salary=salary;
    	this.allowance=allowance;
    	grosssalary=salary+allowance;
    	return grosssalary;
	}
	double calculateNetSalary(double grosssalary,double deductions) {
    	this.deductions=deductions;
    	netsalary=grosssalary-deductions;
    	return netsalary;
	}
	void displayDetails() {
		 System.out.println("Gross Salary: " + grosssalary);
	     System.out.println("Net Salary: " + netsalary);
	}
	public static void main(String[] args) {
		EmployeeSalary obj=new EmployeeSalary();
		double gross = obj.calculateSalary(25000, 5000);

        obj.calculateNetSalary(gross, 2000);

        obj.displayDetails();
		
//		1.Scenario: A company wants to calculate the monthly salary of its employees, including allowances and deductions. 
//		Requirements: 
//		1. Create a class EmployeeSalary. 
//		2. Create a method calculateSalary() that accepts basic salary and allowance and returns the gross salary. 
//		3. Create a method calculateNetSalary() that accepts gross salary and deductions and returns the net salary. 
//		4. Create a method displayDetails() to display the employee name, gross salary, and net salary. 
//		5. Call all methods from main() without using a constructor. 
//		Sample input: Basic salary = ₹25,000, Allowance = ₹5,000, Deductions = ₹2,000. 
//		Expected output: 
//		Gross Salary: 30000.0 
//		Net Salary: 28000.0 
	}

}
