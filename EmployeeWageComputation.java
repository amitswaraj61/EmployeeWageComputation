package com.emp;

class EmployeeWageComputation {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        final int ispartTime = 1;
        final int isfullTime = 2;
        final int empWagePerHr = 20;
        final int workingDays = 20;
        int salary = 0;
        int empHrs = 0;
        int monthlySalary = 0;
        for (int i = 1; i <= workingDays; i++) {
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
}