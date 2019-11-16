/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Test_01 
{
    public static void main(String args[])
    {
        //create an Object of a Class Car:
        Car obj=new Car();
        //Car obj1=new Car();

        //obj.get_bname();
        
        //call Output method from class Car:
        obj.Output();
   
        //obj.input();
        
        //Call Update milage method then Update the car milage by passing the value:
        obj.Update_milage(10000);
        
        //Again call output mthod :
        obj.Output();

    }
   
}
