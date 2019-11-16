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
public class Task_02 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int a,b;
    
        System.out.println("Enter two integer numbers: ");
        a=cin.nextInt();
        b=cin.nextInt();
        
        System.out.println("\n"+a+" + "+b+"= "+(a+b));
        System.out.println(a+" - "+b+"= "+(a-b));
        System.out.println(a+" * "+b+"= "+(a*b));
        System.out.println(a+" / "+b+"= "+(a/b));
        System.out.println(a+" % "+b+"= "+(a%b));
    }
}
