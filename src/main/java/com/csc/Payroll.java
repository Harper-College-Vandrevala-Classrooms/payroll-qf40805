package com.csc;

import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hours worked: ");
    double hoursWorked = scanner.nextDouble();

    System.out.print("Enter pay rate: ");
    double payRate = scanner.nextDouble();

    System.out.print("Enter number of dependents: ");
    int dependents = scanner.nextInt();
    if (dependents < 0) {
      dependents = 0;
    }

    double grossPay = hoursWorked * payRate;
    double tax = grossPay * 3.0; 
    double netPay = grossPay - tax;

    double unionDues = 50; // Fixed union dues
    double insurancePayments = 100; // Fixed insurance payments

    if (netPay < (unionDues + insurancePayments)) {
      System.out.println("Net Pay: $" + netPay);
      System.out.println("You owe union dues: $" + (unionDues - netPay));
      System.out.println("You owe insurance payments: $" + (insurancePayments - netPay));
    } else {
      netPay -= (unionDues + insurancePayments);
      System.out.println("Net Pay after deductions: $" + netPay);
    }

    System.out.println("Gross Pay: $" + grossPay);
    System.out.println("Tax Deducted: $" + tax);
    System.out.println("Number of Dependents: " + dependents);
        
    scanner.close();
  }
}

