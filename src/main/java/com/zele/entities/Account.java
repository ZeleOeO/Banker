package com.zele.entities;

import com.zele.exceptions.BalanceIsInsufficient;
import com.zele.tools.AccountNumberGenerator;

import java.time.LocalDateTime;

public class Account {
    private final LocalDateTime created;
    private Long accountNumber;
    private AccountType accountType;
    private Double balance;
    private Bank bank;
    private Customer owner;

    public Account(AccountType accountType) {
        this.created = LocalDateTime.now();
        this.accountNumber = AccountNumberGenerator.generateAccountNumber();
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }
    public void deposit(Double amount) {
        this.balance += amount;
    }

    public Transaction transfer(Double amount, Account to) {
        double bankCharges = 0.0;
        if (amount > this.balance) {throw new BalanceIsInsufficient("Insufficient balance");}
        if (to.getBank() != this.bank) {
           bankCharges=20.0;
        }
        this.withdraw(amount+bankCharges);
        to.deposit(amount);
        Transaction transaction= new Transaction(this, to, amount+bankCharges);
        this.owner.getTransactionHistory().add(transaction);
        to.owner.getTransactionHistory().add(transaction);
        this.bank.getTransactions().add(transaction);
        to.bank.getTransactions().add(transaction);
        return transaction;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
