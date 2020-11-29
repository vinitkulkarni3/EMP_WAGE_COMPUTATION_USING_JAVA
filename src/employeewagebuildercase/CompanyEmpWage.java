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
public class CompanyEmpWage {
    
    public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;

	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() 
        {
		return "Total Emp Wage for Company: " + company + " is " + totalEmpWage;
	}    
}
