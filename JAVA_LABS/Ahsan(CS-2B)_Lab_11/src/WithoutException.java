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
public class WithoutException  
{
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);      
        int donutCount, teaCount;       
        double donutsPerGlass; 
         
        System.out.println("Enter number of donuts:");       
        donutCount = input.nextInt( ); 
 
        System.out.println("Enter number of cup of tea:");       
        teaCount = input.nextInt( ); 
                  
        if (teaCount < 1) 
        { 
            System.out.println("No Tea!"); 
            System.out.println("Go buy some tea."); 
        }
        
        else 
        {       
            donutsPerGlass = donutCount/(double)teaCount; 
            System.out.println(donutCount + " donuts."); 
            System.out.println(teaCount + " cup  of tea."); 
            System.out.println("You have " + donutsPerGlass + " donuts for each cup of tea."); 
        } 
        
        System.out.println("End of program."); 
    } 
} 