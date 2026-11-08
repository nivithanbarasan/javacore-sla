package com.String;

public class ReverseEachWord {

	public static void main(String[] args) {
		// Q4. Reverse Each Word

//Write a Java program to reverse each word in a sentence without changing the order of the words.
//Input: Java is easy
//Expected Output: avaJ si ysae
      String str1="java is easy";
      String[] word=str1.split(" ");
      for(int i=0;i<word.length;i++) {
    	  String rev=" ";
    	  
    	  for(int j=word[i].length()-1;j>=0;j--) {
    		 rev+=word[i].charAt(j); 
    	  }
    	  System.out.print(rev);
    	  
      }
      
	}

}
