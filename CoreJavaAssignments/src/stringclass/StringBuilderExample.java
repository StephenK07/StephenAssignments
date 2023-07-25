package com.stringclass;

public class StringBuilderExample {
	public static void main(String[] args) {
		  String originalString = "Java String pool refers to collection of Strings which are stored in heap memory";

		  

	        // a. Print the string to console in lowercase
	        StringBuilder stringBuilder = new StringBuilder(originalString.toLowerCase());
	        System.out.println("Lowercase: " + stringBuilder.toString());

	 

	        // b. Print the string to console in uppercase
	        stringBuilder = new StringBuilder(originalString.toUpperCase());
	        System.out.println("Uppercase: " + stringBuilder.toString());

	 

	        // c. Replace all 'a' characters in the string with $ sign
	        stringBuilder = new StringBuilder(originalString);
	        for (int i = 0; i < stringBuilder.length(); i++) {
	            if (stringBuilder.charAt(i) == 'a') {
	                stringBuilder.setCharAt(i, '$');
	            }
	        }
	        System.out.println("Replaced String: " + stringBuilder.toString());

	 

	        // d. Check if the original String contains the word "collection"
	        boolean containsCollection = originalString.contains("collection");
	        System.out.println("Contains 'collection': " + containsCollection);

	 

	        // e. Check if the following String matches the original
	        String compareString = "java string pool refers to collection of strings which are stored in heap memory";
	        stringBuilder = new StringBuilder(compareString);
	        boolean stringsMatch = originalString.equalsIgnoreCase(stringBuilder.toString());
	        System.out.println("Strings Match: " + stringsMatch);

	 

	        // f. If the string does not match, check if there is another method to check if the strings are equal
	        if (!stringsMatch) {
	            boolean stringsEqual = originalString.equals(stringBuilder.toString());
	            System.out.println("Strings are equal: " + stringsEqual);
	}
	}
}
