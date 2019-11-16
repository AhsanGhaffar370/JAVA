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
public class Task_04 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring variable;
        int num;

        //take input from user:
        System.out.print("Enter any num: ");
        
        num=cin.nextInt();
        
        //Call SumSeries method which prints sum of series from 0 to user input:
        System.out.println("Sum of Series = "+SumSeries(num));
                
    }
    
    /*
    create an recursive method whick take input of integer num and 
    then calculate it sum of a series from 0 to user input:
    */
    static int SumSeries( int num )
    { 
        //user if else condition to prints the sum of a series:
        if( num <= 0 ) 
            return 0;
        
        else 
            return num + SumSeries( num-1 ); 
    }
    
}
