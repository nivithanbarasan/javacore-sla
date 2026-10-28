package com.assignment.java;

class person{
	String name;
	int age;
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class student extends person{
	int rollnumber;
	student(String name,int age,int rollnumber){
		super(name,age);
		this.rollnumber=rollnumber;
	}
	void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollnumber);
	}
}
public class University {

	public static void main(String[] args) {
		// 5. A university application has a parent class Person with a parameterized constructor that accepts name and age. 
//A subclass Student has an additional attribute rollNumber. The subclass must initialize the parent attributes using super().
//Write a Java program demonstrating constructor execution in inheritance using super() and display all student details.
		student obj=new student("nivitha",21,101);
		obj.display();
	}

}
