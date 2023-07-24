package com.datastructures;
import java.util.*;
public class SimpleandCompoundInterest {
	public static void main(String[] args) {
		double p,r,t,si,ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of principal = ");
		p = sc.nextDouble();
		System.out.println("Enter the Annual rate of Interest = ");
		r = sc.nextDouble();
		System.out.println("Enter the time = ");
		t = sc.nextDouble();
		si = (p * (t*12) * r)/100;
		ci = p*Math.pow(1.0+r/100.0,(t*12)) - p;
		System.out.println("Simple Interest: "+si);
		System.out.println("Compound Interest: "+ci);
		
	}

}
