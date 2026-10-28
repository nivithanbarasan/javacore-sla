package com.assignment.java;

class Vehicle{
	  void start() {
	        System.out.println("Vehicle is starting");
	    }

	    void stop() {
	        System.out.println("Vehicle is stopping");
	    }
}
class car extends Vehicle{
	void displayType() {
		System.out.println("Vehical type :car");
	}
}
class bike extends Vehicle{
	void displayType() {
		System.out.println("Vehical type :bike");
	}
}
public class RentalCompany {

	public static void main(String[] args) {
		// 2. A rental company has a parent class Vehicle with methods start() and stop(). The subclasses Car and Bike inherit these methods and have their own method called displayType().
//Implement inheritance and demonstrate how both subclasses reuse the parent class methods.
		car c = new car();
        c.displayType();
        c.start();
        c.stop();

        bike b = new bike();
        b.displayType();
        b.start();
        b.stop();
	}

}
