package com.assignment.java;

public class EletricityBill {
	double bill=0;
	double fixedamt=50; 
	double finalamount;
	 double calculateBill(int units){
		
		 if(units<=100) {
			return bill=2*units;
		 }
		 else if(units<=200) {
			return  bill=(2*100)+(units-100)*3;
		 }
		 else {
			 return bill=(2*100)+(3*100)+(units-200)*5;
		 }
	 }
	 void addFixedCharge(double bill) {
		 finalamount=fixedamt+bill;
	 }
	 void display() {
		 System.out.println("Energy Charge:"+bill);
		 System.out.println("fixed amount:"+fixedamt);
		 System.out.println("final amount:"+finalamount);
	 }
	public static void main(String[] args) {
		EletricityBill obj=new EletricityBill();
		double billamt=obj.calculateBill(250);
		obj.addFixedCharge(billamt);
		obj.display();
		
		
//		4.Scenario: An electricity board calculates a household bill based on units consumed. 
//		Requirements: 
//		1. Create a class ElectricityBill. 
//		2. Create a method calculateBill() that accepts the number of units consumed and returns the bill amount using these slabs: 
//		○ First 100 units: ₹2 per unit 
//		○ Next 100 units: ₹3 per unit 
//		○ Above 200 units: ₹5 per unit 
//		3. Apply the rates progressively. For example, 250 units means 100 units at ₹2, 100 units at ₹3, and 50 units at ₹5. 
//		4. Create a method addFixedCharge() that accepts the bill amount and adds a fixed charge of ₹50. 
//		5. Create a method to display the final bill. 
//		Sample input: 250 units. 
//		Expected output: 
//		Energy Charge: 750.0 
//		Fixed Charge: 50.0 
//		Final Bill: 800.0 

	}

}
