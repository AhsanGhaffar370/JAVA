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
public class CountedItem extends Pur_Item
{
    private int quant;

    public CountedItem(int quant, String name, double unitprice) {
        super(name, unitprice);
        this.quant = quant;
    }

    public CountedItem(int quant) {
        this.quant = quant;
    }
    
    
    
}
