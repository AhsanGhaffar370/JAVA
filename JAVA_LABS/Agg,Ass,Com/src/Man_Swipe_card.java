/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Man_Swipe_card 
{
    public static void main(String[] args)
    {   
        Manager M=new Manager("ahsan",1500);
    
        Swipecard S=new Swipecard("a002");
        
        Worker W=new Worker("bilal");
        
        Project P=new Project(true,M);
        
           M.toString();
           
        M.man_progress();

     
    }
    
    
}
