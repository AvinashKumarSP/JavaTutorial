package com.learn.java;

public class CurrentAccountRunner {
    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(120001,"Savings", 10000, "Vilakuthoon", 5000);

        currentAccount1.withdrawMoney(12000);

        //Print the values of account number, type and Balance.
        System.out.println("Account Number: " + currentAccount1.getAccountNumber() +
                ", Account Type: " + currentAccount1.getAccountType() +
                ", Account Balance: " + currentAccount1.getAccountBalance() +
                ", Overdraft Limit: " + currentAccount1.getOverdraftLimit() );

    }
}
