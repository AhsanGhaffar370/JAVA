package Task_02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ahsan
 */
public class TestCompany 
{
    public static void main(String [] args)
    { 
        Product p1 = new Product("TV",4,34000); 
        
        Product p2 = new Product("Bicycle", 4, 5500); 
        
        Product p3 = new Product("Fridge", 3,70000); 
        
        Store s1= new Store("Makro" , "Karachi"); 
        
        Store s2= new Store("Hypermart","Karachi"); 
     
        p1.toString();
        
        //System.out.println(p1);
        
        s1.addproduct(p1); 
        
        s1.addproduct(p2); 
        
        s1.addproduct(p3);
        
        s1.displayall(); 
       
        Product temp = s1.deleteProduct("TV"); 
        
        if (temp!=null) 
            System.out.println("Product "+temp.getName()+ " is deleted"); 
        
        else 
            System.out.println("There is no product to delete");
        
        s1.displayall(); 
        
        //s2.addproduct(p1); 
        
        s2.addproduct(p2); 
        
        s2.addproduct(p3); 
        
        s2.displayall(); Company c1 = new Company("Unilever"); 
        
        c1.addstore(s1); 
        
        c1.addstore(s2); 
        
        c1.displayall(); 
        
        int n= c1.searchnbstore("TV"); 
        
        System.out.println("Number of stores have TV "+n); 
    }

}
