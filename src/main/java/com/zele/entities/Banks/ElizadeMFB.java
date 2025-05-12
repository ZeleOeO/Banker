package com.zele.entities.Banks;

import com.zele.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public Long landingMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Elizade MFB");
        System.out.println("Do you have an account? (Y/N)");
        String selection = sc.nextLine().trim().toLowerCase();
        while (true) {
            switch (selection) {
                case "y"-> {
                    System.out.print("Please enter your account number: ");
                    String account = sc.nextLine().trim();
                    try {
                        return Long.parseLong(account);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid account number");
                    }
                }
                case "n"-> {
                    System.out.println("Let's create an account");
                    System.out.print("Please enter your name: ");
                    String name = sc.nextLine().trim();
                    Customer customer = this.createCustomer(name);
                    System.out.println("What type of account are you opening?");
                    System.out.println("1. Savings Account (s)");
                    System.out.println("2. Current Account(c)");
                    String selection2 = sc.nextLine().trim().toLowerCase();
                    if (!selection2.equals("s") && !selection2.equals("c")) {System.out.println("Invalid account type"); landingMenu();}
                    switch (selection2) {
                        case "s"->{
                            customer.createAccount(AccountType.SAVINGS);
                        }
                        case "c"->{
                            customer.createAccount(AccountType.CURRENT);
                        }
                    }
                    return customer.getAccount().getAccountNumber();
                }
            }
        }
    }
}
