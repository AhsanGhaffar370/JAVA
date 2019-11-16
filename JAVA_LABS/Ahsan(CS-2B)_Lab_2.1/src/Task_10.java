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
public class Task_10 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
         
        //Declaring vairbles for array size and to run the loop:
        int row,colRow,column=2,i,j,k;
        
        //taking size of an array:
        System.out.print("Enter the number of Students:");
        
        row=cin.nextInt();
        
        System.out.print("\nEnter the number of Courses:");
        
        colRow=cin.nextInt();
        
        //Declaring 3D arrays :
        int arr[][][]=new int[row][colRow][column];
        
        int arr2[][][]=new int[row][colRow][1];

        System.out.println("\n");
        
        /*Use nested for loop to take  inputs of the Student's course 
          Objextive and subjective marks:
        */
        for(i=0;i<row;i++)
        {
            
            for(j=0;j<colRow;j++)
            {
                
                for(k=0;k<column;k++)
                {
                    
                    System.out.print("Enter student["+(i+1)+"] marks["+(k+1)+"] in Course["+(j+1)+"] = ");
                    arr[i][j][k]=cin.nextInt();
                    
                }
                
                System.out.println("");
                
            }
           
        }//End of  for loop:
        
        //Use nested for loop to add student subjective and objective marks and 
        //store it in another array;
        for(i=0;i<row;i++)
        {
            
            for(j=0;j<colRow;j++)
            {
                
                arr2[i][j][0]=arr[i][j][0]+arr[i][j][1];
                
            }
            
        }//End of for loop:
        
        System.out.println("\n***************************************");
        
        //Prints the student's subjective and objective marks sum: 
        for(i=0;i<row;i++)
        {
            
            for(j=0;j<colRow;j++)
            {
                
                System.out.print("Marks of Student["+(i+1)+"] in Course["+(j+1)+"] = ");
                
                System.out.println(arr2[i][j][0]);
                
            }
            
            System.out.println("");
            
        }//End of for loop:
        
        System.out.print("***************************************\n");
        
    }
        
}
