package com.zele.entities.Banks;

import com.zele.entities.Bank;
import com.zele.entities.Customer;
import com.zele.entities.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ElizadeMFB implements Bank {
    private String name = "Elizade MFB";
    List<Customer> customers = new ArrayList<Customer>();
    List<String> accounts = new ArrayList<String>();
    List<Transaction> transactionHistory = new ArrayList<Transaction>();
    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public List<String> getAccounts() {
        return accounts;
    }

    @Override
    public List<Transaction> getTransactions() {
       return transactionHistory;
    }

    @Override
    public Customer createCustomer(String name) {
       Customer customer = new Customer(name);
       customer.setBank(this);
       customers.add(customer);
       return customer;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
