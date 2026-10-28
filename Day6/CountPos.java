package com.assignment.java;

import java.util.Scanner;

public class CountPos {

	public static void main(String[] args) {
		// 4.Write a program to count positive numbers, negative numbers and zeros in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int positive=0;
		int negative=0;
		int zero=0;
		int oddcount=0;
		int evencount=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0){
				negative++;
			}
			else {
				zero++;
			}
		}
		System.out.println("positive number :"+positive);
		System.out.println("negative number :"+negative);
		System.out.println("zero number :"+zero);
	}

}
