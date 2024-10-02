package com.learn.java;

public class Customer {
	
	//Variable declaration - name is called as variable/attribute/data, String data type
	String name;
	//private can be accessed by the Customer class, private access modifiers
	private int age;

	String mobile;
	String address;
	
	String printValue = "Customer Age: ";
	
	
	//Encapsulation - Protecting/hiding something from external world.
	void setAge(int age) throws Exception{
		
		if (age <= 120) {
			//this keyword can be used when method variable and class variable are same.
			this.age = age;
		}else {
			throw new Exception("Age is greater than 120");
		}
	}
	
	int getAge(){
		
		return age;
	}
	


	//method also called as actions
	//void means return nothing, void here is referred as return type.
	private void displayAge() {
		
		System.out.println(printValue + age);
		
	}
	
	//int here referred as return type of method returnAge.
	int returnAge() {
		
		System.out.println(printValue + age);
		return age;
		
	}

}
