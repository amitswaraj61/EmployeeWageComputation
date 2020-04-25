package com.emp;

class EmployeeWageComputation
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Employee Wage Computation");
        int isPresent=1;
        int randomValue=(int) ( Math.random() * 2 + 1);
        if ((int) ( Math.random() * 2 + 1) ==isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

}