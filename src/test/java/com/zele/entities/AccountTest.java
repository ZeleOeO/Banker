package com.zele.entities;

import com.zele.entities.Banks.ElizadeMFB;
import com.zele.exceptions.BalanceIsInsufficientException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Bank bankA;
    private Bank bankB;
    private Customer customerA;
    private Customer customerB;
    private Account accountA;
    private Account accountB;

    @BeforeEach
    void setUp() {
        // Mock banks
        bankA = new ElizadeMFB();
        bankB = new ElizadeMFB();

        // Mock customers
        customerA = new Customer("Alice");
        customerB = new Customer("Bob");

        // Add empty transaction history lists
        customerA.setTransactionHistory(new ArrayList<>());
        customerB.setTransactionHistory(new ArrayList<>());

        // Mock accounts
        accountA = new Account(AccountType.SAVINGS);
        accountB = new Account(AccountType.CURRENT);

        accountA.setBank(bankA);
        accountB.setBank(bankB);

        accountA.setOwner(customerA);
        accountB.setOwner(customerB);

        accountA.deposit(1000.0); // Add initial balance

        // Add empty transaction lists to banks
//        bankA.setTransactions(new ArrayList<>());
//        bankB.setTransactions(new ArrayList<>());
    }

    @Test
    void testDeposit() {
        accountA.deposit(500.0);
        assertEquals(1500.0, accountA.getBalance());
    }

    @Test
    void testWithdraw() {
        accountA.withdraw(200.0);
        assertEquals(800.0, accountA.getBalance());
    }

    @Test
    void testTransferWithinSameBank() {
        accountB.setBank(bankA); // same bank as accountA
        accountA.transfer(300.0, accountB);
        assertEquals(700.0, accountA.getBalance());
        assertEquals(300.0, accountB.getBalance());
        assertEquals(1, customerA.getTransactionHistory().size());
        assertEquals(1, bankA.getTransactions().size());
    }

    @Test
    void testTransferWithBankCharges() {
        accountA.transfer(300.0, accountB); // different banks
        assertEquals(680.0, accountA.getBalance()); // 300 + 20 bank charge
        assertEquals(300.0, accountB.getBalance());
        assertEquals(1, customerA.getTransactionHistory().size());
        assertEquals(1, bankA.getTransactions().size());
        assertEquals(1, bankB.getTransactions().size());
    }

    @Test
    void testTransferInsufficientBalance() {
        Exception exception = assertThrows(BalanceIsInsufficientException.class, () -> {
            accountA.transfer(2000.0, accountB);
        });
        assertEquals("Insufficient balance", exception.getMessage());
    }
}
