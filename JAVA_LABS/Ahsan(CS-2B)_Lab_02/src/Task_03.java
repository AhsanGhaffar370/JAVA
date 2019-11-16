/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
import java.util.Scanner;
public class Task_03 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        
        double bmi,w,m,h,t;
        
        System.out.println("**********************************");
        System.out.print("Enter your Weight in Pounds: ");
        m=cin.nextDouble();
        System.out.println("**********************************");
        System.out.print("Enter your Height in Inches: ");
        h=cin.nextDouble();
        System.out.println("\n******************************************************************");
        
        t=h*h;
        bmi=m*703/t;
        
        if(bmi<18.5)
        {
            System.out.println("Your have a BMI of "+bmi+", and your weight status is Underweight"); 
            System.err.println("******************************************************************");
        }
        
        else if(bmi>=18.5 && bmi<=24.9)
        {
            System.out.println("Your have a BMI of "+bmi+", and your weight status is Normal"); 
            System.err.println("******************************************************************");
        }
        
        else if(bmi>=25 && bmi<=29.9)
        {
            System.out.println("Your have a BMI of "+bmi+", and your weight status is Overweight"); 
            System.err.println("******************************************************************");
        }
        
        else if(bmi>=30)
        {
             System.out.println("Your have a BMI of "+bmi+", and your weight status is Obese");
             System.err.println("******************************************************************");
        }
    }
}
