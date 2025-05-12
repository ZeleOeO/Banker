package com.zele.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Account> accounts = new ArrayList<Account>();
    private List<Transaction> transactionHistory = new ArrayList<Transaction>();
    private Bank bank;

    public Customer(String name) {
        super(name);
    }

    public Account createAccount(AccountType accountType) {
        Account account = new Account(accountType);
        account.setBank(bank);
        account.setOwner(this);
        this.accounts.add(account);
        this.getBank().getAccounts().add(account.getAccountNumber().toString());
        return account;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setTransactionHistory(ArrayList<Object> objects) {
    }
}
