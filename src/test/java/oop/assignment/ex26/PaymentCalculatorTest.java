package oop.assignment.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_Test1() {
        double balance = 5000;
        double APR = 12;
        double payment = 100;

        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment));
    }

    @Test
    void calculateMonthsUntilPaidOff_Test2() {
        double balance = 10000;
        double APR = 12;
        double payment = 100;

        assertEquals(478, PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment));
    }

    @Test
    void calculateMonthsUntilPaidOff_Test3() {
        double balance = 5000;
        double APR = 12;
        double payment = 100;

        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment));
    }

    @Test
    void calculateMonthsUntilPaidOff_Test4() {
        double balance = 1200;
        double APR = 12;
        double payment = 100;

        assertEquals(13, PaymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment));
    }
}