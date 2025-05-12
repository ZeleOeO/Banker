package com.zele.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Account account;
    private List<Transaction> transactionHistory = new ArrayList<Transaction>();
    private Bank bank;

    public Customer(String name) {
        super(name);
    }

    public Account createAccount(AccountType accountType) {
        Account account = new Account(accountType);
        account.setBank(bank);
        account.setOwner(this);
        this.getBank().getAccounts().add(account.getAccountNumber().toString());
        this.account = account;
        return account;
    }

    public Account getAccount() {
        return account;
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
