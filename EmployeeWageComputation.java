package com.emp;

class EmployeeWageBuilder {
    public static int empHrs = 0;

    //Instance variables
    private final String companyName;
    private final int empRate;
    private final int numOfDays;
    private final int maxHrs;

    public EmployeeWageBuilder(String companyName, int empRate, int numOfDays, int maxHrs) {
        this.companyName = companyName;
        this.empRate = empRate;
        this.numOfDays = numOfDays;
        this.maxHrs = maxHrs;
    }

    public void calculateEmployeeWageForCompany() {
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
            System.out.println(monthlySalary);
        }
        System.out.println("Total Employee wage For Company" + " " + companyName + " " + totalWage);
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
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageBuilder employeeWageBuilder=new EmployeeWageBuilder("Wipro",20,2,10);
        employeeWageBuilder.calculateEmployeeWageForCompany();
        EmployeeWageBuilder employeeWageBuilder1=new EmployeeWageBuilder("Infosys",10,4,2);
        employeeWageBuilder1.calculateEmployeeWageForCompany();
        }
}

