package com.string;

public class StringCapacity {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//default 16
	    sb.append("World");
	    System.out.println(sb.capacity());
	    sb.append("My name is shruti");
	    System.out.println(sb.capacity());
		

	}

}
