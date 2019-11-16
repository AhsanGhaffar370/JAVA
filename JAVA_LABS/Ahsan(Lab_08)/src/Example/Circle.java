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
public class Circle extends Shape
{
    private double radius;
public Circle(double r){
radius = r;

}
public double area(){
return Math.PI * (radius * radius);
}
public double perimeter(){
return 2.0 * Math.PI * radius;
}
public double getRadius(){
return radius;
}
}
