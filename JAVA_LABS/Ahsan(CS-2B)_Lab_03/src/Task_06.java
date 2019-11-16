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
public class Task_06 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring variables :
        
        int base,pow;
        
        //taking inputs of base and power :
        System.out.print("Enter any base number: ");
        
        base=cin.nextInt();
        
        System.out.print("\nEnter any number for Power: ");
        
        pow=cin.nextInt();
        
        //Call PowerCalulator mehtod:
        
        System.out.println("\nThe Calculation of Power["+pow+"] of Base["+base+"] is: "+PowerCalculator(base , pow));
        
        
    }
    
    //create recursive method which take input of base and power and 
    //then return its answer using recursive method:
    public static int PowerCalculator(int base , int pow)
    {
        //use if and else condition to calculate power of base:
        if(pow == 0)
        
            return 1;
        
        //Return calculated power:
        else
            
            return base*PowerCalculator(base , pow-1);
    }
 
}
