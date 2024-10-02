package com.learn.java;

public class CustomerRunner {

	//Entry point to any java application (comments)
	public static void main(String[] args) throws Exception {
		
		//Customer object instantiation
		//Class is also a data type
		// new Customer() - Object
		Customer customer1 = new Customer();
		
		//Initialise the variables
		customer1.name = "Premika";
		//customer1.age = 200;
		customer1.setAge(200);
		customer1.address = "madurai";
		customer1.mobile = "9791802507";
		
		
		
		System.out.println("Customer Age: " + customer1.getAge());
	}
	
	
	
	
	
}
