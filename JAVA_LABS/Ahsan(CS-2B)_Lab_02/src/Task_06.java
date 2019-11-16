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
public class Task_06 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int [] num = new int[100]; 
        int [] count = new int[100];
    
        //Declare counter variable i
        //and temp variable that will
        //temporarily hold the value
        //at a certain index of num[] array
    
        int i,temp = 0;
    
        System.out.println("Enter the integers between 1-100: ");
        System.out.println("(When you enter '0',the program stops taking input)");
        //Initialize num[] array with user input
    
        for(i=0; i < num.length; i++)
        {
            num[i] = input.nextInt();
            
            //input will end when user enters zero
            if(num[i] == 0)
            {
                break;
            }
        }

        /*value at given index of num array stored in temp variable
        temp variable act as index value for count array and 
        keep track of number of occurences of each number*/
    
        for(i = 0; i < num.length; i++)
        {
            temp = num[i];
            count[temp]++;
        }

        for(i=1; i < count.length; i++)
        {

        
            if(count[i] > 0 && count[i] == 1)
            {
                System.out.print(" occurs time\n"+i);
                System.out.println(count[i]);
            }
        
            else if(count[i] >=2)
            System.out.println(i+" occurs     "+count[i]+" times ");
        }
    }
}