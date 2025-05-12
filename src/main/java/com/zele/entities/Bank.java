package com.zele.entities;

import java.util.HashSet;
import java.util.List;

public interface Bank {
    List<Customer> getCustomers();
    List<String> getAccounts();
    List<Transaction> getTransactions();
    Customer createCustomer(String name);
    String getName();
    Long landingMenu();
}
