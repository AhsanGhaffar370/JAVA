/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fall2017
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
public class reading 
{
    public static void main(String[] args) 
    {
        Scanner cin=null;
        PrintWriter output=null;
        try
        {
            cin=new Scanner(new File("read.txt"));
            output=new PrintWriter(new File("write.txt"));
        }
        catch(Exception e)
        {
            System.out.println(e);
                    
        }
        
        int sum=0;
        
        while (cin.hasNextInt())
        {
            sum+=cin.nextInt();
        }
        
        System.out.println("Sum of file numbers are: "+sum);
        output.println("Total:"+sum);
        output.close();
    }
}
