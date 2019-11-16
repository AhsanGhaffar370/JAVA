/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fall2015
 */
import java.util.Scanner;
public class Task_07 
{
    public static void main(String[] args) 
    {
        Scanner cin=new Scanner(System.in);
        
        //Declaring varibale:
        String word;
        
        //take input of stirng:
        System.out.print("Enetr any word: ");
        
        word=cin.nextLine();
        
        //Call Ispalindrome Method:
        System.out.println("\nThe Ispalindrome status for word ("+word+") is: "+Ispalindrome(word));
    }
   
    /*
    create Ispalindrome method which takes an input of 
    an string and check whether its an spalindrome or not 
    using boolean conditon:
    */
    public static boolean Ispalindrome(String s)
    {  
    
        //initialize boolean with fales:
        boolean status;
    
        //use if and else if condition to check every 1st and last letter of a string whether its ispalindrome or notz;
        if(s.length()==1)
            
            status=true;
    
        else if(s.charAt(0)==s.charAt(s.length()-1))
        {
            status=true;
      
            s=s.substring(1,s.length()-1);
      
            Ispalindrome(s);
        }
    
        //if condition is false exexute else block ( the status = false):
        else
            
            status=false;
  
        return status;
    }
    
}
