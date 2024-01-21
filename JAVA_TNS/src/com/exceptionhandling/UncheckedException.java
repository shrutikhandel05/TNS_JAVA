package com.exceptionhandling;
//simple try catch block to handle exception
//exception handling is used to make the software more userfriendly by handling the exception
//we handled the exception by puting a user friendly message to the user instead of that exception
public class UncheckedException {

	public static void main(String[] args) {
		int Arr[]=new int[] {2,32,12,65,43}; 
		try {
		System.out.println(Arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Please enter the element at the given index..as "+e.getMessage());

		}
		
		
	    
			
		

	
	}
}

