package com.zele.entities.Banks;

import com.zele.entities.Account;
import com.zele.entities.Customer;
import com.zele.entities.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElizadeMFBTest {

    private ElizadeMFB bank;

    @BeforeEach
    void setUp() {
        bank = new ElizadeMFB();
    }

    @Test
    void testGetName() {
        assertEquals("Elizade MFB", bank.getName());
    }

    @Test
    void testCreateCustomerAddsCustomer() {
        Customer customer = bank.createCustomer("John Doe");

        List<Customer> customers = bank.getCustomers();

        assertEquals(1, customers.size());
        assertEquals("John Doe", customers.get(0).getName());
        assertEquals(bank, customers.get(0).getBank());
    }

    @Test
    void testGetCustomersInitiallyEmpty() {
        assertTrue(bank.getCustomers().isEmpty());
    }

    @Test
    void testGetAccountsInitiallyEmpty() {
        assertTrue(bank.getAccounts().isEmpty());
    }

    @Test
    void testGetTransactionsInitiallyEmpty() {
        assertTrue(bank.getTransactions().isEmpty());
    }
}
