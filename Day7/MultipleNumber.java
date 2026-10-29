package com.assignment.java;

public class MultipleNumber {

	public static void main(String[] args) {
		// Q5. Skip Multiples of 3 Print numbers from 1 to 30, but skip all numbers divisible by 3.
//- Use: for and continue
		for(int i=0;i<=30;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
