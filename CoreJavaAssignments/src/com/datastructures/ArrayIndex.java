package com.datastructures;

import java.util.Scanner;
import java.util.*;
public class ArrayIndex {
    public static void main(String[] args) {
    	int num,i;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Write the value to be searched");
		num = sc.nextInt();
		int[] a = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(i=0;i<a.length;i++) { 
			if(a[i] == num) {
			System.out.println("The " + num+ " is found at the index " +i);
		}
	}
}
    
}
