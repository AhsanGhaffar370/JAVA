/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fall2015
 */
import java.util.Scanner;
public class Car 
{
    Scanner cin=new Scanner(System.in);
    
    //Declaring String and double instance variables:
    private String  brand_name,color;
    
    //initialize odometer by 0:
    double price_new,odometer = 0;
           
    //Create a class which take input of car details :
    public void Input()
    {
        
        System.out.print("Car Brand: ");
        
        brand_name=cin.nextLine();
        
        System.out.print("\nColor: ");
        
        color=cin.nextLine();
        
        System.out.print("\nNew Price: ");
        
        price_new=cin.nextDouble();
        
        System.out.print("\nOdometer: " +odometer+"\n");
       
    }
                                             
    //Create a constructor then call input method in it:
    public Car()
    {
        Input();
    }
    
    //create a method to calculate price of car after used:
    public double Get_Price_After_Use()
    {
        return (price_new*(1-(odometer/60000)));
    }
    
    //create parameter passing milage updation method:
    public void Update_milage(double a)
    {
        odometer +=a;
    }
    
    //create output method which output the complete  detail of the Car : 
    public void Output()
    {
        System.out.println("\n****************************");
        
        System.out.println("Brand: "+brand_name);
        
        System.out.println("\nColor: " +color);
        
        System.out.println("\nNew Price: "+price_new);
        
        System.out.println("\nOdometer: " +odometer);
        
        System.out.println("\nPrice After USe: "+Get_Price_After_Use());
        
        System.out.println("****************************");
        
    }
    
    
    /*
    public String get_bname()
    {
        return brand_name;
    }
    
    public void set_Bname(String a)
    {
        this.brand_name=a;
    }
    */
}
