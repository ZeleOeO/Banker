package com.zele;

import com.zele.entities.AccountType;
import com.zele.entities.Bank;
import com.zele.entities.Banks.ElizadeMFB;
import com.zele.entities.Customer;

public class Main {
    public static void main(String[] args) {
        Bank elizade = new ElizadeMFB();
        Customer customer1 = elizade.createCustomer("Matthew Kingsley");
        Customer customer2 =  elizade.createCustomer("David Kingsley");
        customer1.createAccount(AccountType.SAVINGS);
        customer2.createAccount(AccountType.CURRENT);
        customer1.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString() + ": " + account.getBalance() );});
        customer2.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString()+ ": " + account.getBalance());});
        customer1.getAccounts().get(0).deposit(500.0);
        customer2.getAccounts().get(0).deposit(500.0);
        System.out.println("STUFF");
        customer1.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString() + ": " + account.getBalance() );});
        customer2.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString()+ ": " + account.getBalance());});
        customer1.getAccounts().get(0).withdraw(300.0);
        customer1.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString() + ": " + account.getBalance() );});
        customer2.getAccounts().get(0).transfer(200.0, customer1.getAccounts().get(0));
        customer1.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString() + ": " + account.getBalance() );});
        customer2.getAccounts().forEach(account -> {System.out.println(account.getAccountNumber().toString() + ": " + account.getBank().getName() + ": " +  account.getAccountType().toString()+ ": " + account.getBalance());});
    }
}
