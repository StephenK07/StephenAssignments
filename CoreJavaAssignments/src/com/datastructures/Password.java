package com.datastructures;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		String username = "stephen";
		String password = "007";
		
		int attempts=0;
		Scanner sc = new Scanner(System.in);
		while (attempts<3) {
		    System.out.println("Enter user name");
		    String name = sc.next();
		    System.out.println("Enter password");
		    String pass = sc.next();

		    if (username.equals(name) && password.equals(pass)) {
		        System.out.println("welcome");
		       
		    } else {
		        attempts++;
		        System.out.println("Invalid credentials");
		    }
		}
		    if(attempts==3){
		        System.out.println("Contact administrator");
		    }
	}

}
