package com.zele;

import com.zele.entities.Account;
import com.zele.entities.AccountType;
import com.zele.entities.Bank;
import com.zele.entities.Banks.ElizadeMFB;
import com.zele.entities.Customer;

public class Main {
    public static void main(String[] args) {
        Bank elizade = new ElizadeMFB();
        Long accountNumber = elizade.landingMenu();
        System.out.println(accountNumber);
    }
}
