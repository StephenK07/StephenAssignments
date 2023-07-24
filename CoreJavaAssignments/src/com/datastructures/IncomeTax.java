package com.datastructures;
import java.util.*;
public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the slab value");
		long slab = sc.nextLong();
		
		if(slab>=0&slab<=180000) {
			System.out.println("Nil");
		} else if(slab>180000&slab<=300000) {
			System.out.println("Tax to be paid is " +slab*0.1);
		} else if(slab>300000&slab<=500000) {
			System.out.println("Tax to be paid is " +slab*0.2);
		}else  {
			System.out.println("Tax to be paid is " +slab*0.3	);
		}
					
	}

}
