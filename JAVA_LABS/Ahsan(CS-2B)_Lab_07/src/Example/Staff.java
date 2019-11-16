package Example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
public class Staff 
{
    public static void main (String[] args) 
    {
        StaffMember[] staffList;
        staffList = new StaffMember[4];
        staffList[0] = new Executive ("Ahmad","016-1234567", 2000.00);
        staffList[1] = new Employee ("Ali","017-1234567", 800.50);
        staffList[2] = new HourlyEmployee ("Othman","012-1234567", 8.00);
        staffList[3] = new Volunteer ("Farooq","019-1234567");

        for (int i=0;i< staffList.length;i++) 
        {
            if (staffList[i] instanceof Executive)
            {
                Executive e=(Executive)staffList[i];
// downcasting to access awardBonus method
                e.awardBonus (500.00);
            }

            else if (staffList[i] instanceof HourlyEmployee)
            {
                HourlyEmployee h=(HourlyEmployee)staffList[i];
// downcasting to access addHours method
                h.addHours (40);
            }
        }
        System.out.println("The total amount to pay is "+getTotalCost
        (staffList));
    }
// compute payday costs
    public static double getTotalCost (StaffMember[] stm)
    {
        double amount = 0.0;
        for (int count=0; count < stm.length; count++)
        {
            amount += stm[count].pay(); // polymorphism
        }
        return amount;
    }
}
  
