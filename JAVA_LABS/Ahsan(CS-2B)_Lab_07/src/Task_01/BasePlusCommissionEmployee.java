/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_01;

/**
 *
 * @author Ahsan
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(String fname, String lname, String cnic, double grossSales, double commissionRate,double baseSalary)
    {
        super(fname, lname, cnic, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double earnings( ) 
    {
        return baseSalary + super.earnings();
    }
    
    public String toString( ) 
    {
        return "\nBase plus Commission employee: "+"\n" + super.toString();
    }
}
