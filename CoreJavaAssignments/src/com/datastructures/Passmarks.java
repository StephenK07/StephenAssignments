package com.datastructures;
import java.util.*;
public class Passmarks {
	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of subject 1 = ");
		s1 = sc.nextInt();
		
		System.out.println("Enter the marks of subject 2 = ");
		s2 = sc.nextInt();
		
		System.out.println("Enter the marks of subject 3 = ");
		s3 = sc.nextInt();
		if(s1>=60&s2>=60&s3>=60) {
            System.out.println("Passed");
        }else if((s1>=60&s2>=60)|(s2>=60&s3>=60)|(s1>=60&s3>=60)){
            System.out.println("Promoted");

        }else {
            System.out.println("Failed");
        }
	}

}
