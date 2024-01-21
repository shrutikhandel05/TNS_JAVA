package com.constructor;

public class Clone_Demo {

	public static void main(String[] args) {
		try {
		Clone cn=new Clone(21,"Shruti");
        Clone cn1=(Clone)cn.clone();
        
        System.out.println(cn.id+""+cn.name);
        System.out.println(cn1.id+""+cn1.name);
        
	}catch(CloneNotSupportedException c) {}

}
}


