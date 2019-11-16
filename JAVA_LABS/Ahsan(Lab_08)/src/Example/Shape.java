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
public abstract class Shape 
{
    public String name(){
return getClass().getName();
}
public abstract double area();
public abstract double perimeter();
public String toString() {
return "\n" + name() + "\nArea="+area()+
"\nPerimeter="+perimeter();
}
}
