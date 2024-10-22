package com.learn.java;

public class AccountRunner {
	
	public static void main(String args[]) {
		
		//Create new account object
		
		Account account1 = new Account(120001,"Savings", 10000, "Vilakuthoon");


		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() +
				", Account Type: " + account1.getAccountType() +
				", Account Balance: " + account1.getAccountBalance() );


		account1.withdrawMoney(10000);

		
//		account1.depositMoney(0);
//
//
//		//Print the values of account number, type and Balance.
//		System.out.println("Account Number: " + account1.getAccountNumber() +
//				", Account Type: " + account1.getAccountType() +
//				", Account Balance: " + account1.getAccountBalance() );




		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() +
				", Account Type: " + account1.getAccountType() +
				", Account Balance: " + account1.getAccountBalance() );

		account1.withdrawMoney(5000);


		//Print the values of account number, type and Balance.
		System.out.println("Account Number: " + account1.getAccountNumber() +
				", Account Type: " + account1.getAccountType() +
				", Account Balance: " + account1.getAccountBalance() );
		
	}


}
