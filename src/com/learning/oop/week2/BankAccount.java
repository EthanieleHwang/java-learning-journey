package com.learning.oop.week2;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    private String accountNumber; //Account number
    private String ownerName; //Account owner name
    private double balance; //Account balance
    private boolean active; //Account status (active or inactive)
    private static int accountCounter=0; //Static variable to keep track of the number of accounts

    //Constructor to initialize the account
    public BankAccount(String ownerName, double initialBalance) {
        if(ownerName==null|| ownerName.isEmpty()) {
            System.err.println("Owner name cannot be null or empty");
            this.ownerName="Unknown";
        }else {
            this.ownerName = ownerName;
        }

        if(initialBalance<0) {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }else {
            this.balance = initialBalance;
        }

        //Generate a simple account number
        this.accountNumber = "AC" + String.format("%04d", ++accountCounter);
        this.active= true;
        System.out.println("Account created for" +this.ownerName+"with number"+ this.accountNumber);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if(ownerName==null|| ownerName.isEmpty()) {
            System.err.println("Owner name cannot be null or empty");
        }else {
            this.ownerName = ownerName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        System.out.println("Account"+ this.accountNumber+"status set to: "+(active ? "ACTIVE" : "INACTIVE"));
    }


    /** Method to withdraw money from the account
     * @param amount Amount to withdraw
     * @return true if withdrawal is successful, false otherwise
     */
    public boolean deposit(double amount){
        if(!this.active) {
            System.err.println("Deposit failed: Account"+ this.accountNumber+"is not active");
            return false;
        }
        if(amount<=0) {
            System.err.println("Deposit failed: Amount must be positive");
            return false;
        }
        this.balance += amount;
        System.out.println("Deposit successful.Current balance: "+ this.balance);
        return true;
    }

    public boolean withdraw(double amount){
        if(!this.active) {
            System.err.println("Withdrawal failed: Account"+ this.accountNumber+"is not active");
            return false;
        }
        if(amount<=0) {
            System.err.println("Withdrawal failed: Amount must be positive");
            return false;
        }
        if(amount>this.balance) {
            System.err.println("Withdrawal failed: Insufficient funds");
            return false;
        }
        this.balance -= amount;
        System.out.println("Withdrawal successful.Current balance: "+ this.balance);
        return true;
    }
   public void displayAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Status: " + (this.active ? "ACTIVE" : "INACTIVE"));
       System.out.println("--------------------------");
    }

    //static method to get the total number of accounts
    public static int getAccountCounter() {
        return accountCounter;
    }
}

