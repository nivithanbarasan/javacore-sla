package com.assignment.java;

public class StudentResult {
	int total;
	double avg;
	
	
	int calculateTotal(int mark1,int mark2,int mark3,int mark4,int mark5) {
		total=mark1+mark2+mark3+mark4+mark5;
		return total;
	}
	double calculateAverage(int total) {
		avg=total/5;
		return avg;
		
	}
	String calculateGrade(double avg) {
		return avg>=90 ?"A":
			avg>=75 && avg<=89 ? "B":
				avg>=50 && avg<=74 ? "C":
					"Fail";
	}
void display() {
	System.out.println("total :"+total);
	System.out.println("average :"+avg);
	
}
	public static void main(String[] args) {
		StudentResult obj=new StudentResult();
		int average=obj.calculateTotal(85, 78, 92, 88, 77);
		double avgmark=obj.calculateAverage(average);
		String grade=obj.calculateGrade(avgmark);
		obj.display();
		System.out.println("grade :"+grade);
		
//		.Scenario: A college wants to calculate students' results based on five subject marks. 
//		Requirements: 
//		1. Create a class StudentResult. 
//		2. Create a method calculateTotal() that accepts five subject marks and returns the total. 
//		3. Create a method calculateAverage() that accepts the total and returns the average. 
//		4. Create a method calculateGrade() that accepts the average and returns a grade: 
//		○ 90 and above: A 
//		○ 75–89: B 
//		○ 50–74: C 
//		○ Below 50: Fail 
//		5. Create a method to display the total, average, and grade. 
//		Sample input: 85, 78, 92, 88, 77. 
//		Expected output: 
//		Total: 420 
//		Average: 84.0 
//		Grade: B 

	}

}
