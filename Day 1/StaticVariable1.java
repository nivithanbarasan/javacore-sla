package com.java.basics;

public class StaticVariable1 {

	  String employeename;
	  int employeeid;
	  static int count=0;
	 void registername(int id,String name){
		 employeename=name;
		 employeeid=id;
		 count++;
		 System.out.println("employeename :"+name);
		 System.out.println("employeeId:"+id);	 
	 }
	public static void main(String[] args) {
//2. Employee Counter — Static Variable
//Question: Count how many employee objects are created by calling a method to register each employee
		StaticVariable1 obj=new StaticVariable1();
		obj.registername(101,"nivitha");
		
		StaticVariable1 obj1=new StaticVariable1();
		obj1.registername(102,"suriya");
		
		StaticVariable1 obj2=new StaticVariable1();
		obj2.registername(103,"swetha");
		
		System.out.println("number employee register:"+count);
	}

}
