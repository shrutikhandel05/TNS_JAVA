package com.conditional;
import java.util.*;
//if conditional statement
public class condition_4 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int no=0;
		no=sc.nextInt();
		System.out.println("Odd numbers are:");	
		for(int i=1;i<=no;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);	
		}
		
	}
		
		
	}



