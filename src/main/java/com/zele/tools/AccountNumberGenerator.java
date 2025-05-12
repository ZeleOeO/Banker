package com.zele.tools;

import java.util.Random;

public class AccountNumberGenerator {

    public static Long generateAccountNumber() {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i=0; i<10; i++) {
            sb.append(rand.nextInt(10));
        }
        return Long.parseLong(sb.toString());
    }
}
