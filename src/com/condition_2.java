package com.conditional;
import java.util.*;
//else if conditional statement
public class condition_2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:6");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are not eligible for voting");
		}
		else if(age>=18)
		{
			System.out.println("You are  eligible for voting");
		}
		else
		{
			System.out.println("please enter valid age number!!");
		}
		
	}

}
