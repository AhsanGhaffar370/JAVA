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
public class Task_04 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int x,q=0,num,den;
        System.out.print("Enter any num for Numerator: ");
        num=cin.nextInt();
        System.out.print("\nEnter any num for Denominator: ");
        den=cin.nextInt();
        for(;num>=den;q++)
        {
            x=num-den;
            num=x;
        }
        System.out.println("\n****************************");
        System.out.println("The Remainder is: "+num);
        System.out.println("The Quotient is: "+q);
        System.out.println("****************************");
    }
}
