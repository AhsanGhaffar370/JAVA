/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prac;

/**
 *
 * @author Ahsan Ghaffar
 */
public class Circle extends Shape
{
    private int radius;

    public Circle(point p,int radius) 
    {
        super(p);
        this.radius=radius;  
    }

    public int getRadius() 
    {
        return radius;
    }
 

    
    public String toString()
    {
        return "radius"+radius+super.toString();
    }
    
}
