package com.string;

public class String1 {

	public static void main(String[] args) {
		// initialise string
		char ch[]= {'I','n','d','i','a'};
		for(char c:ch)
		{
		  System.out.print(c);		}
	    
	String s1=new String(ch);
	String s2=new String(s1);
	
	System.out.println(s1);
	System.out.println(s2);
	String longString="Shruti"+"Mahesh"+"Khandel";
	System.out.println(longString);
	}
	

}
