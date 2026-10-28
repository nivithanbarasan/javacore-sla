package com.assignment.java;

class  BankAccount{
	void display1() {
         System.out.println("Bank Account Details");
	}
}
class SavingsAccount extends BankAccount{
	void display2() {
		System.out.println("Savings Account Details");
	}
}
class PremiumSavingsAccount extends SavingsAccount {
	void display3() {
		System.out.println("Premium Savings Account Details");
	}
}
public class Banking {
	public static void main(String[] args) {
		// 3. A banking application has three classes: BankAccount, SavingsAccount, and PremiumSavingsAccount. SavingsAccount inherits from BankAccount,
//while PremiumSavingsAccount inherits from SavingsAccount.Write a Java program to demonstrate multilevel inheritance and display account details at each level.
		
		PremiumSavingsAccount psa=new PremiumSavingsAccount();
		psa.display1();
		psa.display2();
		psa.display3();
	}

}
