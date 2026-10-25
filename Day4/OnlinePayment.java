package com.java.basics;
abstract class Payment{
	abstract void pay();
}
class Upi extends Payment{
 void pay(){
		System.out.println("mobile transcation");
	}
}
class Creditcard extends Payment{
	void pay(){
		System.out.println("credit card payment");
	}
}
public class OnlinePayment {

	public static void main(String[] args) {
		Payment obj=new Upi();
		Payment obj1=new Creditcard();
		 obj.pay();
		 obj1.pay();
		// 5. An online payment application supports UPI and credit card payments. Both payment methods must implement a common payment operation, but their processing logic differs.
//Create an abstract class named Payment with an abstract method processPayment(). Implement it in UPIPayment and CreditCardPayment classes and demonstrate runtime polymorphism

	}

}
