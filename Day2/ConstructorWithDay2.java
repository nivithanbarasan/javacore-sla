package com.assignment.java;

public class ConstructorWithDay2 {
	int studentId;
	String studentName;
	String course;
	void displayDetails(){
		System.out.println(studentId+" "+studentName+" "+course);
	}

	public static void main(String[] args) {
		ConstructorWithDay2 obj=new ConstructorWithDay2();
		obj.displayDetails();
		//		1.Scenario: A college wants to register a student with default information when no details are
//		provided.
//		Requirements:
//		1. Create a class Student with variables studentId, studentName, and course.
//		2. Create a class with no explicitly declared constructor and observe the default values
//		assigned to its instance variables.
//		3. Create a method displayDetails() to display the student information.
//		4. Create an object and call the display method.
//		Task: What values will be displayed if the variables are not initialized?


	}

}
