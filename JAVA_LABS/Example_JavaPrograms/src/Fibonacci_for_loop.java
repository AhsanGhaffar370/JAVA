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
public class Fibonacci_for_loop
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
    
        //Declaring variable:
        int num;
        
        //
        System.out.print("Enter +ve num to print sum of Fibonacci series: ");
        
        num=cin.nextInt();
   
        //Call Fibonacci function:
        if(num>=0)
            
            System.out.println("\nThe Sum of Fibonacci Series is: "+Fibonacci(num));
        
        else
            System.out.println("\nEnter correct num to print sum of fibonacci series");
    }
   
    public static int Fibonacci(int count)
    {
        int f0=0,f1=1,f=0;
        
        System.out.print("\nThe Fibonacci Series is: ");
        
         for(int i=0;i<=count;i++)
        {
            if(i<=1)
            {
                f=i;
            
                System.out.print(f+" ");
            }
            
            else
            {
                f=f0+f1;
            
                f0=f1;
            
                f1=f;
                System.out.print(f+" ");
            }
        }
         System.out.println("\n");
        return f;
    }
    
}
