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
public class WeightedItem extends Pur_Item
{
    private double weight;

    public WeightedItem(double weight, String name, double unitprice) {
        super(name, unitprice);
        this.weight = weight;
    }

    public WeightedItem(double weight) {
        this.weight = weight;
    }

    @Override
    public double getprice() {
        return super.getprice(); //To change body of generated methods, choose Tools | Templates.
    }

}
