package Task_01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Passenger 
{
        
    private String name;
    private int age;
    
    public Passenger(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    
    public String toString()
    {
        return ("Name:"+name+"\nAge:"+" "+age);
    }
}
