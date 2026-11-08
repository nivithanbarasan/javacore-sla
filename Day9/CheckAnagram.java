package com.String;

public class CheckAnagram {

	public static void main(String[] args) {
		//Q3. Check Anagram

//Write a Java program to check whether two Strings contain the same characters in a different order.
//Input: listen, silent
//Expected Output: Anagram
       String str1="listen";
       String str2="silent";
       char[] a1=str1.toCharArray();
       char[] a2=str2.toCharArray();
       
       if(str1.length()!=str2.length()) {
    	   System.out.print("not a anagram");
       }
       else {
    	   for(int i=0;i<a1.length;i++) {
    		   for(int j=0;j<a2.length-1-i;j++) {
    			   if(a1[j]>a1[j+1]) {
    				   char temp=a1[j];
    				   a1[j]=a1[j+1];
    				   a1[j+1]=temp;
    			   }
    		   }
    	 }
    	   for (int i = 0; i < a2.length; i++) {
               for (int j = 0; j < a2.length - 1 - i; j++) {
                   if (a2[j] > a2[j + 1]) {
                       char temp = a2[j];
                       a2[j] = a2[j + 1];
                       a2[j + 1] = temp;
                   }
               }
           }
    	   boolean anagram = true;
    	   for(int i=0;i<a1.length;i++) {
    		   if(a1[i]!=a2[i]) {
    			   anagram=false;
    			   break;
    		   }
    	   }
    	   if(anagram) {
    		   System.out.println("its is a anagram");
    	   }
    	   else {
    		   System.out.print("not a anagram");
    	   }

       }
	}

}
