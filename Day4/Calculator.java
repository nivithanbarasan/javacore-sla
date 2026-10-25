package com.java.basics;

public class Calculator {
	Calculator(int a,int b){
		
		System.out.println("a+b :"+ (a+b));
	}
	Calculator(double a,double b){
		System.out.println("a+b :"+ (a+b));
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator(10,20);
		Calculator obj1=new Calculator(20.0,30.0);
		// 2.A calculator application performs addition for two integers and two decimal numbers. Another application requires different employee types to calculate bonuses differently.
//Write a Java program demonstrating method overloading and method overriding.

	}

}
