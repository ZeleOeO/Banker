package com.zele.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountNumberGeneratorTest {

    @Test
    public void testGenerateAccountNumber() {
        // Generate an account number using the method
        Long accountNumber = AccountNumberGenerator.generateAccountNumber();
        System.out.println(accountNumber);

        // Check that the generated account number is a 10-digit number
        assertNotNull(accountNumber, "Generated account number should not be null");
        assertEquals(10, accountNumber.toString().length(), "Account number should be exactly 10 digits long");

        // Optionally, you can check that the account number is a valid numeric value
        try {
            Long.parseLong(accountNumber.toString());
        } catch (NumberFormatException e) {
            fail("Generated account number is not a valid numeric value");
        }
    }
}
