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
public class ShapeArray
{
    private Shape shapeList[];
    private int nbShape=0;
    
    public ShapeArray(int size)
    {
        shapeList=new Shape[size];
    }
    
    public boolean addShape(Shape s)
    {
        if (nbShape>shapeList.length-1)
        {
            return false;
        }
        else
        {
            shapeList[nbShape]=s;
            nbShape++;
            return true;
        }
    }
    
        
    public String disprecinfo()
    {
               String s = "";
        for(int i=0;i<shapeList.length;i++)
        {
            if(shapeList[i] instanceof rectangle)
            {
                s+=shapeList[i] + "\n";
            }
        }
        return s;
    }
        
    public int getCircleCounter()
    {
        int count=0;
        for(int i=0;i<shapeList.length;i++)
        {
            if(shapeList[i] instanceof Circle)
            {
                count++;
            }
            
        }
        return count;
    }
    
    public double getAvgshapeArea()
    {
        double sumofarea=0;
        for(int i=0;i<shapeList.length;i++)
        {
            if(shapeList[i] instanceof rectangle)
            {
                rectangle temprect=(rectangle)shapeList[i];
                sumofarea+=temprect.getWidth()*temprect.getWidth();
            }
            else{
                Circle c=(Circle)shapeList[i];
                sumofarea+=(3.142)*(c.getRadius() *c.getRadius());
            }
        }
        double avg=sumofarea/nbShape;
        return avg;
    }
    
    public void removeAllRect()
    {
        for(int i=0;i<0;i++)
        {
            if(shapeList[i] instanceof rectangle)
            {
                shapeList[i]=null;
            }
        }
    }
    
    public String toString()
    {
         return ("number of shapes :" + nbShape + "Circles: " + getCircleCounter() + "Rectangles: " + 
                (nbShape-getCircleCounter()) + "Average Area of all shapes: " + getAvgshapeArea());
                
    }
}
