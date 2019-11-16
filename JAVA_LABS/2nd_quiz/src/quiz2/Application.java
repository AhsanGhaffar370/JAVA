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
public class Application 
{
    public static void main(String[] args) 
    {
        Shape[]shapelist=new Shape[6];
          
        for(int i=0;i<3;i++)
        {
            shapelist[i]=new Circle(2.32);
            System.out.println(shapelist[i]);
        }
        
        for(int i=3;i<6;i++)
        {
            shapelist[i]=new Box(2.32,2.3,4.2);
            System.out.println(shapelist[i]);
        }
               
        Volume[]volumelist=new Volume[3];
        
        for(int i=0;i<3;i++)
        {
            volumelist[i]=new Box(2.3,7.54,4.56);
            System.out.println(volumelist[i]);
            
        }

    }
}
