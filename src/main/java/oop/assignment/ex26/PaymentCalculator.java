package oop.assignment.ex26;


public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double balance, double APR, double monthly_Payment) {
        double months_left;
        double temp = APR / 100;
        double i = temp/365;
        months_left = ((1.0/30.0) * Math.log(1 + (balance / monthly_Payment) * (1.0 - (Math.pow(1.0 + i, 30.0))))) / (Math.log(1.- + i));
        return Math.ceil(months_left);
    }
}
