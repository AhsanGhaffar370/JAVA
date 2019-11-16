
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Include Scanner library to take inputs:
import java.util.Scanner;
public class Task_04 
{
    //Declaring Cocnstants:
    static final double A=0.37;
    static final int B=460;
    
    public static void main(String[] args) 
    {
        //Declaring variables:
        Scanner cin=new Scanner(System.in);
        
        double m,tem,vel,i,j,pre;
        
        //Taking inputs of m,T,V;
        System.out.print("Enter value of m: ");
        m=cin.nextDouble();
        
        System.out.print("\nEnter value of T: ");
        tem=cin.nextDouble();        
        
        System.out.print("\nEnter value of V: ");
        vel=cin.nextDouble();
        
        //Solving Formula P=0.37m(T+460)/V
        i=tem+B;
        j=A*m*i;
        pre=j/vel;
        
        //Prints the value of P:
        System.out.println("\n**************************");
        System.out.println("The vaue of P is ="+pre);
        System.out.println("**************************");
    }
}
