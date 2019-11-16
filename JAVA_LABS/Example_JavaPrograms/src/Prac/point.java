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
public class point 
{
    private int x,y; 

    public point(int x, int y) 
    {
        this.x = x; 
        this.y = y; 
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public double distanceTo(point p)
    {
        return Math.sqrt((x-p.getX())*(x-p.getX())+ (y-p.getY())*(y-p.getY()));  
    }
    
    public String toString() 
    {  
        return "("+x+", "+y+")";  
    }  

}
