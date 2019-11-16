package Task_03;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Patient 
{   
    private int patientid;
    private String patientname;
    private int patientage;
    
    public Patient()
    {
      
    }
    
    public int getpatid()
    {
        return patientid;
    }
    
    public void read()
    {
        Scanner input=new Scanner(System.in);
    
        System.out.println("*************************************");
        
        System.out.print("Enter the id of the Patient: ");
    
        patientid=input.nextInt();
    
        input.nextLine();
    
        System.out.print("Enter the name of the Patient: ");
    
        patientname=input.nextLine();
    
        System.out.print("Enter the age of the Patient: ");
   
        patientage=input.nextInt();
        
        System.out.println("*************************************");
        
        System.out.println("\n");
    }
   
    public void displayAll()
    {
        System.out.println("Patient ID: "+patientid);    
   
        System.out.println("Patient Name: "+patientname);    
   
        System.out.println("Patient Age: "+patientage);
   }

}
