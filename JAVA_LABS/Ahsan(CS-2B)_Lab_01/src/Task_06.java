/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Incllude Scanner Library To rake inputs:
import java.util.Scanner;
public class Task_06 
{
    public static void main(String[] args) 
    {
        Scanner cin=new Scanner(System.in);
        
        //(a)
        //Declaring Variables:
        double i,d1,d2,rpm1,rpm2;
        
        System.out.println("\n\t*************");
        System.out.println("\t    A Part");
        System.out.println("\t*************");
        
        //Take Inputs of D1,D2 & RPM1:
        System.out.print("Enter the value of diameter1: ");
        d1=cin.nextDouble();
        
        System.out.print("\nEnter the value of diameter2: ");
        d2=cin.nextDouble();
        
        System.out.print("\nEnter the value of RPM1: ");
        rpm1=cin.nextDouble();
        
        //Solving Formula RPM2=D1/D2*RPM1:
        i=d2*rpm1;
        rpm2=d1/i;
        
        //Print RPM2:
        System.out.println("\n*******************************");
        System.out.println("The Value of RPM2 = "+rpm2);
        System.out.println("*******************************");
        
        //(b)
        //Declaring Variables:
        double wl,f,nr;
        
        System.out.println("\n\n\t*************");
        System.out.println("\t    B Part");
        System.out.println("\t*************");
        
        //Taking Inputs of Force & No of up ropes:
        System.out.print("\nEnter the value of Force Exerted: ");
        f=cin.nextDouble();
        
        System.out.print("\nEnter the value of No Of Up Ropes: ");
        nr=cin.nextDouble();
        
        //solve formula Weight lifted=force exerted*no of up ropes:
        wl=f/nr;
        
        //Print Lifted Weight Value:
        System.out.println("\n**********************************");
        System.out.println("The Value of Lifted Weiht = "+wl);
        System.out.println("**********************************");
    }
}
