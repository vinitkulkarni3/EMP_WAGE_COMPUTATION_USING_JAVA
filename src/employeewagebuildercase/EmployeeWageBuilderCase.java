/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeewagebuildercase;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Vinit
 */
public class EmployeeWageBuilderCase implements IComputeEmpWage{

    /**
     * @param args the command line arguments
     */
     private final String company;
     private final int empRatePerHour;
     private final int numOfWorkingDays;
     private final int maxHoursPerMonth;
    
    //constructor start
    public EmployeeWageBuilderCase(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    //constructor end
    
    
    public int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyEmpWageMap;

    public EmployeeWageBuilderCase() 
    {
	companyEmpWageList = new LinkedList<CompanyEmpWage>();
	companyEmpWageMap = new HashMap<String, CompanyEmpWage>();
    }
    
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) 
    {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	companyEmpWageList.add(companyEmpWage);
	companyEmpWageMap.put(company, companyEmpWage);
    }
    
    public void computeEmpWage() 
    {
        for (int i = 0; i < companyEmpWageList.size(); i++) 
        {
            CompanyEmpWage company = companyEmpWageList.get(i);
            company.setTotalEmpWage(this.computeEmpWage(company));
            System.out.println(company);
	}
    }

    
    //uc7 method code here
    public void ComputeWage()
    {
	int ratePerHour = 20;
	int empHour = 0;
	int NUM_WORKING_DAYS = 20;
	int MAX_HRS_IN_MONTH = 100;
	int totalEmpHrs = 0;
	int totalWorkingDays = 0;
	
        while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) 
        {
            totalWorkingDays++;
            totalEmpHrs++;	
            int randomNumber = (int) Math.floor(Math.random() * 10) % 3;
            
            switch (randomNumber) 
            {
		case 0:
                    System.out.println("employee is full-time");
                    empHour = 8;
                    int salary = (empHour * ratePerHour);
                    System.out.println("salary is :" + salary);
                    break;
		case 1:
                    System.out.println("employee is part-time");
                    empHour = 4;
                    int salary1 = (empHour * ratePerHour);
                    System.out.println("salary is :" + salary1);
                    break;
		default:
                    System.out.println("employee is absent");
            }
	}
    }//uc7 end
    
    
    //uc8 code
    public static int computeEmpWage(String comany, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth)
    {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.floor(Math.random() * 10) %3);
            switch(empCheck)
            {
                case 1:
                    //1 = FULL TIME
                    empHrs = 8;
                    break;
                case 2: 
                    //2 = PART TIME
                    empHrs = 4;
                 break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# "+totalWorkingDays+" Emp Hr: "+empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage For Company: "+comany+" is: "+totalEmpWage);
        return totalEmpWage;
    }
    
    
    //uc9 start
    int totalEmpWage = 0;
    public void computeEmpWage1(String comany, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth)
    {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.floor(Math.random() * 10) %3);
            switch(empCheck)
            {
                case 1:
                    //1 = FULL TIME
                    empHrs = 8;
                    break;
                case 2: 
                    //2 = PART TIME
                    empHrs = 4;
                 break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# "+totalWorkingDays+" Emp Hr: "+empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage For Company: "+comany+" is: "+totalEmpWage);
        
        
    }
    
    @Override
    public String toString() 
    {
        return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
    }
    //uc9 end

    public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

    public int getTotalWage(String company){
        return totalEmpWage;
    }
    public static void main(String[] args) {
        
        System.out.println("***** Welcome to Employee Wage Computation Program *****");
        
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int totalWorkingDays = 0;
        int NUM_WORKING_DAYS = 2;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        
        int empHrs = 0;
        int empWage = 0;
        
        //uc1. employee present or absent
	if(empCheck == IS_FULL_TIME) 
        {
            System.out.println("Employee is present");
	}
        else 
        {
            System.out.println("Employee is absent");
	}
        
        
        //uc2. employee wage calculation
        if(empCheck == IS_FULL_TIME) 
        {
            empHrs = 8;
	}
        else 
        {
            empHrs = 0;
	}
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE: "+empWage);
        
        
        //uc3. add part time employee
        if(empCheck == IS_FULL_TIME) 
        {
            empHrs = 8;
	}
        else if(empCheck == IS_PART_TIME)
        {
            empHrs = 4;
	}
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE: "+empWage);
        
        
        //uc4. calculating emp wage using switch case
        switch(empCheck)
        {
            case 1:
                //1 = FULL TIME
                empHrs = 8;
                break;
            case 2: 
                //2 = PART TIME
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("EMP WAGE: "+empWage);
        
        
        //uc5. calculating wage for month
        for(int day=0; day<NUM_WORKING_DAYS; day++)
        {
            int empCheck1 = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck1)
            {
                case 1:
                    //1 = FULL TIME
                    empHrs = 8;
                    break;
                case 2: 
                    //2 = PART TIME
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }   
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("EMP WAGE: "+empWage);
        }
        System.out.println("TOTAL EMP WAGE: "+totalEmpWage);
        
        
        //uc6. Calculate Wages till a condition is met
        while(totalEmpHrs <= NUM_WORKING_DAYS && totalWorkingDays <= NUM_WORKING_DAYS)
        {
            totalWorkingDays++;
            int empCheck2 = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck2)
            {
                case 1:
                    //1 = FULL TIME
                    empHrs = 8;
                    break;
                case 2: 
                    //2 = PART TIME
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }   
            totalEmpHrs += empHrs;
            System.out.println("Day#: "+totalWorkingDays +" Emp HR: "+empHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("TOTLA EMP WAGE: "+totalEmpWage);
        
        
        //uc7. Refactor the Code to write a Class Method to Compute Employee Wage
        EmployeeWageBuilderCase obj1 = new EmployeeWageBuilderCase("Dmart",20,2,10);
        obj1.ComputeWage();
        
        
        //uc8. Ability to compute Employee Wage for multiple companies
        EmployeeWageBuilderCase more = new EmployeeWageBuilderCase("Moree",20,2,10);
        EmployeeWageBuilderCase relience = new EmployeeWageBuilderCase("Relience",20,2,10);
        
        
        //uc9
        more.computeEmpWage1("More", 20, 2, 10);
        System.out.println("More");
        relience.computeEmpWage1("Relience", 20, 2, 10);
        System.out.println("relience");
        
        obj1.computeEmpWage();
    }
    
}
