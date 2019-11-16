/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_example;

/**
 *
 * @author Ahsan
 */
public class UpcastDowncast 
{
    public static void main(String[] args) 
    {
        //when we use upcasting we can only use methods of parent class 
        //and when we call we call override methods its actually call child class method
        parent o=new child(); //upcasting
    
        //when we use downcasting we can use all methods of parent and child class
        child o1=(child)o; //downcasting
        o1.call1();
        o1.alpha();
        o1.call2();
        
    }
    
}
