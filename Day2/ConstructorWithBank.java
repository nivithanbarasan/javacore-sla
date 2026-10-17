package com.assignment.java;

public class ConstructorWithBank {
	
 int accountNumber;
 String holderName;
 double balance;
 ConstructorWithBank() {
	this.accountNumber=1001;
	this.holderName="priya";
	this.balance=5000;
 }
 void displayAccount() {
	 System.out.println(accountNumber+" "+holderName+" "+balance);
 }
 
  
	public static void main(String[] args) {
		ConstructorWithBank obj=new ConstructorWithBank();
		ConstructorWithBank obj1=new ConstructorWithBank();
		obj.displayAccount();
		obj1.displayAccount();
		// TODO Auto-generated method stub
//		2.Scenario: A bank automatically creates a savings account with predefined initial details.
//		Requirements:
//		1. Create a class BankAccount with accountNumber, holderName, and balance.
//		2. Create a no-argument constructor that initializes them to 1001, "Priya", and 5000.0.
//		3. Create a method displayAccount() to display the details.
//		4. Create two objects and display their details.
//		Task: Explain how the no-argument constructor initializes each object.

	}

}
