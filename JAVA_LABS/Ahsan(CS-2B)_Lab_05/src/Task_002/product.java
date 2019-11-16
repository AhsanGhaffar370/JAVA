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
public class product 
{
    private String name;
    private int qty;
    private double price;

    public product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    } 

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
    
}
