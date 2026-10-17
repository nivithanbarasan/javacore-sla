package com.assignment.java;

public class ConstructorWithStudent {
int rollNumber;
String studentName;
int mark;
ConstructorWithStudent(int rollNumber,String studentName,int mark){
	this.rollNumber=rollNumber;
	this.studentName=studentName;;
	this.mark=mark;
}
ConstructorWithStudent(ConstructorWithStudent obj){
	this.rollNumber=obj.rollNumber;
	this.studentName=obj.studentName;;
	this.mark=obj.mark;
}
void display() {
	System.out.println(rollNumber+" "+studentName+" "+mark);
}
	public static void main(String[] args) {
	ConstructorWithStudent obj=new ConstructorWithStudent(101,"Nivitha",80);
	ConstructorWithStudent obj1=new ConstructorWithStudent(obj);
	obj.display();
	obj1.mark=95;
	obj1.display();
	
//		5.Scenario: A school needs to create a new student record by copying the details of an existing 
//		student. 
//		Requirements: 
//		1. Create a class StudentRecord with rollNumber, studentName, and marks. 
//		2. Create a parameterized constructor to initialize the original student's details. 
//		3. Create a copy constructor that accepts another StudentRecord object and copies its 
//		values. 
//		4. Create an original student object and a copied student object. 
//		5. Change the copied student's marks and display both records. 
//		Task: Verify that changing the copied object's marks does not change the original object's marks.

	}

}
