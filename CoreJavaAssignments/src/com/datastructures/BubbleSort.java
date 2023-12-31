package com.datastructures;

import java.util.Arrays;

public class BubbleSort {
	 static void bubbleSortAlgorithm(int arr[]) {
		  
		    int len = arr.length-1;
		    
		    for (int i = 0; i < len; i++){
		    
		        // check if swapping occurs
		        boolean isSwap = false;
		        
		      for (int j = 0; j < len - i; j++){
		      
		        if (arr[j] > arr[j + 1]) {
		          int temp = arr[j];
		          
		          arr[j] = arr[j + 1];
		          arr[j + 1] = temp;
		          isSwap = true;
		        }
		      }
		      
		      // no swapping means the array is sorted already
		      // so no need for further comparison
		      if (!isSwap)
		        break;
		    }
		}

	public static void main(String[] args) {
		int[] data = {5,12,14,6,78,19,1,23,26,35,27,7,52,86,47};
	    
	    bubbleSortAlgorithm(data);
	    
	    System.out.println("The array performing the Bubble Sort Algorithm is:");
	    System.out.println(Arrays.toString(data));
	  }
		
	}


