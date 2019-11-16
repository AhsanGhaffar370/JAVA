/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
import java.util.Vector;
public class Student 
{
private String name;     
private String matrix;   
private String major; 
private Vector courseList; //declare vector of course  	
     Student(String n,String m,String maj)
     { 
      	name=n;     
        matrix=m;       	
        major=maj; 
      	courseList = new Vector();//initialize the vector 
 	
     } 
 	public String getName()     
        { return name; } 
 	
        public void regCourse(Course course)
        {
            courseList.addElement(course);
        }
        
        public void printInfo() 
 	{ 
     
            System.out.println("\nSTUDENT NAME :"+ name);     
            System.out.println("NUMBER OF COURSE(s) TAKEN :" +courseList.size()); 
     
            System.out.println("LIST OF COURSE(s) TAKEN :");    

            for(int i=0;i<courseList.size();i++)
            {
                Course course=(Course) courseList.elementAt(i);
            }

 	} 

    
}
