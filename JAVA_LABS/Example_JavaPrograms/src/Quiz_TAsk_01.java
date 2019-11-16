/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fall2015
 */
public class Quiz_TAsk_01 
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            if(i==3)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print(j+" ");
                }
                
                System.out.println("");
            }
            
            else
            {
                System.out.println("    "+i);
            }
        }
    }
        
}

