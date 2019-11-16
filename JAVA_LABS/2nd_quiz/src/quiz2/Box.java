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
public class Box extends Shape implements Volume
{

    private double length,width,height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double Area() 
    {
        return (2*((length*width)+(width*height)+(height*length)));
    }

    @Override
    public double perimeter() 
    {
       return (4*(length+width+height)); 
    }

      @Override
    public double volume() 
    {
       return (length*width); 
        
    }
    
    @Override
    public String toString() 
    {
        return ("\nThe area of Box: "+Area()+"\nThe Perimeter of Box is :"+perimeter()+"\nThe Volume of Box is :"+volume());
    }
}
