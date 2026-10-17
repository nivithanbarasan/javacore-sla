package com.assignment.java;

public class ConstructorWithProduct {
	int productId;
	String productName;
	int price;
	ConstructorWithProduct(){
        productId = 0;
        productName = "Not Available";
        price = 0;

	}
	void defaultconstructor() {
		System.out.println("default constructor");
		System.out.println(productId+" "+productName+" "+price);
		
	}
	ConstructorWithProduct(int productId,String productName){
		this.productId=productId;
		this.productName=productName;
		this.price = 0;
	}
	void twoparameterconstructor() {
		System.out.println("two parameter constructor");
		System.out.println(productId+" "+productName+" "+price);
	}
	ConstructorWithProduct(int productId,String productName,int price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	void threeparameterconstructor() {
		System.out.println("three parameterconstructor");
		System.out.println(productId+" "+productName+" "+price);
	}
	public static void main(String[] args) {
		ConstructorWithProduct obj=new ConstructorWithProduct();
		ConstructorWithProduct obj1=new ConstructorWithProduct(101,"laptop");
		ConstructorWithProduct obj2=new ConstructorWithProduct(101,"laptop",2000);
		obj.defaultconstructor();
		obj1.twoparameterconstructor();
		obj2.threeparameterconstructor();
		//		4.Scenario: An online shopping application allows products to be created with different levels of 
//		information. 
//		Requirements: 
//		1. Create a class Product with productId, productName, and price. 
//		2. Create three constructors: 
//		○ A no-argument constructor. 
//		○ A constructor accepting productId and productName. 
//		○ A constructor accepting productId, productName, and price. 
//		3. Initialize appropriate values in each constructor. 
//		4. Create three objects, each using a different constructor. 
//		5. Display all product details. 
//		Task: Demonstrate how Java selects the correct constructor based on the arguments supplied. 
	}

}
