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
 import java.io.*; 
public class TestExceptions 
{
/*  Divide by zero error Exception Handling*/
    static int getInt() throws IOException  
    {
        Scanner input =  new Scanner(System.in);  
      
        System.out.print("Enter an integer: ");  
     
        int s = input.nextInt();
        return (s);  
    }
    public static void main(String[] args)  
 
    {
        int n1=0, n2=1, n3=0;   
        try 
        { 
            n1 = getInt();   
            n2 = getInt();      
            n3 = n1/n2;  
        }
        catch (Exception e)  
    { 
        System.out.println("[" + e + "]"); 
    }  
    
        System.out.println(n1 + "/" + n2 + " = " + n3);  
    }  
}  
