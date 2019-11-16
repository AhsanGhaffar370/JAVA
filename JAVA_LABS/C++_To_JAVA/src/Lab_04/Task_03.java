package Lab_04;

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
public class Task_03 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        String alp,a,e,o,i,u,c;
        c="c";
        a="a";
        e="e";
        o="o";
        i="i";
        u="u";
        
        System.out.print("Enter any Alphabet: ");
        alp=cin.nextLine();
        
        if(alp.equals(a) || alp.equals(e) || alp.equals(i) || alp.equals(o) || alp.equals(u))
        {
            System.out.println("The alphabet is Vovel:");
        } 
        
        else
        {
            System.out.println("The alphabet not vovel");    
        }
    }
}
