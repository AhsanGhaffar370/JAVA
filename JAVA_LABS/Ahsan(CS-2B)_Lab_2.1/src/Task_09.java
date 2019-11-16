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
public class Task_09 
{
    public static void main(String[] args)
    {
       
        Scanner cin=new Scanner(System.in);	
        
        //Declaring Variable:
	int i,j,k,row1,column1,row2,column2;
	
	//Taking Size Of Matrix A & B By User:
	System.out.println("Enter size of Matrix A: ");
	
        row1=cin.nextInt();
        column1=cin.nextInt();
        
	System.out.println("Enter size of Matrix B: ");
	
        row2=cin.nextInt();
        column2=cin.nextInt();
	
	//Declaring int:	
	int sum=0;
	
        //Declaring Arrays:
        int mat1[][] = new int[row1][column1];
        int mat2[][] = new int[row2][column2];
        int mat3[][] = new int[row1][column2];  	

        //The Whole Program is Skipped If Column1 is Not Equal to Row2: 
            if(column1!=row2)
        
            {
                System.out.println("Matrix Multiplication is not Possible. Please Try again");
                return;
            }

	
        System.out.println("\nEnter Values Of Matrix A:");
	
	//Taking Input Of Matrix A Values from User:
	for(i=0;i<row1;i++)
	{
	 
            for(j=0;j<column1;j++)
	    {
		System.out.print("Enter["+i+"]["+j+"] :");
		mat1[i][j]=cin.nextInt();
                
            }
            
	}//End of for loop:
	
        System.out.println("\nEnter Values Of Matrix B:\n\n");
    	
    //Taking Input Of Matrix B Values from User:
    for(i=0;i<row2;i++)
    {	
       
        for(j=0;j<column2;j++)	
        {       
          
            System.out.print("Enter["+i+"]["+j+"] :"); 
            mat2[i][j]=cin.nextInt();	
            
        }
	
    }//End of for loop
    
    /*Apply Nested For loop To calculate Multiplication Of 
    Matrix A & B And Store It In Matrix C:*/  
    for(i=0;i<row1;i++)
    {
        
    	for(j=0;j<column2;j++)
    	{
            
    	    for(k=0;k<row2;k++)
    	    {
                
                //Multiply array1 and array2 and store their values in sum variable:
    	        sum+=mat1[i][k]*mat2[k][j];
                
	    }
	    
        //store sum values into another 2D array:    
        mat3[i][j]=sum;
        
        //initialize sum with "o" to to take new input :
	sum=0;
        
        }
        
    }//End of for loop:

	System.out.println("\nMatrix A\n");
	
        //Prints Matrix A:
	for(i=0;i<row1;i++)
	{
            
	    for(j=0;j<column1;j++)
            {     
                
                System.out.print("\t"+mat1[i][j]);
                
            }
            
            System.out.print("\n");
            
	}//end of for loop
 
	System.out.print("\nMatrix B\n");
	
	//Prints Matrix B:
	for(i=0;i<row2;i++)
	{
            
            for(j=0;j<column2;j++)
            { 
                
                System.out.print("\t"+mat2[i][j]);
                
            }
            
            System.out.print("\n");
            
	}//End of for loop

	System.out.print("\nMultiplication Of Matrix A & B:\n");
        
	System.out.println("\nMatrix C\n");
	
	//Prints Multiplication Of Matrix A & Matrix B:
	for(i=0;i<row1;i++)
	{
            
	    for(j=0;j<column2;j++)
	    {
                
	        System.out.print("\t"+mat3[i][j]);
                
	    }
            
            System.out.print("\n");
            
	}//End of for loop
        
    }//End of Main
    
}//End of class
