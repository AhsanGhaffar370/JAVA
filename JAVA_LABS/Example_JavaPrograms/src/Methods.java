/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
//Methods and function both are same:
import java.util.Scanner;
public class Methods 
{
    public static void main(String args[])
    {
        
        
        Scanner cin=new Scanner(System.in);
        
        int a=1,b=3,c=2,sum,result;
        
        String name="Ahsan ",Lname="Ghaffar";
        
        //Call sum String class:
        Sum_String(name,Lname);
         
        //Call sum class and prints its value:
        System.out.println("Sum of two String is= "+SumString(name,Lname));
        
        //call add class and Prints its value:
        sum=add(a,b,c);
        
        System.out.println("Sum= "+sum);
        
        result = sum*2;
        
        System.out.println("Result ="+result);
        
    }
    
    //Create Class String(Pass by value):
    //return void:
    public static void Sum_String(String name,String Lname)
    {
        String sum;
        
        sum = name+Lname;
        
        System.out.println(sum);
    }
    
    /*Create Class (Pass by refrence)
      return String sum:
    */
    public static String SumString(String name,String Lname)
    {
        String sum;
        
        sum = name+Lname;

        return sum;
    }
    
    /*Create Add Class 
      Pass by refrence
    */
    public static int add(int x,int y,int z)
    {
        int sum;
        
        sum=x+y+z;
        
        return sum;
    }
}
