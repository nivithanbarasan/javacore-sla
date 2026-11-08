package com.String;
import java.util.*;
public class RemoveTheDuplicate {

	public static void main(String[] args) {
		//Q2. Remove Duplicate Characters

//Write a Java program to remove duplicate characters while maintaining the original order.
//Input: programming
//Expected Output: progamin
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the character :");
     String Chara=sc.nextLine();
     char[] arr=Chara.toCharArray();
     String result="";
     for(int i=0;i<arr.length;i++) {
    	 boolean duplicate=false;
    	 for(int j=0;j<i;j++) {
    		 if(arr[i]==arr[j]) {
    			duplicate=true;
    			break;
    		 }
    	 }
    	 if(duplicate==false) {
    		 result+=arr[i];
    	 }
     }   
System.out.print(result);
	}
}
