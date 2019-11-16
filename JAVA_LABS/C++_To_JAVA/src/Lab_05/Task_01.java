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
public class Task_01 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        int a,i,j;
        
        System.out.print("Enter any integer num for a size to print a diamond: ");
        a=cin.nextInt();
        
        for(;a>0;a--)
        {
            for(j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
