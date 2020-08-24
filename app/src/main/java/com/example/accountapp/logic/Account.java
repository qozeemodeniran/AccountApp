package com.example.accountapp.logic;

public class Account {
    private String name;
    private int number;
    private double balance;

    LogicInterface mLogic;

    // Constructor that initializes mLogic.
    public Account(LogicInterface logic) {
        mLogic = logic;
    }

    // Constructor that initialize name and number
    public Account(String newName, int newNumber) {
        name = newName;
        number = newNumber;
    }

    // Constructor that initialize balance
    public Account(String newName, int newNumber, double initialBalance) {
        this(newName, newNumber);
        balance = initialBalance;
    }

    // Get method for name...
    public String getName() {
        return (name);
    }

    // Get method for number...
    public int getNumber() {
        return (number);
    }

    // Get method for balance...
    public double getBalance() {
        return (balance);
    }

    // Set method for name
    public void setName(String nm) {
        name = nm;
    }

    // Set method for number
    public void setNumber(int num) {
        number = num;
    }

    // Method that performs deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Method that displays the balance
    public void displayBalance() {
//        mLogic.println("The balance on account " + number + " is " + balance);
    }

    public boolean withdrawal(double amount) {
        if (balance > amount) {
            balance -= amount;
            return (true);
        }
        else
            return (false);
    }
}