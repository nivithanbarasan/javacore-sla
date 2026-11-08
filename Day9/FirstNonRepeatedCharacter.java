package com.String;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// Q1. First Non-Repeated Character
  //Write a Java program to find the first character that appears only once in a String.

//Input: swiss
//Expected Output: w
		String word="swiss";
		for(int i=0;i<word.length();i++) {
			boolean repeated=false;
			for(int j=0;j<word.length();j++) {
				if(i!=j && word.charAt(i)==word.charAt(j)) {
					repeated=true;
					break;
				}
			}
		if(repeated==false) {
			System.out.println(word.charAt(i));
			break;
		}
		
		}
	}

}
