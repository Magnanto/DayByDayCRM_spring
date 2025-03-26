package com.limulcomp.daybydaycrm_spring.model;

public class InvoiceData {
    int month;
    double amountWithoutTax;
    double amountWithTax;

    public InvoiceData() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getAmountWithoutTax() {
        return amountWithoutTax;
    }

    public void setAmountWithoutTax(double amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
    }

    public double getAmountWithTax() {
        return amountWithTax;
    }

    public void setAmountWithTax(double amountWithTax) {
        this.amountWithTax = amountWithTax;
    }
}
