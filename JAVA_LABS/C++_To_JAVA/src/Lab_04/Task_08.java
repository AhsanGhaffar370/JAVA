package Lab_04;

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
public class Task_08 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        	
        //declaring variables:
	float a,b,c;
	int op; 
	
        //Enter values:
	
        System.out.println("Enter any three values:");
	
        a=cin.nextInt();
        b=cin.nextInt();
        c=cin.nextInt();
	
        System.out.println("\n'1' for Smallest: ");
	
        System.out.println("\n'2' for Largest:");
	
        System.out.println("\n'3' for Sum:");
	
        System.out.println("\n'4' for Average:");
	
        System.out.println("\nEnter any one of the above choices: ");
        op=cin.nextInt();
	
        switch(op)
        {
	//For smallest number:	
	
            case 1:
	
            if(a<b && a<c) 
            
                System.out.println("\nThe smallest num is: "+a);
    
            else if(b<a && b<c) 
        
                System.out.println("\nThe smallest num is: "+b);
	
            else if(c<a && c<b)
            
                System.out.println("\nThe smallest num is: "+c);
	
            break;
	
        //For largest number:
	
        
            case 2:
	
            if(a>b && a>c) 
            
                System.out.println("\nThe largest num is: "+a);
    
            else if(b>a && b>c) 
            
                System.out.println("\nThe largest num is: "+b);
	
            else if(c>a && c>b)
            
                System.out.println("\nThe largest num is: "+c);
	
            break;
	
        //For Sum:
	
            case 3:
	
                System.out.println("\nSum of Values are:"+(a+b+c));	
	
            break;
	
        //For Average:
        
            case 4:
	
                System.out.println("\nAvearage of Values are: "+((a+b+c)/3));	
        
            break;
	}
    }
}
