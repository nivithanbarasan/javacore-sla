package com.assignment.java;
import java.util.*;
public class StudentGrade {

	public static void main(String[] args) {
		// Q3. Student Grade System Accept marks and display grades:
//90–100: A
//75–89: B
//50–74: C
//Below 50: Fail
//Invalid marks: Display an error message.
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		String grade=(mark>=90)?"A":
			(mark<=75 && mark>=89)?"B":
			(mark<=50 && mark>=89)?"C":
				(mark>50)?"fail":"Invalid marks";
				
		System.out.println(grade);
	}

}
