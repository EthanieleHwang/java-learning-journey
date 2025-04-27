package com.learning.oop.week2;

public class OopTestRunner {
    public static void main(String[] args) {
        System.out.println("Staring OOP Test Runner");
        System.out.println("Total accounts created so far:"+ BankAccount.getAccountCounter());//static method
        BankAccount account1 = new BankAccount("John Doe", 1000);
        BankAccount account2 = new BankAccount("Jane Doe", 1000);
        BankAccount invalidAccount = new BankAccount("", -500); //

        System.out.println("Total accounts created so far:"+BankAccount.getAccountCounter());// Invalid account creation

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        invalidAccount.displayAccountInfo();

        System.out.println("\n--- Performing operations on account1 ---");
        System.out.println("Account 1 Number (read-only):+account1.getAccountNumber()");

        account1.deposit(200.0);
        account1.withdraw(50.0);
        account1.withdraw(2000.0); // Attempt to withdraw more than balance
        account1.deposit(-10.0); // Attempt to deposit negative amount

        account1.setOwnerName("John Doe");

        System.out.println("Account 1 Owner Name (read-only): "+account1.getOwnerName());

        account1.setActive(false); // Deactivate account
        account1.deposit(200.0); // Attempt to deposit into inactive account

        System.out.println("\nFinal state of account1:");
        account1.displayAccountInfo();

        System.out.println("\nOOP tests finished");
    }
}
