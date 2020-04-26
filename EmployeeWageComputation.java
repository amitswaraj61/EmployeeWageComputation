package com.emp;

class EmployeeWageComputation {
    public static int empHrs=0;
   public static void calculateEmployeeWageForCompany(String company,int empRate,int numofDays,int maxHrs)
   {
       int totalEmpHrs = 0;
       int totalWorkingDays = 0;
       int totalWage=0;
       while (totalEmpHrs < maxHrs && totalWorkingDays < numofDays) {
           totalWorkingDays++;
           int randomValue = (int) (Math.random() * 3 + 1);
           empHrs=getWorkingHours(randomValue);
           //totalEmpHrs += empHrs;
           int monthlySalary = empRate * empHrs;
           totalWage+=monthlySalary;
           System.out.println(monthlySalary);
       }
       System.out.println("Total Employee wage For Company"+" "+company+" "+totalWage);
   }
   public static int getWorkingHours(int randomValue)
   {
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
   public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation");
        calculateEmployeeWageForCompany("Wipro",20,2,10);
       calculateEmployeeWageForCompany("Infosys",10,4,2);
        }
}

