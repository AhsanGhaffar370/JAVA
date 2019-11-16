/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Input Scanner library:
import java.util.Scanner;
public class Task_08 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        
        /*Declaring variables for rows and columbs
          and to run the loop:
        */
        int row,column,i,j;
        
        //Taking input of two dimention array size:
        System.out.println("Enter the size of an array: ");
        
        row=cin.nextInt();
        column=cin.nextInt();
        
        //Declaring 2D integer array:
        int matrix[][]=new int[row][column];
        
        //taking input array elements :
        System.out.println("\nEnter the elements of a Matrix: ");
        
   
        //Use nested for loop to take input of 2D array:
        for(i=0;i<row;i++)
        {
            
            for(j=0;j<column;j++)
            {
               
                System.out.print("Enter ["+i+"]["+j+"]:" );
                matrix[i][j]=cin.nextInt();
           
            }
            
        }//End of for loop:
        
           
        System.out.println("\nOriginal Matrix A\n");
        
        
        //Print 2D array using nested for loop:
        for(i=0;i<row;i++)
        { 
            for(j=0;j<column;j++)
            {
             
                System.out.print(matrix[i][j]+"   ");
                
            }
            
            System.out.print("\n");
            
        }//End of for loop:
   
        System.out.println("\nThe Transpose of Matrix A\n");
         
        //Using nested for loop to print the transpose of Array;
        for(i=0;i<column;i++)
        { 
            for(j=0;j<row;j++)
            {
              
                //interchange rows with columns to print the transpose of Matrix A:
                System.out.print(matrix[j][i]+"   ");
                
            }
           
            System.out.print("\n");
            
        }//End of for loop:   
        
    }
}
