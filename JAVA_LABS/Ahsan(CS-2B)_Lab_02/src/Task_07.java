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
public class Task_07 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
	
        int a,b,s1;
        
        System.out.print("Enter size of array1: ");
        s1=cin.nextInt();
	
        int arr1[]=new int[s1];
	
        //design an histogram on different values of array:
	System.out.println("Element\t\t\tValue\t\t\tHistogram");
	
	/*apply nested for loop to enter values of array and print * on 
        different value of array to design a graph:*/
	for(a=0;a<s1;a++)
	{
            System.out.print(a+"\t\t\t");
	    
            arr1[a]=cin.nextInt();
            
            System.out.print("\t\t\t\t\t\t");
		
            for(b=1;b<=arr1[a];b++)
	    {
		  System.out.print("*");	
	    }
		       
            System.out.print("\n");

    }
    }
}
