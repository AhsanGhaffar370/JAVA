package Lab_06;

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
        
        int i,j,s;
        int a1[]=new int[10];
        int a2[]=new int[10];
        
        System.out.println("Enter the 10 elements of an array:");
        
        for(i=1;i<=10;i++)
        {
            System.out.print("Enter value of element "+i+": ");
            a1[i]=cin.nextInt();
        }
        
        System.out.println("\nArray 1 original:");
        
        for(i=1;i<=10;i++)
        {
            System.out.println(a1[i]);
        }
        
        for(j=10;j>=1;j--)
        {
            a2[i]=a1[i];
        }
        
        System.out.println("\nArray 1 reverse:");
        
        for(i=1;i<=10;i++)
        {
            System.out.println(a2[i]);
        }
    }
}
