/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_06;

/**
 *
 * @author Ahsan
 */
import java.util.Scanner;

public class Task_02 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        //Declaring Arrays:
	int i;
    
        int arr1[]=new int[7];
        int arr2[]=new int[7];
        
        //Enter values of array1:
	for(i=0;i<7;i++)
	{
            
            System.out.print("Enter Element "+i+" in A:");
	    arr1[i]=cin.nextInt();
            
	}
        
        System.out.print("\n\n");
	
	
	//Enter values of array2:
	for(i=0;i<7;i++)
	{
            
		System.out.print("Enter Element "+i+" in B:");
	        arr2[i]=cin.nextInt();
                
	}
    
    //Comparing values of arr1 & arr2:
	if(arr1[0]==arr2[0] || arr1[1]==arr2[1]  || arr1[2]==arr2[2]  || arr1[3]==arr2[3]  || arr1[4]==arr2[4]  || arr1[5]==arr2[5]  || arr1[6]==arr2[6])
	{
            
            System.out.println("\nTwo Arrays are same:");
		
	}
	
	//If values of arr1 & arr2 are not same cout else statement:	
	else
	{
            
            System.err.println("Arrays are not same:");
		
	}
}

    
}
