package com.assignment.java;

public class BankingOperation {
	double currentbalance;
	double depositeamount;
    double updatedbalance;
    double withdrawamt;
    double currentamount;
	double deposit(double currentbalance,double depositeamount) {
		this.currentbalance=currentbalance;
		this.depositeamount=depositeamount;
		updatedbalance=currentbalance+depositeamount;
		return updatedbalance;
	}
	double withdraw(double updatedbalace,double withdrawamt) {
		this.withdrawamt=withdrawamt;
		currentamount=updatedbalance-withdrawamt;
		return currentamount;
	}
	void displayTransactionSummary() {
	     System.out.println("Initial Balance: "+currentbalance);
	     System.out.println("Deposited:"+depositeamount);
	     System.out.println("Withdrawn :"+withdrawamt);
	     System.out.println("Final Balance :"+currentamount);
		
	}
	public static void main(String[] args) {
		 BankingOperation obj=new  BankingOperation();
		double totalbalance= obj.deposit(5000,2000);
        obj.withdraw(totalbalance,1500);
		obj.displayTransactionSummary();		
//		5.Scenario: A bank needs a simple application to perform deposits, withdrawals, and balance checks. 
//		Requirements: 
//		1. Create a class BankingOperations. 
//		2. Create a method deposit() that accepts the current balance and deposit amount and returns the updated balance. 
//		3. Create a method withdraw() that accepts the current balance and withdrawal amount. 
//		If sufficient funds are unavailable, display an appropriate message. 
//		4. Create a method checkBalance() that accepts the current balance and displays it. 
//		5. Create a method displayTransactionSummary() that displays the deposit amount, withdrawal amount, and final balance. 
//		6. Call all methods from main() without using constructors. 
//		Sample input: 
//		● Initial balance: ₹5,000 
//		● Deposit: ₹2,000 
//		● Withdrawal: ₹1,500 
//		Expected output: 
//		Initial Balance: 5000.0 
//		Deposited: 2000.0 
//		Withdrawn: 1500.0 
//		Final Balance: 5500.0

	}

}
