package com.learn.java;

public class Account {
	
	private int accountNumber;
	private String accountType;
	private long accountBalance;
	
	
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
			long totalBalance = accountBalance + deposit; 
			setAccountBalance(totalBalance);
		}
		
	}
	
	//withdrawal method example
	public void withdrawMoney(long withdraw){
		
		if (withdraw > 0 ) {
			long finalBalance = accountBalance - withdraw;
			setAccountBalance(finalBalance);
		}
		
	}

}
