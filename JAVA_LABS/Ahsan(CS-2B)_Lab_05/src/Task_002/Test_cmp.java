/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_002;

/**
 *
 * @author Ahsan
 */
import java.util.Scanner;
public class Test_cmp 
{
    public static void main(String args[])
    {
        product p1 = new product("TV",4,34000); 
        product p2 = new product("Bicycle", 4, 5500); 
        product p3 = new product("Fridge", 3,70000); 
        store s1 = new store("Makro", "Karachi"); 
        store s2 = new store("Hypermart","Karachi"); 
        s1.addproduct(p1);
        s1.addproduct(p2); 
        s1.addproduct(p3); 
        s1.displayall(); 
        
        boolean flag;
        flag=s1.searchP("Bicycle");
        
        System.out.println("xxxxxxx-----------------------xxxxxxxx");
        
        if (flag==true) 
            System.out.println("Product found"); 
        
        else 
            System.out.println("There is no product of this name"); 
        
        System.out.println("xxxxxxx-----------------------xxxxxxxx");
        
        product tempProduct = s1.deleteprod("Fridge"); 
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        if (tempProduct!=null) 
            System.out.println("Product "+tempProduct.getName()+ " is deleted"); 
        
        else if(tempProduct==null)
            System.out.println("There is no product to delete"); 
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        s1.displayall(); 
        s2.addproduct(p1); 
        s2.addproduct(p2); 
        s2.addproduct(p3); 
        s2.displayall(); 
        
        comp c1 = new comp("Unilever"); 
        
        c1.addstore(s1); 
        c1.addstore(s2); 
        c1.dispall(); 
        
        int n= c1.ser_nbstore("TV");
        
        System.out.println("Number of stores have TV "+n);
    }
    
}
