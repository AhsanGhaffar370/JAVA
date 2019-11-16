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
public class Task_002 
{
    static final double P=2.2;
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        double wk,wp;
        System.out.print("Enter your Weight in Kg : ");
        wk=cin.nextDouble();
        //calculate Weight in ponds:
        wp=wk*P;
        System.out.println("\n**************************");
        System.out.println("Your Weight in Kg: "+wk);
        System.out.println("Your Weight in Pounds: "+wp);
        System.out.println("**************************");
    }
}
