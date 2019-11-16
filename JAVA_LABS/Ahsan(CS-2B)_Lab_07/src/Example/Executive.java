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
public class Executive extends Employee {
private double bonus;
// constructor
public Executive (String name,String phone, double payRate){
super (name,phone, payRate);
bonus = 0; // bonus has yet to be awarded
}
// unique method
public void awardBonus (double execBonus){
bonus = execBonus;
}
// override method pay of Employee: which is the
// regular employee payment plus a one-time bonus
//-----------------------------------------------
public double pay (){
double payment = super.pay() + bonus;
bonus = 0; // once bonus added reset it to 0
return payment;
}
}
