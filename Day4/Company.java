package com.java.basics;

class Companyabc{
	void employee() {
		System.out.println("company has different employee");
		}
}
class developer extends Companyabc{
	@Override
	void employee() {
		System.out.println("Employee Type: Developer");
         System.out.println("Responsibility: Develop and test software");
	}
}
class Manager extends Companyabc{
	void employee() {
			System.out.println("Employee Type: Manager");
			System.out.println("Responsibility: Manage the team and projects");
	}
}

public class Company {

	public static void main(String[] args) {
		//4. A company has different employee types: Developer and Manager. Both share common employee details, but each has a different responsibility description.
//Write a Java program using inheritance and method overriding to display the responsibilities of each employee type.
		Companyabc obj=new developer();
		Companyabc obj1=new  Manager();
		 obj.employee();
		 obj1.employee();
	}

}
