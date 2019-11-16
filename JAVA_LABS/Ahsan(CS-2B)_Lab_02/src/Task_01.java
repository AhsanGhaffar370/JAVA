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
public class Task_01 
{
    public static void main(String[] args) 
    {
        Scanner cin=new Scanner(System.in);
        
        String email,name,Lname,Hname,temp1,temp2,a1,a2,a3,a4;
        
        int s1,s2,s3;
        
        System.out.print("Enter your Email Address: ");
        email=cin.nextLine();
        
        s1=email.indexOf(".");
        a1=email.substring(0,s1);
        
        System.out.println("\n***********************");
        System.out.println("First Name: "+a1);
        temp1=email.substring(s1+1);
        
        s2=temp1.indexOf("@");
        a2=temp1.substring(0,s2);
        
        System.out.println("Last Name: "+a2);
        temp2=temp1.substring(s2+1);
        
        System.out.println("Host Name: "+temp2);
        System.out.println("***********************");
    }
}
