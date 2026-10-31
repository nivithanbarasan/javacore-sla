package com.assignment.java;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row :");
		int row=sc.nextInt();
		System.out.print("enter the column  :");
		int col=sc.nextInt();
      for(int i=0;i<row;i++) {
    	  for(int j=0;j<col;j++) {
    		  if(i==0 || i==row-1 || j==0 || j==col-1) {
    			  System.out.print("* ");
    		  }
    		  else {
    			  System.out.print("  ");
    		  }
    		  
    	  }
    	  System.out.println();
    	 
      }
      
//      enter the row :5
//      enter the column  :5
//      * * * * * 
//      *       * 
//      *       * 
//      *       * 
//      * * * * * 
   
	}

}
