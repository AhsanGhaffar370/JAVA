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
public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String fname, String lname, String cnic,double weeklySalary) 
    {
        super(fname,lname,cnic);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee() {
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    public double earnings( ) 
    {
        return weeklySalary;
    }
    
    public String toString( )
    {
        return "\nSalaried employee: "+"\n" + super.toString();
    }
}
