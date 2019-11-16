/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Test_02 
{
    public static void main(String args[])
    {
        //initialize int string variables:
        int fn1=123,fn2=237,a_s=350;
        
        String s="Karachi",d="Islamabad";
        
        //create an object of 3 parameter constructor flight: 
        Flight obj1=new Flight(fn1,s,d,a_s);
        
        //create an object of 3 parameter constructor flight: 
        Flight obj2=new Flight(fn2,a_s); 
        
        //create an object of 3 parameter constructor flight: 
        Flight obj3=new Flight(fn1);
        
        System.out.println("********************");
        
        //print obj1 ,obj2,obj3:
        System.out.println(obj1);
        
        System.out.println("********************");
        
        System.out.println(obj2);
        
        System.out.println("********************");
        
        System.out.println(obj3);
        
        System.out.println("********************");
        
        System.out.println("\n\n*************************");
        
        //get flight num and available seats and print:
        System.out.println("Flight number " + obj2.getFlight_n());
        
        System.out.println("\nAvailable seats : " + obj2.getAvailable_seat());
        
        //set the value of available seats:
        obj1.setAvailable_seat(300);
        
        //call reserve method to reserve seats for client:
        obj1.reserve(30);
        
        //call cancel method to cancel seats for client:
        obj2.cancel(300);
        
        //call equalls method to campare two flights:
        obj1.equals(obj3);
        
        obj1.equals(obj2);
    
        System.out.println("*************************\n");
    }
}
