package com.task3.secondOneTax;

public class Product extends TaxableItem{

    private int pid;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        super(price);
        this.pid = pid;
        this.quantity = quantity;
    }

    // Calculating sales tax per unit
    @Override
    public double calcTax() {
        return price * SALES_TAX;
    }
}
