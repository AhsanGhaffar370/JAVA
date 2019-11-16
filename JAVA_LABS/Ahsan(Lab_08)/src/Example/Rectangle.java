/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author fall2017
 */
public class Rectangle extends Shape
{
    private double length;
private double width;
public Rectangle(double length, double width){
this.length = length;
this.width = width;
}
public double area(){
return length * width;
}
public double perimeter(){
return 2*(length+width);
}
public double getLength(){
return length;
}
public double getWidth(){
return width;
}
}
