/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ahsan
 */
public class Product 
{
    private String name;
    private int quantity;
    private double price;
    
    public Product(String name,int quantity,double price)
    {
        name=name;
        quantity=quantity;
        price=price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return ("Name: "+name+"\nQuantity: "+quantity+"\nPrice: "+price);
        
    }
    
    
}
