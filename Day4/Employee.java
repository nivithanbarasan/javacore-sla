package com.java.basics;

class employee1{
	
	double amount(double initial) {
		return initial;
	}
}
class bonuses extends employee1{
	double amount(double amount) {
		return amount+1000;
		
	}
}
public class Employee {
	public static void main(String[] args) {
		employee1 obj=new employee1();
		employee1 obj1=new bonuses();
		System.out.println(obj.amount(10000));
		System.out.println(obj1.amount(10000));
		// 2.A calculator application performs addition for two integers and two decimal numbers. Another application requires different employee types to calculate bonuses differently.
		//Write a Java program demonstrating method overloading and method overriding.

	}

}
