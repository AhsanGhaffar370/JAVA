package Lab_05;

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
public class TAsk_04 
{
    public static void main(String args[])
    {
        Scanner cin=new Scanner(System.in);
        int posNum,i,j,a,b;
        
        
        
        do
        {
            System.out.print("Enter any pos integer number: ");
        posNum=cin.nextInt();
            
            if(posNum==1)
            {
                 System.out.println("Value is : "+posNum+" Thank You");
                 break;
            }
            else if(posNum<=0)
            {
                System.out.println("Wrong Input Please Try again:");
                break;
            }
            else if(posNum%2==0)
            {
                a=posNum/2;
                System.out.println("Value is: "+a);
            }
            else if(posNum%2!=0)
            {
                b=posNum*3;
                System.out.println("The value is : "+b);
            }
        }while(posNum>1);
    }
}
