package com.learn.java;

public class AccountRunner {
	
	public static void main(String args[]) {
		
		//Create new account object
		
		Account account1 = new Account();
		
		account1.setAccountNumber(120001);
		account1.setAccountType("Savings");
		account1.setAccountBalance(10000);
		
		
		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() + 
				", Account Type: " + account1.getAccountType() + 
				", Account Balance: " + account1.getAccountBalance() );
		
		
		account1.depositMoney(100);
		
		
		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() + 
				", Account Type: " + account1.getAccountType() + 
				", Account Balance: " + account1.getAccountBalance() );
		
		account1.withdrawMoney(50);
		
		
		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() + 
				", Account Type: " + account1.getAccountType() + 
				", Account Balance: " + account1.getAccountBalance() );
		
	}


}
