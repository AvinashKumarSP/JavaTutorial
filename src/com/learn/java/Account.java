package com.learn.java;

public class Account {

	public Account(int accountNumber, String accountType, long accountBalance, String accountBranch) {

		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.accountBranch = accountBranch;
	}

	public int accountNumber;
	public String accountType;
	public long accountBalance;
	public String accountBranch;
	public static int counter1; // static variable
	public int counter2; // variable


	
	
	//Getter and Setter methods
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	//deposit method
	public void depositMoney(long deposit){

		if (deposit > 0) {
			//long totalBalance = accountBalance + deposit;
			//System.out.println("print total balance : " + totalBalance);
			System.out.println("Account balance: " + accountBalance);
			setAccountBalance(accountBalance + deposit);
			System.out.println("Account Balance after update: " + accountBalance);
		}
		
	}

	//withdrawal method example
	public void withdrawMoney(long withdraw){
		
		if (withdraw > 0 && accountBalance >= withdraw ) {
			this.accountBalance = accountBalance - withdraw;
		}else{
			System.out.println("Insufficient Balance: The balance in your account is " + this.accountBalance);
		}
		
	}

}
