package com.zele.entities;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime timestamp;
    private Account fromAccount;
    private Account toAccount;
    private Double amount;


    public Transaction( Account fromAccount, Account toAccount, Double amount) {
        this.timestamp = LocalDateTime.now();
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public Double getAmount() {
        return amount;
    }
}