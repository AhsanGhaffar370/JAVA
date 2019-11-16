/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ahsan
 */
public class Product
{
    private String code, Pname, category;
    private double qty,discount,purPrice, TpurPrice, sellPrice, profit, TsellPrice;
    private String date;

    public Product() {
    }
       
    public Product(String date, String code, String Pname, String category, String qty, String purPrice, String sellPrice, String TpurPrice) {
        this.date = date;
        this.code = code;
        this.Pname = Pname;
        this.category = category;
        this.qty = Integer.parseInt(qty);
        this.purPrice = Double.parseDouble(purPrice);
        this.sellPrice = Double.parseDouble(sellPrice);
        this.TpurPrice = Double.parseDouble(TpurPrice);
    }

    public Product(String date, String code, String Pname, String category, String qty, String purPrice, String sellPrice, String discount, String profit, String TsellPrice) {
        this.date = date;
        this.code = code;
        this.Pname = Pname;
        this.category = category;
        this.qty = Double.parseDouble(qty);
        this.purPrice = Double.parseDouble(purPrice);
        this.sellPrice = Double.parseDouble(sellPrice);
        this.discount = Double.parseDouble(discount);
        this.profit = Double.parseDouble(profit);
        this.TsellPrice = Double.parseDouble(TsellPrice);
    }

    public String getCode() {
        return code;
    }

    public String getPname() {
        return Pname;
    }

    public String getCategory() {
        return category;
    }

    public double getQty() {
        return qty;
    }

    public double getPurPrice() {
        return purPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getProfit() {
        return profit;
    }

    public double getTsellPrice() {
        return TsellPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTpurPrice() {
        return TpurPrice;
    }

    
    public String getDate() {
        return date;
    }
    
}
