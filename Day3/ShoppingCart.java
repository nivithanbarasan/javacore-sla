package com.assignment.java;

public class ShoppingCart {
	double total;
	String membershipe="Gold";
	double Discount;
	double finalamount;
	
	double calculateTotal(double price1,double price2,double price3){
		total=price1+price2+price3;
		return total;
	}
	double calculateDiscount(double total) {
		if(membershipe=="Gold") {
			Discount=20*total/100;
			return Discount;
		}
		else if(membershipe=="Silver") {
			Discount=10*total/100;
			return Discount;
		}
		else {
			Discount=5*total/100;
			return Discount;
		}
	}
	double calculateFinalAmount(double Discount) {
		finalamount=total-Discount;
		return finalamount;
	}
	void display() {
		System.out.println("Total :"+total);
		System.out.println("Discount :"+Discount);
		System.out.println("Final amount :"+finalamount);
	}
	public static void main(String[] args) {
		ShoppingCart obj=new ShoppingCart();
		double total=obj. calculateTotal(2000,1500,500);
		double discount=obj.calculateDiscount(total);
		obj.calculateFinalAmount(discount);
		obj.display();
		
		
		
//		3.Scenario: An online shopping application calculates the final bill based on the purchase amount and membership type. 
//		Requirements: 
//		1. Create a class ShoppingCart. 
//		2. Create a method calculateTotal() that accepts the prices of three products and returns the total. 
//		3. Create a method calculateDiscount() that accepts the total and membership type. 
//		Apply: 
//		○ Gold: 20% discount 
//		○ Silver: 10% discount 
//		○ Regular: 5% discount 
//		4. Create a method calculateFinalAmount() that returns the amount after discount. 
//		5. Create a method to display the total, discount, and final amount. 
//		Sample input: ₹2,000, ₹1,500, ₹500; membership = Gold. 
//		Expected output: 
//		Total Amount: 4000.0 
//		Discount: 800.0 
//		Final Amount: 3200.0 

	}

}
