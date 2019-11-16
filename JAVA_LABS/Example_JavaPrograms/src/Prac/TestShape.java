/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prac;

import java.util.Scanner;

/**
 *
 * @author Ahsan
 */
public class TestShape 
{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int i; 
        char x;
        ShapeArray s=new ShapeArray(20);
        do
        {
            System.out.println("1. add new shape\n" +
            "2. display all rectangles\n" +
            "3. display the average shapes area\n" +
            "4. display the number of circles\n" +
            "5. remove all rectangles\n" +
            "6. exit");
            System.out.println("input number");
           i=cin.nextInt(); 
           if(i==1)
           {
               System.out.println("a. for rectangle (ask for details)\n" +
                "b. for circle (ask for details) ");
               do { 
                   System.out.println("a for rectangle, b for circle, any character except a or b will result in termination");
                   x=cin.next().charAt(0);
                   if(x=='a')
                   {
                       int px=0, py=0, l=0, w=0;
                       System.out.println("Please enter the x,y points, the length and the width of the Rectangle:");
                       px = cin.nextInt();
                       py = cin.nextInt();
                       l = cin.nextInt();
                       w = cin.nextInt();
                      // s.addShape(new rectangle(px, py, l, w));
                       System.out.println("4 values");
                   }
                   if(x=='b')
                   {
                       int px, py, rad;
                       System.out.println("Please enter the x, y points and the radius of the Circle:");
                       px = cin.nextInt();
                       py = cin.nextInt();
                       rad = cin.nextInt();
                     //  s.addShape(new Circle(px, py, rad));
                   }
               } while (x=='a'||x=='b');
           }
           if(i==2)
           {
               s.disprecinfo();
           }
           if(i==3)
           {
               s.getAvgshapeArea();
           }
           if(i==4)
           {
               s.getCircleCounter();
           }
           if(i==5)
           {
               s.removeAllRect();
           }
           if(i==6)
           {
               System.out.println("program terminated");
           }
        }
        while(i>=1 && i<6);   
    }
}
