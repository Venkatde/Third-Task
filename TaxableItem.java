package com.task3.secondOneTax;

abstract class TaxableItem implements Taxable {
    double price;

    public TaxableItem(double price) {
        this.price = price;
    }
}
