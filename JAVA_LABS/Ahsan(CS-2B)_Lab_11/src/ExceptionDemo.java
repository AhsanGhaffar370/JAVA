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
public class ExceptionDemo  
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
 	   
        int donutCount, teaCount;
        double donutsPerGlass = 0;
          
         try  //try block   
         { 
            System.out.println("Enter number of donuts:");     
            donutCount = input.nextInt( ); 
 
            System.out.println("Enter number of cup of tea:");             
            teaCount = input.nextInt( ); 
             
            if (teaCount < 1) 
              //when the throw statement is executed, the block is stopped throw new Exception("Exception: No Tea!"); 
              
                donutsPerGlass = donutCount/(double)teaCount;             
            
            
            System.out.println(donutCount + " donuts."); 
            
            System.out.println(teaCount + " cup of tea."); 
            System.out.println("You have " + donutsPerGlass + " donuts for each cup of tea."); 
   } 
 
        catch(Exception e)  // catch block 
        { 
            System.out.println(e.getMessage( )); 
            System.out.println("Go buy some tea."); 
        } 
 
        System.out.println("End of program."); 
    } 
} 
