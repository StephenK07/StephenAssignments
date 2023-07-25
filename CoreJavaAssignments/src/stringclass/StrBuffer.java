package com.stringclass;

public class StrBuffer {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
        buffer.append("This method returns the reversed object on which it was called");
        buffer.reverse();
        System.out.println(buffer);
	}

}
