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
public interface IComputeEmpWage {
    
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
    public int getTotalWage(String company);
}
