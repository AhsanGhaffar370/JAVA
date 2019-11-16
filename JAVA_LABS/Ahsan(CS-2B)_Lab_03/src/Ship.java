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
public class Ship 
{
    Scanner cin=new Scanner(System.in);
    
    int box,L,M,S;
    double cost,Tcost;
    
    public Ship()
    {
        System.out.println("Enter the number of Boxes for Order: " );
        box=cin.nextInt();
    }
}
