package com.learn.java;

public class CurrentAccount extends Account{

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double overdraftLimit;

    //this refers to current object and super refers to parent object/class
    public CurrentAccount(int accountNumber, String accountType, long accountBalance, String accountBranch, double overdraftLimit) {
        super(accountNumber, accountType, accountBalance, accountBranch);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdrawMoney(long withdraw) {
        if (withdraw > 0 && (super.accountBalance + this.overdraftLimit) >= withdraw ) {
            //check whether account balance itself has sufficient fund before taking money from over draft.
            if (super.accountBalance >=withdraw){
                super.accountBalance = super.accountBalance - withdraw;
            } else if ( (super.accountBalance + this.overdraftLimit) >= withdraw){
                this.overdraftLimit = (super.accountBalance + this.overdraftLimit) - withdraw;
                super.accountBalance = 0;
            }

        }else{
            System.out.println("Insufficient Balance: The balance in your account is " + this.accountBalance);
        }
    }




}
