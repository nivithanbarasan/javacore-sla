package com.java.basics;

public class LocalVariable1 {
	void Electricity(int units) {
		int bill=0;
		if(units>=100) {
			bill=units*2;
		}
		else if(units <= 200) {
		    bill=(100*2)+(units-100)*3;
        } 
        else {
            bill=(100*2)+(100*3)+(units-200)*5;
        }
		 System.out.println("Units:" + units);
	     System.out.println("Electricity Bill: Rs."+ bill);
	}

	public static void main(String[] args) {
		// 3.Electricity Bill — Local Variables
//Question: Calculate the electricity bill using a method and local variables. Rates: first 100 units ₹2/unit, next 100 units ₹3/unit,
//and above 200 units ₹5/unit.
		LocalVariable1 obj=new LocalVariable1();
		obj.Electricity(250);
	}

}
 
