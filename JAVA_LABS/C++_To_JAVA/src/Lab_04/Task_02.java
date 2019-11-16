package Lab_04;

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
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Enter any integer value for 'a': ");
        a=cin.nextInt();
        
        System.out.print("Enter any integer value for 'b': ");
        b=cin.nextInt();
        
        System.out.print("Enter any integer value for 'c': ");
        c=cin.nextInt();
        
        if(a<b && a<c)
        {
            System.out.println("\n************************************");
            System.out.println("The Smallest among three is 'a': "+a);
            System.out.println("************************************");
        }
        
        if(b<a && b<c)
        {
            System.out.println("\n************************************");
            System.out.println("The Smallest among three is 'b': "+b);
            System.out.println("************************************");
        }
        
        if(c<a && c<b)
        {
            System.out.println("\n************************************");
            System.out.println("The Smallest among three is 'c': "+c);
            System.out.println("************************************");
        }
    }
}
