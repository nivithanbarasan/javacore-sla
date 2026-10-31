package com.assignment.java;
import java.util.*;
public class Pattern10 {
public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.print("enter the row :");
	       int row=sc.nextInt();
	       System.out.print("enter the column :");
	       int col=sc.nextInt();
	       for(int i=1;i<=row;i++) {
	    	   for(int j=1;j<=col-i;j++) {
	    		   System.out.print("  ");
	    	   }
	    	   for(int j=i;j>=1;j--) {
	    		   System.out.print(j+" ");
	    	   }
	    	   for(int j=2;j<=i;j++) {
	    		   System.out.print(j+" ");
	    	   }
	    	   System.out.println();
	       }
	       
//	       enter the row :5
//	       enter the column :5
//	               1 
//	             2 1 2 
//	           3 2 1 2 3 
//	         4 3 2 1 2 3 4 
//	       5 4 3 2 1 2 3 4 5
	    }
}
