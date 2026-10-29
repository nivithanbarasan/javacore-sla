package com.assignment.java;
import java.util.*;
public class Atmwithdraw {

	public static void main(String[] args) {
		// Q1.ATM Withdrawal ATM allows withdrawal only if the PIN is correct and the account balance is sufficient. Otherwise, display the appropriate error message.
//Use: if-else Test cases: Correct PIN and sufficient balance; incorrect PIN; insufficient balance.
        Scanner sc=new Scanner(System.in);
        int incorrect=1234;
        double balance=10000;
        System.out.println("enter the pin:");
        int pin=sc.nextInt();
        if(pin==incorrect) {
        	System.out.println("enter the withdrawal amount");
         double withdrawal=sc.nextInt();
         if(balance>=withdrawal) {
        	 balance=balance-withdrawal;
        	 System.out.println("successfully withdraw ");
        	 System.out.println("balance :"+balance);
         }
         else {
        	 System.out.println("insufficient balance");
         }
         
        }
        else {
        	System.out.println("incorrect password");
        }
	}

}
