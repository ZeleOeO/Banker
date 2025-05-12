package com.zele.entities;

public class Customer extends User {
    Account account;
    List<Transaction> transactionHistory;

    public Customer(String name) {
        super(name);
    }

    public Account createAccount(String accountType) {
       account = new Account(accountType);
       return account;
    }

}
