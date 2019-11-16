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
public class Task_03 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring variables:
        int row1,column1,row2,column2;
        
        //Taking Size Of Matrix A & B From User:
        
	System.out.println("Enter size of Matrix A: ");
        
        row1=cin.nextInt();
        
        column1=cin.nextInt();
	
        
        System.out.println("Enter size of Matrix B: ");
        
        row2=cin.nextInt();
        
        column2=cin.nextInt();
        
       
        //Declaring 2D arrays:
        int matrix1[][]=new int[row1][column1];
        int matrix2[][]=new int[row2][column2];
   

        
        System.out.println("\nEnter Values Of Matrix A:");
	
	//Use nested for loop to Take an  Input Of Matrix A Values from User:
	for(int i=0;i<row1;i++)
	{
            for(int j=0;j<column1;j++)
	    {
		System.out.print("Enter["+i+"]["+j+"] :");
                
		matrix1[i][j]=cin.nextInt(); 
            } 
	}//End of for loop:
	
        
        System.out.println("\nEnter Values Of Matrix B:\n\n");
    	
        //Use nested for loop to Take an Input Of Matrix B Values from User:
    
        for(int i=0;i<row2;i++)
        {	
            for(int j=0;j<column2;j++)	
            {       
                System.out.print("Enter["+i+"]["+j+"] :"); 
            
                matrix2[i][j]=cin.nextInt();	  
            }
        }//End of for loop

        
                
        if(column1 == row2)
        {  
            
            /*
            call matrixmultiplication method and then  call
            call it in displaymarix function which display 
            multiplicationmatix result in matrix form
            */
            DisplayMatrix(MatrixMultiply(matrix1,matrix2,row1,row2,column2),row1,column2);

        }
        else
            System.out.println("Matrix Multiplication is not possible:");
        
        /*
        call SumMatrix method and then  call
        call it in displaymarix function which display 
        summatrix result in matrix form
        */
        DisplayMatrix(MatrixSum(matrix1,matrix2,row1,column1),row1,column2);

    }//End of main:
    
    
    /*
    Create an array returning method(MatrixMultiplication)
    which take two array matrix and 
    reurn their multiplication
    */
    public static int[][] MatrixMultiply(int matrix1[][],int matrix2[][],int row1,int row2,int column)
    {   
        int sum=0;
        
        int MultMatrix[][]=new int[row1][column];

        /*Apply Nested For loop To calculate Multiplication Of 
        Matrix A & B And Store It In Matrix C:*/  
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<column;j++)
            {
                for(int k=0;k<row2;k++)
                {
                    //Multiply array1 and array2 and store their values in sum variable:
                    sum+=matrix1[i][k]*matrix2[k][j];
                }
                
                //store sum values into another 2D array:    
                MultMatrix[i][j]=sum;
      
                //initialize sum with "o" to to take new input :
                sum=0;
            }
        }//End of for loop:
        
        System.out.print("\nMultiplication Of Matrix A & B:\n");
 
        
        //return multiplication of matrix1 and matrix2:
        return MultMatrix;
        
    }//End of matrixMultiplication method:
    
    
    /*
    create an vallue returning method which take two matrix and and 
    and calculate their sum and then return:
    */
    public static int[][] MatrixSum(int matrix1[][],int matrix2[][],int row,int column)
    {
        
        //initialize summatrix:
        int SumMatrix[][]=new int[row][column];

        //apply for loop which take sum of two matrix and save it in Summatrix 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                SumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
         
        }
        
        System.out.print("\nSUM Of Matrix A & B:\n");
        
        //return Sum of a matrix1 and matrix2:
        return SumMatrix;
        
    }//End of SumMatirx method:
    
    
    
    //Create an void method which display an array in matrix form:
    
    public static void DisplayMatrix(int DisMatrix[][],int row,int column)
    {
        //apply nested for loop to print an array in matrix form:
        
        for(int i=0;i<row;i++)
	{
            
	    for(int j=0;j<column;j++)
	    {
	        System.out.print("\t"+DisMatrix[i][j]);
	    }
            
            System.out.print("\n");
            
	}//End of for loop
        
    }//End of DisplayMatrix method:
       
}//End of class