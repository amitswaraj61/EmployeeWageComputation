package com.emp;

class EmployeeWageComputation {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent = 1;
        int empWagePerHr = 20;
        int empHrs = 8;
        int salary=0;
        int randomValue = (int) (Math.random() * 2 + 1);
        if ((int) (Math.random() * 2 + 1) == isPresent) {
            System.out.println("salary is"+" "+empWagePerHr * empHrs);
        } else {
            salary=0;
             System.out.println("Employee is absent"+" "+salary);
        }

    }
}