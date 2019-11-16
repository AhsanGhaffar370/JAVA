package Task_02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Product 
{
    private String name;
    
    private int quantity;
    
    private double price;
    
    public Product(String name,int quant,double price)
    {
       this.name=name;
       quantity=quant;
       this.price=price;
    }
    
    public String getName()
    {
      return name;
    }

}
