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
public class Shape 
{
    private point p;
    
    public Shape(point p) {
        this.p = p;
    }
    
    public point getCenter()
    {
        return p;
    }
    
    public boolean contains(point p)
    {
        return true;
    }
    
}
