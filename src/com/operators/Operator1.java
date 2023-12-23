package com.operators;

public class Operator1 {

	public static void main(String[] args) {
		

	
	System.out.println("Welcome to operators");
	int a=10;
	int b=20;
	//Arithmatic operators
    System.out.println(a+b);//+
	System.out.println(a-b);//-
	System.out.println(a*b);//*
	System.out.println(a/b);//(/)
	System.out.println(a%b);//%
	
	//comparison operators
	System.out.println(a==b);//return false
	System.out.println(a!=b);//return false
	System.out.println(a>=b);//return false
	System.out.println(a<=b);//return true
	System.out.println(a>b);//return false
	System.out.println(a<b);//return true
	
	//conditional operators
	//if statement
    //if-else
	//else-if
	//switch case
	//ternary operator
	String res=(a!=b)?"yes" : "no";
	System.out.println(res);
	
	//Logical operators(&&,||,!)
	if(a==30 && b==20)
	{
	System.out.println(true);
	}
	else
	{	
		System.out.println(false);
	
	}
	if(a==30 || b==20)
	{
	System.out.println(true);
	}
	else
	{	
		System.out.println(false);
	
	}
	System.out.println(!(a==10));		
	}
}
