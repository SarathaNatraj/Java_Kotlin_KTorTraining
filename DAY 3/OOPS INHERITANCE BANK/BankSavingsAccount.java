package com.demo.oops;

/*Implementation class of Banking interface*/
public class BankSavingsAccount implements Banking {

    /*private variables of the class*/
    private double balance;

    private double interest;

    /*Default constructor*/
    public BankSavingsAccount() {
        balance = 0;
        interest = 0;
    }

    /*Parameterised constructor*/

    public BankSavingsAccount(double initialBalance, double initialInterest) {

        balance = initialBalance;
        interest = initialInterest;

    }

    /*Overriding deposit method of Banking interface*/
    @Override
    public double deposit(double amount) {

        balance = balance + amount;

        return balance;
    }

    /*Overriding withdraw method of Banking interface
     * returns appropriate message */
    @Override
    public String withdraw(double amount) {

      

    }

    /*This method adds interest to the balance*/

    public String addInterest() {
        if (interest > 0) {
            balance = balance + balance * interest;
            return "Interest added successfully and the balance now is " + balance;
        } else
            return "Interest cannot be negative";
    }

    /*This methods returns the balance*/
    public double getBalance() {

        return this.balance;
    }


    /*This methods overrides transfer method of the interface and returns appropriate me
    message based on the transfer amount*/
    @Override
    public String transfer(double transferAmount) {

        if (balance < transferAmount)
            return "Insufficient funds";
        else {
            balance = balance - transferAmount;
            return "Transaction successful";
        }

    }



}
