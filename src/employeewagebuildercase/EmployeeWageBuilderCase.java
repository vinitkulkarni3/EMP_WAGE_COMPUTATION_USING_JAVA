/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeewagebuildercase;

/**
 *
 * @author Vinit
 */
public class EmployeeWageBuilderCase {

    /**
     * @param args the command line arguments
     */
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
        
    }
    
}
