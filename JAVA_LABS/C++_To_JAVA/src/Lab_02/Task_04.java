package Lab_02;

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
    static final int A=2;
     public static void main(String[] args)
     {
         Scanner cin=new Scanner(System.in);
         int a,b,x,i,j;
         System.out.print("Enter the value of A: ");
         a=cin.nextInt();
         System.out.print("Enter the value of B: ");
         b=cin.nextInt();
         
         x=(a+b)*A+a*b*A;
         System.out.println("\nThe answer of the formula is: "+x);
         
     }
}
