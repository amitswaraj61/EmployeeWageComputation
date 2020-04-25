package com.emp;

class EmployeeWageComputation {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation");
        final int ispartTime = 1;
        final int isfullTime = 2;
        final int empWagePerHr = 20;
        final int workingDays = 20;
        final int maxHrsInMonth = 50;

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int empHrs = 0;

        while (totalEmpHrs < maxHrsInMonth && totalWorkingDays < workingDays) {
            totalWorkingDays++;
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
            totalEmpHrs += empHrs;
        }
        int monthlySalary = empWagePerHr * totalEmpHrs;
        System.out.println(monthlySalary);
    }
}