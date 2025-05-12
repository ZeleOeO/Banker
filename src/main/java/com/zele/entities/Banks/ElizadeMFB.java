package com.zele.entities.Banks;

import com.zele.entities.*;

import java.util.HashSet;
import java.util.List;

public class ElizadeMFB implements Bank {
    List<Customer> customers;
    List<Account> accounts;
    List<Transaction> transactionHistory;
    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public List<Transaction> getTransactions() {
       return transactionHistory;
    }
}
