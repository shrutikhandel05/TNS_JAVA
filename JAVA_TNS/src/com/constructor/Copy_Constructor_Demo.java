package com.constructor;

public class Copy_Constructor_Demo {

	public static void main(String[] args) {
		//Copy_constructor class object
		Copy_constructor c1=new Copy_constructor(01,"shruti");
		Copy_constructor c2=new Copy_constructor(c1);
		c1.Display();
		c2.Display();
		
		//Copy_constructor1 class object
		Copy_constructor1 c3=new Copy_constructor1(02,"Gauri");
		Copy_constructor1 c4=new Copy_constructor1();
		c4.i=c3.i;
		c4.name=c3.name;
		c4.Display();
		c3.Display();
;
	}

}
