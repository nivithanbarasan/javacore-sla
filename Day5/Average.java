package com.assignment.java;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// 5.Write a program to calculate the average of all elements in an array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			count++;
			sum+=arr[i];
		}
		double average=(double)sum/count;
        System.out.println("average :"+average);
	}
}
