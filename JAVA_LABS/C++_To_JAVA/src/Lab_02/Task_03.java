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
public class Task_03
{
    public static void main(String[] args)
    {
       Scanner cin=new Scanner(System.in);
       float a,Tmarks,Omarks,p;
       String course;
        System.out.print("Enter Course name: ");
        course=cin.nextLine();
        System.out.print("Obtained Markks: ");
        Omarks=cin.nextFloat();
        System.out.print("Total Marks: ");
        Tmarks=cin.nextFloat();
        p=Omarks/Tmarks*100;
        System.out.println("In "+course+" course. You have scored "+p+"%");
    }
    
}
