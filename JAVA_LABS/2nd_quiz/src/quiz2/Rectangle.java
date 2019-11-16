/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Ahsan Ghaffar
 */
public class Rectangle extends Shape implements Volume
{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    @Override
    public double Area() 
    {
          return length*width;
    }

    @Override
    public double perimeter() 
    {
       return (2*(length+width));
    }
    
    @Override
    public double volume() 
    {
        return length*width;
    }

    @Override
    public String toString() 
    {
        return ("\nArea of Rectangle is: "+Area()+"\nPerimeter of Rectangle is :"+perimeter()
                +"\nVolume of Rectangle is :"+volume());
    }
}
