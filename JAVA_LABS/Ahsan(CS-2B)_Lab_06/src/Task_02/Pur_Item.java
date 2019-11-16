/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_02;

/**
 *
 * @author Ahsan
 */
public class Pur_Item
{
    private String name;
    private double unitprice;

    public Pur_Item(String name, double unitprice) {
        this.name = name;
        this.unitprice = unitprice;
    }

    public Pur_Item() {
        this.name="no item";
        this.unitprice=0;
    }

    public double getprice(){
        return unitprice;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    
    public String toString(){
        return ("\n"+getName()+" @ "+getUnitprice());
    }

}
