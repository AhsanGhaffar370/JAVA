/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class MyApplication 
{
     public static void main(String [] args)
     { 
         Course cs1 = new Course("OOP","CSC-210"); 
         Course cs2 = new Course("DATA STRUCTURE","CSC-320"); 
         Student s1 = new Student("Tariq","DC0021","Software Engineering"); 
         Student s2 = new Student("Sarmad","DC0022","Multimedia"); 
         Student s3 = new Student("Wasim","DC0023","Information Systems");     
    
     s1.regCourse(cs1);   
     s2.regCourse(cs1);    
     s2.regCourse(cs2);    
     s3.regCourse(cs1); 
     
     s1.printInfo();    
     s2.printInfo();    
     s3.printInfo(); 
    } 

}
