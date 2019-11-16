package Task_01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Test_Flight 
{
    public static void main(String args[])
    {
        Time dep=new Time(12,20);
        
        Time arr=new Time(12,00);
        
        Flight f=new Flight("PK-102","Lahore",dep,arr);
        
        Passenger pass=new Passenger("Ahsan",40);
        
        Passenger pass1=new Passenger("Faraz",30);
     
        f.addpassenger(pass);
        
        f.addpassenger(pass1);
        
        f.printinfo();
    }
    
}
