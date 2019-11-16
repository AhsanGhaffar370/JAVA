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
public class HourlyEmployee extends Employee
{
    private double wage,hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee( String fname, String lname, String cnic,double wage, double hours) 
    {
        super(fname, lname, cnic);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public double earnings( ) 
    {
        if (hours <= 40)
        {
            return wage * hours;
        }

        else
        {
            return 40*wage + (hours-40)*wage*1.5;
        }
    }
    
    public String toString( ) 
    {
        return "\nHourly employee: "+"\n" + super.toString();
    }
}
