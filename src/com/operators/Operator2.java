package com.operators;

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("Welcome to bitwise and unary operatorsoperators");
		//Bitwise operators(&,|,^,~)
		int a=5;
		int b=7;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		
		//Unary operators(++,--)increment and decrement operators
		//increment operators increment value by 1
		//decrement operator decreases value by 1
		//pre increment
		System.out.println(++a);
		System.out.println(++b);
		//post increment
		System.out.println(a++);
		System.out.println(b++);
	    //pre decrement
		System.out.println(--a);
		System.out.println(--b);
		//post decrement
		System.out.println(a--);
		System.out.println(b--);
		System.out.println(a);//current value
		System.out.println(b);//current value

	}

	}

}
