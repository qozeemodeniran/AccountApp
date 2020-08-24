package com.example.accountapp.logic;

public class Account {
    String name;
    int number;
    double balance;

    LogicInterface mLogic;

    // Constructor that initializes mLogic.
    public Account(LogicInterface logic) {
        mLogic = logic;
    }

    
}