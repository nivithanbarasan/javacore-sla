package com.assignment.java;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row :");
		int row=sc.nextInt();
		System.out.print("enter the column  :");
		int col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<i;j++) {
				if((i+j)%2==0) {
				System.out.print("0 ");	
			}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();

		}
//		enter the row :5
//		enter the column  :5
//
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
	}

}
