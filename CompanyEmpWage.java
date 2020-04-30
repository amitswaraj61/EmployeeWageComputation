package com.emp;

public class CompanyEmpWage
{
    public static int empHrs = 0;
    //Instance variables
    public final String companyName;
    public final int empRate;
    public final int numOfDays;
    public final int maxHrs;

    public CompanyEmpWage(String companyName, int empRate, int numOfDays, int maxHrs) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numOfDays = numOfDays;
        this.maxHrs = maxHrs;
    }


    public static int getWorkingHours(int randomValue) {

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
        return empHrs;
    }

    public  void calculateEmployeeWageForCompany() {
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        while (totalEmpHrs < maxHrs && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            int randomValue = (int) (Math.random() * 3 + 1);
            empHrs = getWorkingHours(randomValue);
            //totalEmpHrs += empHrs;
            int monthlySalary = empRate * empHrs;
            totalWage += monthlySalary;
            System.out.println("Employee Daily Wage is"+" "+monthlySalary);
        }
        System.out.println("Total Employee wage For Company" + " " + companyName + " " + totalWage);
    }

}
