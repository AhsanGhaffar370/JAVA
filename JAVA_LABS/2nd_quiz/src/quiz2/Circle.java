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
public class Circle extends Shape
{
    public static final double PI=2.12;
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double Area()
    {
        double area=PI*radius*radius;
        
        return area;
           
    }

    @Override
    public double perimeter() 
    {
        double per=2*PI*radius;
        
        return per;
          
    }

    @Override
    public String toString() 
    {
        return ("\nThe area of Circle is: "+Area()+"\nThe Perimeter of Circle is: "+perimeter());
    }
    
    
}
