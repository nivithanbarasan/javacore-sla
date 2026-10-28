package com.assignment.java;

class product{
	int productId;
	double price;
	 void displayDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Price: " + price);
	    }
}
class Electronics extends product{
	void display() {
		System.out.println(" Electronics product");
		 displayDetails();
	}
}
class Clothing extends  product {
	void display1() {
		System.out.println("clothing product");
		 displayDetails();
	}
}
class Books extends product{
	void display2() {
		System.out.println("books product");
		 displayDetails();
	}
}
public class OnlineShopping {

	public static void main(String[] args) {
		// 4.An online shopping application has a parent class Product with attributes productId and price. 
//		Three subclasses, Electronics, Clothing, and Books, inherit from Product and display their respective product categories.
//      Implement hierarchical inheritance and display the details of all three product types.
		Electronics e=new Electronics();
		 e.productId = 101;
	     e.price = 1000;
		e.display();
		
		Clothing c=new Clothing();
		c.productId = 102;
        c.price = 500;
		c.display1();
		 Books b=new  Books();
		 b.productId = 103;
	     b.price = 300;
		 b.display2();
		
		
	}

}
