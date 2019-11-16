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
public class rectangle extends Shape{
    private int length;
    private int width;
    
    public rectangle(point c, int length, int width)
    {
        super(c);
        this.length=length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public String toString()
    {
        return super.toString()+" length "+length+" width "+width;
    }
    
}
