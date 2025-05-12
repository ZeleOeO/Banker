package com.zele.entities;

import java.util.List;

public class Customer extends User {
    List<Account> accounts;
    List<Transaction> transactionHistory;

    public Customer(String name) {
        super(name);
    }

    public Account createAccount(String accountType) {
        Account account = new Account(accountType);
        this.accounts.add(account);
        return account;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
