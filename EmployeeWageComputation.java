package com.emp;

class EmployeeWageComputation {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent = 1;
        int ispartTime = 1;
        int isfullTime = 2;
        int empWagePerHr = 20;
        int salary = 0;
        int empHrs = 0;
        int randomValue = (int) (Math.random() * 2 + 1);
        if (randomValue == ispartTime) {
            empHrs = 4;
        } else if (randomValue == isfullTime) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }

        salary = (empWagePerHr * empHrs);
        System.out.println(salary);

    }
}