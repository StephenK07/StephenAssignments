package com.datastructures;
import java.util.*;
public class ArmstrongNumber {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int num=number,sum=0,temp;
		while(number!=0) {
			temp=number%10;
			sum = sum+(temp*temp*temp);
			number = number/10;
			
		}
		
		if(num==sum) {
			System.out.println("The given number is Armstrong Number");
		}
			else {
				System.out.println("The given number is not Armstrong Number");
			}
		
		
	}
}
