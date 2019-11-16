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
public class CommissionEmployee extends Employee
{
    private double grossSales,commissionRate;

    public CommissionEmployee() {
    }

    public CommissionEmployee(String fname, String lname, String cnic,double grossSales, double commissionRate) 
    {
        super(fname, lname, cnic);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public double earnings( ) 
    {
        return grossSales * commissionRate;
    }
    
    public String toString( ) 
    {
        return "\nCommission employee: "+"\n" + super.toString();
    }
}
