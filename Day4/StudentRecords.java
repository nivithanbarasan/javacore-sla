package com.java.basics;

public class StudentRecords {

	StudentRecords(String name){
		System.out.println("name :"+name);
	}
	StudentRecords(String name,int age){
		System.out.println("name :"+name+" "+"age :"+age);
	}
	public static void main(String[] args) {
		 StudentRecords obj=new  StudentRecords("nivitha");
		 StudentRecords obj1=new  StudentRecords("nivitha",21);
		// 1.A student management system needs to create student objects with different details. Some students have only a name, while others have a name and age.
//Write a Java program using constructor overloading to create student objects with different sets of information.

	}

}
