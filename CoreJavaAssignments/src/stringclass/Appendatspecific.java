package com.stringclass;

public class Appendatspecific {
	public static void main(String[] args) {
		  StringBuffer buffer = new StringBuffer();
	        buffer.append("it is used to _ at the specified index position");
	        buffer.replace(14, 16, "insert text ");
	        System.out.println(buffer);
	}

}
