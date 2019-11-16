/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author Ahsan
 */
public class Employee extends StaffMember
{
private double payRate;

public Employee (String name,String phone, double payRate) {
super (name, phone);
this.payRate = payRate;
}
public double getPayRate() {return payRate;}
// override pay method
public double pay(){return payRate;}
}
