package com.familyfirstsoftware.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateISBNTest {

    @Test
    public void checkAValid10DigitISBN(){
       ValidateISBN validator = new ValidateISBN();
       boolean result = validator.checkISBN("0140449116");
       assertTrue("first value: ", result);
       result = validator.checkISBN("0140177396");
       assertTrue("second value: ", result);
    }

    @Test
    public void TenDigitISBNNumbersEndingInXAreValid(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkAValid13DigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780553213119");
        assertTrue("first value: ", result);
        result = validator.checkISBN("9780140449266");
        assertTrue("second value: ", result);

    }

    @Test
    public void checkAInvalid10DigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }
    @Test
    public void checkAInvalid13DigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("1234567891123");
        assertFalse(result);

    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("123456789");
        // other way
        /*
        assertThrows(NumberFormatException.class,
                () -> {
                    validator.checkISBN("012345678");
                }
        );

         */

    }

    @Test(expected = NumberFormatException.class)
    public void helloWorldAsISBN(){
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("helloworld");

    }




}
