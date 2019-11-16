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
public class Task_02 
{
    public static void main(String args[])
    {
            
        Scanner cin=new Scanner(System.in);
                
        int num;
        
        //use do while condition to repeat the program untill the user input -ve value
        do
        {
            //take input of +ve integer number:
            System.out.print("\nEnter +ve num to print the ODD and EVEN series Sum\n(Enter -ve num to exit Program):\n ");
        
            num=cin.nextInt();
            
            System.out.println("\n******************************************");

            //call EvenSum method which prints sum of even series from 0 to user input:
            System.out.println("The Sum of your Number EVEN Series is "+EvenSum(num));
            
            //call OddSum method which prints sum of odd series from 0 to user input:
            System.out.println("\nThe Sum of your Number ODD Series is "+OddSum(num));
            
            System.out.println("******************************************");
        
        }while(num>0);
    }
    
    //crate a recursive method which take int num and prints even series sum from 0 to user inputs:
    public static int EvenSum(int num)
    {
        //use if and else if condition to calculate the even series sum
        if(num<=0) 
            
            return 0;

        else if(num%2==1)
            
            num=num-1;
  
        //calculate and return even series sum
        return (num+(EvenSum(num-2)));
    }
    
    //crate a recursive method which take int num and prints ODD series sum from 0 to user inputs:
    public static int OddSum(int num)
    {
        //use if and else if condition to calculate the odd series sum
        if(num<=0)
            
            return 0;

                
        else if(num%2==0)
            
            num=num-1;

         //calculate and return even series sum
        return (num+(OddSum(num-2)));
    }
    
}
