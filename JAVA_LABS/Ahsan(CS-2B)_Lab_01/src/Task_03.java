
import java.util.Scanner;

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
public class Task_03 
{
         public static void main(String[] args) 
    {
        //Declaring variables:
        Scanner cin=new Scanner(System.in);
        
        int num1,num2;
            
        //Taking inputs :
        System.out.print("Enter the value of num1: ");
        num1=cin.nextInt();
        
        System.out.print("\nEnter the value of num2: ");
        num2=cin.nextInt();
       
        //Print sum ,Product and Difference of num1 &num2:
        System.out.println("\n******************************");
        System.out.println("Sum of num1 & num2 = " + (num1+num2));
        System.out.println("******************************");
        System.out.println("Difference of num1 & num2 = " + (num1-num2));
        System.out.println("******************************");
        System.out.println("Product of num1 & num2 = " + (num1*num2)); 
        System.out.println("******************************");
    }
}
