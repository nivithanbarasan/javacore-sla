package com.assignment.java;
import java.util.*;
public class LoginAttempt {

	public static void main(String[] args) {
		// Q4. Login Attempt System A user has three login attempts. If the password is correct, display “Login Successful” and stop the loop. 
		//Otherwise, display “Invalid Password.” - Use: while and break
		Scanner sc=new Scanner(System.in);
		String password="nivitha123";
		int attempts=1;
		while(attempts<=3) {
			System.out.println("enter the password :");
			String  pass=sc.nextLine();
			if(password.equals(pass)) {
				System.out.println("login successfully");
				break;
			}
			else {
				System.out.println("invalid password");
			}
			attempts++;
		}
		sc.close();
	}

}
