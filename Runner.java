package com.task3.secondOneTax;



import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting employee information
        System.out.println("Enter employee information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();
        Employee employee = new Employee(empId, empName, empSalary);

        // Accepting product information
        System.out.println("\nEnter product information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(pid, price, quantity);

        // Printing income tax and sales tax
        System.out.println("\nIncome Tax for " + empName + ": $" + employee.calcTax());
        System.out.println("Sales Tax for Product: $" + product.calcTax());
    }
}
