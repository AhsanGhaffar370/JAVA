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
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring variable:
        int num;
        
        //Take input from user:
        System.err.print("Enter any num to Print Fabonacci Series: ");
        num=cin.nextInt();
        
        //call Fibonacci method:
        System.out.println("\nFibonacci Series= "+Fibonacci(num));
    }
    
    /*
    create an recursive method which take input of integer 
    number and then prints its fibonacci series using
    recursive method:
    */
    public static int Fibonacci(int num)
    {
        //use if and else condition to calculate and return fibonacci series:
        if(num ==0 || num==1)
            return num;
        
        //calculate and return fibonacci series:
        else
            return(Fibonacci(num-1)+Fibonacci(num-2));
    }
    
}
