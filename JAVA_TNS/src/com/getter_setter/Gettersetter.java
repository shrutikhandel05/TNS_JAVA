package com.getter_setter;

public class Gettersetter {
   private int Emp_id;
   private String Emp_name;
   private float salary;
   private char gender;
   
   
public Gettersetter(int emp_id, String emp_name, float salary, char gender) {
	
	Emp_id = emp_id;
	Emp_name = emp_name;
	this.salary = salary;
	this.gender = gender;
}


public int getEmp_id() {
	return Emp_id;
}


public void setEmp_id(int emp_id) {
	Emp_id = emp_id;
}


public String getEmp_name() {
	return Emp_name;
}


public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}


public float getSalary() {
	return salary;
}


public void setSalary(float salary) {
	this.salary = salary;
}


public char getGender() {
	return gender;
}


public void setGender(char gender) {
	this.gender = gender;
}

   
}
