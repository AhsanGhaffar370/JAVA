/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan Ghaffar
 */
import java.util.Scanner;
public class GetterSetter
{
    public static void main(String args[])
    {
        
        Scanner cin=new Scanner(System.in);
        //Call Student class in this class:
        //mark is object or instance:
        Student marks=new Student("ahsanrao","alpha","geo");
        
        //Default constructor:
        construct obj=new construct();
        obj.display();
        
        //Parameterized Constructors:
        construct obje=new construct(10,2);
        obje.display();
        
        //Array of Object:
        Student object[]=new Student[3];
        String name1;
        
        for(int i=0;i<object.length;i++)
        {
            System.out.println("Enter the student name:");
            name1=cin.nextLine();
            object[i]=new Student("ahsanrao","alpha","geo");
            //object[i].setName(name1);
        }
        
        for(int i=0;i<object.length;i++)
        {
            System.out.println("Student"+i+object[i].getName());
        }
         
        /*
          we dont use mark.id method in replace
          we use getter and setter method and this 
          method is called encapsulation of a variable:
        */
//        marks.id=1;
//        marks.age=20;
//        marks.clas=9;
//        marks.name="Ahsan";

//        marks.setId(cin.nextInt());
//        marks.setAge(14);
//        marks.setClas(5);
//        marks.setName("Ahsan");
//        
//        System.out.println(marks.getName()+" ID is ["+marks.getId()+"]. He read in class "
//                           +marks.getClas()+" & he is "+marks.getAge()+" years of age");
    }
}
