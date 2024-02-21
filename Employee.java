package com.task3.secondOneTax;

class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Calculating yearly income tax
    @Override
    public double calcTax() {
        return salary * INCOME_TAX;
    }
}
