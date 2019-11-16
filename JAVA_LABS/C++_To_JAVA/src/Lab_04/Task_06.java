package Lab_04;

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
public class Task_06 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int mon;
       
        System.out.println("Enter any num between (1 to 12): ");
        mon=cin.nextInt();
        
        //Apply condition
        //Using Switch condition to print the month of year
        switch(mon)
 
        {
 	
            case 1:
 	          
            System.out.println("\nThe month of year is: January");
            break;
	 
            case 2:
 	
                System.out.println("\nThe month of year is: February");
                break;
	 
            case 3:
 	
                System.out.println("\nThe month of year is: March");
                break;
	 
            case 4:
 	
                System.out.println("\nThe month of year is: April");
                break;
	 
            case 5:
 	
                System.out.println("\nThe month of year is: May");
                break;
	
            case 6:
 	
                System.out.println("\nThe month of year is: June");
                break;
	 
            case 7:
 	
                System.out.println("\nThe month of year is: July");
                break;
	
            case 8:
 	
                System.out.println("\nThe month of year is: August");
                break;
	
            case 9:
 	
                System.out.println("\nThe month of year is: September");
                break;
	 
            case 10:
 	
                System.out.println("\nThe month of year is: October");
                break;
	
            case 11:
 	
                System.out.println("\nThe month of year is: November");
                break;
	
            case 12:
 	
                System.out.println("\nThe month of year is: December");	
 
        }
        
    }
}
