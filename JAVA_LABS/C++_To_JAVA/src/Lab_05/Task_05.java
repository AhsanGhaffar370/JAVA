package Lab_05;

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
public class Task_05 
{
    public static void main(String[] args)
    {
        /*Write a C++ program that receives the total number of integers (N). 
        Then, the program will ask for N real numbers. By applying for loop, 
        your program should find and display the largest and the lowest of the 
        numbers. Give a proper message for invalid user input*/
        Scanner cin=new Scanner(System.in);
        int num,i,j,k;
        
        System.out.print("Enter any integer num: ");
        num=cin.nextInt();
        

        
        for(i=1;i<=5;i++)
        {
            if(num<=0)
            {
                System.out.println("Opps you entered an invalid number:");
                
                return;
            }
            
            else if(num==1)
            {
                System.out.println("Sorry you hava no number for me to compare:");
                return ;
            }

            if(i>1)
            {
                System.out.print("Please enter numbers "+i+": ");
            }
        }
    }
}
