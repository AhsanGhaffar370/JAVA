/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
import java.util.Scanner;
public class Task_01 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        
        //DEclaring variables:
        double bmi,mass,height;
        
        System.out.println("**********************************");
        
        //TAke input of weight in pounds
        System.out.print("Enter your Weight in Pounds: ");
        
        mass=cin.nextDouble();
        
        System.out.println("**********************************");
        
        //take inout of height in inches
        System.out.print("Enter your Height in Inches: ");
        
        height=cin.nextDouble();
        
        System.out.println("\n******************************************************************");
        
        //use if condition on mass and height that both the values should be greater than 0:
        if(mass>0 && height>0)
        {
        
            //call CalculateBMI method and save its returning value in bmi variable:
            bmi=CalculateBMI(mass,height);
        
            //call FindStatus method and prints bmi and weight staus
            System.out.println("You have a BMI of "+bmi+" and your weight status is "+FindStatus(bmi));
            
        }
        
        //else print this condition:
        else
            System.out.println("Please enter correct values of Weight and Height:");
    }
    
    /*
    create an value returning method which take 
    input of weight and height of a person and 
    then calculate it BMI:
    */
    public static double CalculateBMI(double weight, double height)
    {
        //declaring variables
        double BMI,temp;
        
        temp=height*height;
        
        //calculate BMI by this formula:
        BMI=weight*703/temp;
        
        return BMI;
    }
    
    //
    public static String FindStatus(double bmi)
    {
        //Declaring string variables:
        String str1="Normal",str2="UnderWeight",str3="Overweight",str4="Obese";
        
        //use if else condition to prints the weight status
        if(bmi<18.5 && bmi>0)
            
            return str2;
           
        
        else if(bmi>=18.5 && bmi<=24.9)
            
            return str1;
            
        
        else if(bmi>=25 && bmi<=29.9)
            
            return str3;
            
        
        else
            
            return str4;
             
    }
}
