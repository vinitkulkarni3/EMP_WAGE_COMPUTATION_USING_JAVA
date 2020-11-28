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
        
    }
    
}
