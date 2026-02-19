package com.example.demo;

import java.util.Locale;

public class Cliente {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Cliente(int accountNumber, String holderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public Cliente(int accountNumber, String holderName){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }
    
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount - 5.00;
    }

    @Override
    public String toString(){
        return String.format(Locale.US, "Client: %s | Account: %d | Balance: $%.2f", this.holderName, this.accountNumber, this.balance);
    }

}
