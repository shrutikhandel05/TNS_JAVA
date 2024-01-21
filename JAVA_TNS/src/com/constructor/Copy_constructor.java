package com.constructor;
///there is no copy constructor in java how ever we can copy th values from one object to another like 
//copy constructor in c++ 
//it includes many ways like
//by constructor
//by assigning values of one object to another
//by clone method of object class
public class Copy_constructor {

	int id;
	String name;
	//initializing objects
	public Copy_constructor(int id, String name) {
	    
		this.id = id;
		this.name = name;
	}
	//constructor to initialise other object
	//in this type we need to give object as a parameter so that it can copy the resources from the existing one
    public Copy_constructor(Copy_constructor c)
    {
    	id=c.id;
    	name=c.name;
    }
    void Display()
    {
    	System.out.println(id+" "+name);
    }
    
    
   
    
}
	
	
	

