package com.stringclass;

public class StringOperations {
	public static void main(String[] args) {
		String str = "Java String pool refers to collections of Strings which are stored in heap memory ";
		
		/* Lowercase */
		System.out.println("Lowercase : " + str.toLowerCase());
		
		/* uppercase */
		System.out.println("Uppercase : " + str.toUpperCase());
		
		/* replace a characters */
		String replacedString = str.replace('a', '$');
		System.out.println("Replaced String : " + replacedString);
		
		// Check if the original String contains the word "collection"
        boolean containsCollection = str.contains("collection");
        System.out.println("Contains 'collection': " + containsCollection);
        
        //  Check if the following String matches the original
        boolean stringsMatch = str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory");
        System.out.println("Strings Match (equalsIgnoreCase): " + stringsMatch);
        
        System.out.println(str.equalsIgnoreCase("Java String pool refers to collection of strings which are stored in heap memory"));
    
}
}
