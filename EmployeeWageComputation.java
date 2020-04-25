package com.emp;

class EmployeeWageComputation {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        int ispartTime = 1;
        int isfullTime = 2;
        int empWagePerHr = 20;
        int salary = 0;
        int empHrs = 0;
        int randomValue = (int) (Math.random() * 3 + 1);
        switch (randomValue) {
            case 1:
                empHrs = 4;
                break;
            case 2:
                empHrs = 8;
                break;
            case 3:
                empHrs = 0;
        }
        salary = empWagePerHr * empHrs;
        System.out.println(salary);
    }
}