package com.company;

public class BasePlusCommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    //six argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double salaryBase) {
        // implicit call to Object's default constructor occurs here

        // if gross sales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

            //if commissionRate is invalid throw exception
            if (commissionRate <= 0.0 || commissionRate >= 1.0)
                throw new IllegalArgumentException("commisson rate must be > 0.0 and < 1.0");
            // if base salary is invalid throw exception
            if (baseSalary < 0.0)
                throw new IllegalArgumentException("baseSalry must br > 0.0");

            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
    }
}
