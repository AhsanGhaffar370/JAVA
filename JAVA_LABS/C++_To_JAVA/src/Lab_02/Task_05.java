package Lab_02;

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
public class Task_05 
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int birth;
        String name,Pname,university,hobby;
        System.out.print("What's your Name : ");
        name=cin.nextLine();
        System.out.print("Enter year of birth : ");
        birth=cin.nextInt();
        System.out.print("Name of University : ");
        university=cin.nextLine();
        System.out.print("Favourite Hobby : ");
        hobby=cin.nextLine();
        System.out.print("Enter your Pet's name : ");
        Pname=cin.nextLine();
        System.out.println("There lives a Person named "+name+" who is cuurently ");
        System.out.println((2017-birth)+" years of age."+name+" is studying at"+university+".");
        System.out.println( "It is interesting beacause "+name+" likes to "+hobby); 
        System.out.println(" with "+Pname+"and they lives a happily life.");
    }
    
}
