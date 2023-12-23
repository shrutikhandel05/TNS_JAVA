package com.variable;
/*typecasting: There are 2 types of typecasting explicit & implicit*/
/*implicit typecasting also known as widening and explicit typecasting also known as 
 *narrowing.
 *Widening:to convert small size data type into large size datatype & it can implicitely did by 
 *the compiler
 *Narrowing:to convert large size datatype into small one & we have to do it explicitely by writing it
*/
 
public class Variable2 
{
	public static void main(String arg[])
	 {
		//Widening :it did implicitely to convert small datatype into large datatype
		int a=12;
		float f=a;
		long b=56;
		double d=a;
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		System.out.println(d);
		//narrowing:it did explicitely to convert large datatype into small datatype
		double d1=345.77778889;
		long l=123456789;
		int i=(int)d1;
		float f1=(float)d1;
		short s=(short)d1;
		short s1=(short)l;
		int l1=(int)l;
		System.out.println(i);
		System.out.println(f1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(l1);
		
		
	 
		
		
	 }
}
