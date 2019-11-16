/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Include Scanner Library:
import java.util.Scanner;
public class Task_07 
{
        //Declaring Constants:
    static final double FAC =703;
    static final double K = 2.2;
    static final double M = 0.025;
     
    public static void main(String[] args) 
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring Variables:
        double m_lb,h_in,i,j,k,l,bmi;
        
        System.out.print("Enter Weight(lb): ");
        m_lb=cin.nextDouble();
        
        System.out.print("\nEnter Height(inch): ");
        h_in=cin.nextDouble();
        
        i=m_lb/2.2;
        j=h_in*0.025;
        
        System.out.println("\nWeight in Kg: "+ (i));
        
        System.out.println("\nHeight in Meter: "+ (j));
        
        //Solving formula BMI=mass(lb)*703/height(inch):
        
        //solve k=mass*703:
        k=i*FAC;

        //Solve l=height*height:
        l=j*j;
        bmi=k/l;
        
        //Prints BMI Value:
        System.out.println("\n****************************");
        System.out.println("The value of BMI = "+bmi+" kg/m");
        System.out.println("****************************");
    }
}
