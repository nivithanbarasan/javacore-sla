package com.assignment.java;

import java.util.Scanner;

public class OddEvenCount {

	public static void main(String[] args) {
		// Write a program to count how many even and odd numbers are present in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int oddcount=0;
		int evencount=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("eventcount :"+evencount);
		System.out.println("oddcount :"+oddcount);
	}

}
