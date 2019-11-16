/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.util.Random;

/**
 *
 * @author fall2017
 */
public class TestShapes 
{
    public static Shape[] createShape() {
final int SIZE = 5;
final double DIMENSION = 100;
final int NUMBEROFSHAPES = 3;
Random generator = new Random();

//create an array having b/w 1 and SIZE entries
Shape[] randomShapes = new Shape[generator.nextInt(SIZE) + 1];
for(int i = 0; i <randomShapes.length; i++)
{
//randomly generate values b/w 0 and NUMBEROFSHAPES - 1
int assigner = generator.nextInt(NUMBEROFSHAPES);
switch(assigner) {
case 0: randomShapes[i] =
new Rectangle(generator.nextDouble()*DIMENSION,
generator.nextDouble()*DIMENSION);

break;

case 1: randomShapes[i] =
new Circle(generator.nextDouble()*DIMENSION);

break;

case 2: randomShapes[i] =
new Square(generator.nextDouble()*DIMENSION);

break;
}
}
return randomShapes;
}
public static void main(String[] args) {
Shape[] randomShapes = TestShapes.createShape();
for(int i = 0; i <randomShapes.length; i++)
System.out.println(randomShapes[i]);

}
}
