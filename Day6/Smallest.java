package com.assignment.java;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// Write a program to find the smallest number in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int number=arr[0];
        for(int i=1;i<=arr.length-1;i++) {
        	if(arr[i]<number) {
        		number=arr[i];
        	}
        	}
        System.out.println("smallest number"+number);

	}

}
