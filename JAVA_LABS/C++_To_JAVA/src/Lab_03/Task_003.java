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
public class Task_003 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        double op,m,st,stp,mp,tp,a,b;
        System.out.print("Enter the Original Price of Item = ");
        op=cin.nextDouble();
        System.out.print("\nPercentage of Marked-up Price in $ = ");
        m=cin.nextDouble();
        System.out.print("\nPercentage of Sales Tax in $ = ");
        st=cin.nextDouble();
        //print original price of item:
        System.out.println("\n*******************************");
        System.out.println("Original Price of Item= "+op);
        //calculate mark-up price:
        mp=op*m/100;
        System.out.println("Mark-up Price= "+mp);
        //Calculate Sales tax price:
        stp=op*st;
        System.out.println("Sales Tax Price= "+stp);
        System.out.println("*******************************");
        
    }
}
