package com.java.basics;

class bankdetails{
	private String Name;
	private double balance;
	bankdetails(String Name,double balance){
		this.Name=Name;
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
	void withdraw(double withdrawamount) {
		if(balance>=withdrawamount) {
			balance-=withdrawamount;
			System.out.println("balance amount after the withdraw :"+balance);
		}
		else {
			System.out.println("invalid amount");
		}
	}
}
public class BankingApplication {

	public static void main(String[] args) {
		bankdetails obj=new bankdetails("nivitha",10000);
		obj.withdraw(5000);
		
		// 3. A banking application stores an account holder's name and balance. The balance should not be modified directly from outside the class,
		//and withdrawals must not exceed the available balance.Implement encapsulation using private variables, getters, setters where appropriate, and a withdrawal method.

	}

}
