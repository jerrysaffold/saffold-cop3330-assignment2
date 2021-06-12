package oop.assignment.ex26;

import java.lang.*;
public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double APR, double monthly_Payment) {
        double temp_months_left;
        double i = APR / 365;
        temp_months_left = -(1/30) * Math.log(1 + ((balance / monthly_Payment) * (1 - (Math.pow(1 + i, 30))))) / (Math.log(1 + i));

        return Math.ceil(temp_months_left);
    }
}
