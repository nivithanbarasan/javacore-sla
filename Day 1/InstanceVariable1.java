package com.java.basics;
import java.util.*;
public class InstanceVariable1 {

	String name;
	int rollnumber;

	void student1() {
	       System.out.println("studentname :"+name);
	       System.out.println("studentrollno :"+rollnumber);       
    }
	public static void main(String[] args) {
		//1. Student Registration — Instance Variables
//Question: Create three students with different names and roll numbers using a method,
	Scanner sc=new Scanner(System.in);
	InstanceVariable1 obj=new InstanceVariable1();
	InstanceVariable1 obj1=new InstanceVariable1();
	InstanceVariable1 obj2=new InstanceVariable1();
	
	System.out.print("enter the name1:");
	obj.name=sc.nextLine();
	System.out.print("enter the rollnumber1");
	obj.rollnumber=sc.nextInt();
	
	sc.nextLine();
	System.out.print("enter the name2:");
	obj1.name=sc.nextLine();
	System.out.print("enter the rollnumber2:");
	obj1.rollnumber=sc.nextInt();
	
	sc.nextLine();
	System.out.print("enter the name3:");
	obj2.name=sc.nextLine();
	System.out.print("enter the rollnumber3:");
	obj2.rollnumber=sc.nextInt();

	obj.student1();
	obj1.student1();
	obj2.student1();
	
	sc.close();
	}

}
