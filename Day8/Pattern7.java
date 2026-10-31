package com.assignment.java;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row :");
		int row=sc.nextInt();
		System.out.print("enter the column  :");
		int col=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
//		enter the row :5
//		enter the column  :5
//
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 

	}

}
