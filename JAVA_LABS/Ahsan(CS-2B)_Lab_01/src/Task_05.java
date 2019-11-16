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
public class Task_05 
{
         public static void main(String[] args) 
    {
        
        Scanner cin=new Scanner(System.in);
       
        //Declaring Variables:
        int cookies,boxes,no_of_cartons,LB;
        double T_money,money_of_carton,money_of_LB;
        
        //Take Cookies Quantity:
        System.out.print("Enter the quantity of Cookies: ");
        cookies=cin.nextInt();
        
        //Calculate total no ofboxes:
        boxes=cookies/12;
        
        System.out.println("\n**********************************");
        System.out.println("Total no of Boxes ="+boxes);
        
        //Calculate total no of csrtons:
        no_of_cartons=boxes/24;
        
        System.out.println("**********************************");
        System.out.println("Total no of Cartons ="+no_of_cartons);
        
        //Calculate Total no pf left over boxes:
        LB=boxes%24;
        
        System.out.println("**********************************");
        System.out.println("Total no of Left over boxes ="+LB);
        
        //Calculate Money of Money:
        money_of_carton=no_of_cartons*24*1.14;
        
        System.out.println("**********************************");
        System.out.println("Total money of Cartons ="+money_of_carton+"$");
        
        //Calculate Left over Money:
        money_of_LB=LB*0.57;
        
        System.out.println("**********************************");
        System.out.println("Total money of Left over boxes ="+money_of_LB+"$");
        
        //Calculate Total Money:
        T_money=money_of_carton+money_of_LB;
        
        System.out.println("**********************************");
        System.out.println("Total money made from Cookies ="+T_money+"$");
        System.out.println("**********************************");
    }
}
