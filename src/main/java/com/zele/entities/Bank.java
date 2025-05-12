package com.zele.entities;

import java.util.HashSet;
import java.util.List;

public interface Bank {
    List<Customer> getCustomers();
    List<Account> getAccounts();
    List<Transaction> getTransactions();

}
