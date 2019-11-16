/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Course 
{
    private String courseTitle;   
    private String courseCode; 
    
 	Course(String title,String code)  	
        {  
            courseTitle = title;       
            courseCode = code; 
     } 
 	public String getTitle() 
 	{
            return courseTitle; 
 	} 

}
