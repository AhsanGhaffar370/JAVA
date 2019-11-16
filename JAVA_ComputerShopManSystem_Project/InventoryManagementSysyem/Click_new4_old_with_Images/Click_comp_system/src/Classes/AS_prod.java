/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Account.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ahsan
 */
public class AS_prod extends Product
{
    
    
    Connection2d connection = new Connection2d();
    Connection con = connection.setConnection();
    ResultSet rst = null;
    PreparedStatement pst = null;

    public AS_prod(){
        
    }

    public AS_prod(String date, String code, String Pname, String category, String qty, String purPrice) {
        super(date, code, Pname, category, qty, purPrice);
    }

    public AS_prod(String date, String code, String Pname, String category, String qty, String purPrice, String sellPrice, String profit, String TsellPrice) {
        super(date, code, Pname, category, qty, purPrice, sellPrice, profit, TsellPrice);
    }
    
    public double TotalPur(){
        return (super.getQty()*super.getPurPrice());
    }

    //public double TotalSell(){
    //    return (super.getQty()*super.getSellPrice());
   // }
   // public double TotalProfit(){
    //    return (super.getQty()*(super.getSellPrice()-super.getPurPrice()));
    //}

    public void Add_InItem(){
               
        try{
            String sql = "Insert into Total_InRecords(Date,Code,ProductName,Stock,PerUnitPrice,TotalPrice) values (?,?,?,?,?,?)";
            String sql1 = "Insert into InCompAcc(Date,Code,ProductName,Stock,PerUnitPrice,TotalPrice) values (?,?,?,?,?,?)";
            String sql2 = "Insert into InComposing(Date,Code,ProductName,Stock,PerUnitPrice,TotalPrice) values (?,?,?,?,?,?)";
            String sql3 = "Insert into InHardware(Date,Code,ProductName,Stock,PerUnitPrice,TotalPrice) values (?,?,?,?,?,?)";
            String sql4 = "Insert into InStationary(Date,Code,ProductName,Stock,PerUnitPrice,TotalPrice) values (?,?,?,?,?,?)";
            
            PreparedStatement pst1 = null;
            pst1 = con.prepareStatement(sql);
            pst1.setString(1, super.getDate());
            pst1.setString(2, super.getCode());
            pst1.setString(3, super.getPname());
            pst1.setInt(4, super.getQty());
            pst1.setDouble(5, super.getPurPrice());
            pst1.setDouble(6, TotalPur());
            pst1.execute();
            
            if(super.getCategory().equals("Computer_Accessories"))
                pst = con.prepareStatement(sql1);
                
            else if(super.getCategory().equals("Composing"))
                pst = con.prepareStatement(sql2);
           
            else if(super.getCategory().equals("Hardware"))
                pst = con.prepareStatement(sql3);
            
            else if(super.getCategory().equals("Stationary"))
                pst = con.prepareStatement(sql4);
            
            pst.setString(1, super.getDate());
            pst.setString(2, super.getCode());
            pst.setString(3, super.getPname());
            pst.setInt(4, super.getQty());
            pst.setDouble(5, super.getPurPrice());
            pst.setDouble(6, TotalPur());
            
            pst.execute();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void Add_OutItem(){
               
        try{
            String sql = "Insert into Total_OutRecords(Date,Code,ProductName,Quantity,PurchaseUnitPrice,SellUnitPrice,Profit,TotalSellPrice) values (?,?,?,?,?,?,?,?)";
            String sql1 = "Insert into OutCompAcc(Date,Code,ProductName,Quantity,PurchaseUnitPrice,SellUnitPrice,Profit,TotalSellPrice) values (?,?,?,?,?,?,?,?)";
            String sql2 = "Insert into OutComposing(Date,Code,ProductName,Quantity,PurchaseUnitPrice,SellUnitPrice,Profit,TotalSellPrice) values (?,?,?,?,?,?,?,?)";
            String sql3 = "Insert into OutHardware(Date,Code,ProductName,Quantity,PurchaseUnitPrice,SellUnitPrice,Profit,TotalSellPrice) values (?,?,?,?,?,?,?,?)";
            String sql4 = "Insert into OutStationary(Date,Code,ProductName,Quantity,PurchaseUnitPrice,SellUnitPrice,Profit,TotalSellPrice) values (?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst1 = null;
            pst1 = con.prepareStatement(sql);
            pst1.setString(1, super.getDate());
            pst1.setString(2, super.getCode());
            pst1.setString(3, super.getPname());
            pst1.setInt(4, super.getQty());
            pst1.setDouble(5, super.getPurPrice());
            pst1.setDouble(6, super.getSellPrice());
            pst1.setDouble(7, super.getProfit());
            pst1.setDouble(8, super.getTsellPrice());
            pst1.execute();
            
            if(super.getCategory().equals("Computer_Accessories"))
                pst = con.prepareStatement(sql1);
                
            else if(super.getCategory().equals("Composing"))
                pst = con.prepareStatement(sql2);
           
            else if(super.getCategory().equals("Hardware"))
                pst = con.prepareStatement(sql3);
            
            else if(super.getCategory().equals("Stationary"))
                pst = con.prepareStatement(sql4);
            
            pst.setString(1, super.getDate());
            pst.setString(2, super.getCode());
            pst.setString(3, super.getPname());
            pst.setInt(4, super.getQty());
            pst.setDouble(5, super.getPurPrice());
            pst.setDouble(6, super.getSellPrice());
            pst.setDouble(7, super.getProfit());
            pst.setDouble(8, super.getTsellPrice());
            
            pst.execute();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void delete_InProd(String code)
    {
        PreparedStatement pst1 = null;
        try{
            String sql="Delete From Total_InRecords where Code = ?";           
            pst =con.prepareStatement(sql);
            pst.setString(1, code);
            pst.execute();
                
            String sql1="Delete From InCompAcc where Code = ?";
            String sql2="Delete From InHardware where Code = ?";
            String sql3="Delete From InComposing where Code = ?";
            String sql4="Delete From InStationary where Code = ?";

            switch (search_InCategory(code)) {
                case 1:
                    pst1 =con.prepareStatement(sql1);
                    break;
                case 2:
                    pst1 =con.prepareStatement(sql2);
                    break;
                case 3:
                    pst1 =con.prepareStatement(sql3);
                    break;
                default:
                   pst1 =con.prepareStatement(sql4);
                   break;
            }
                
            pst1.setString(1, code);
            pst1.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void delete_OutProd(String code)
    {
        PreparedStatement pst1 = null;
        try{
            String sql="Delete From Total_OutRecords where Code = ?";           
            pst =con.prepareStatement(sql);
            pst.setString(1, code);
            pst.execute();
                
            String sql1="Delete From OutCompAcc where Code = ?";
            String sql2="Delete From OutHardware where Code = ?";
            String sql3="Delete From OutComposing where Code = ?";
            String sql4="Delete From OutStationary where Code = ?";

            switch (search_OutCategory(code)) {
                case 1:
                    pst1 =con.prepareStatement(sql1);
                    break;
                case 2:
                    pst1 =con.prepareStatement(sql2);
                    break;
                case 3:
                    pst1 =con.prepareStatement(sql3);
                    break;
                default:
                   pst1 =con.prepareStatement(sql4);
                   break;
            }
                
            pst1.setString(1, code);
            pst1.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public void update_InQty(String date,String sercode, String qty)
    {
        PreparedStatement pst1 = null;
        
        try {
            String sql = "UPDATE Total_InRecords SET Date=? ,Stock =? ,TotalPrice=? WHERE Code ='"+sercode+"'";
            String sql1 = "UPDATE InCompAcc SET Date=? ,Stock =? ,TotalPrice=? WHERE Code ='"+sercode+"'";
            String sql2 = "UPDATE InHardware SET Date=? ,Stock =? ,TotalPrice=? WHERE Code ='"+sercode+"'";
            String sql3 = "UPDATE InComposing SET Date=? ,Stock =? ,TotalPrice=? WHERE Code ='"+sercode+"'";
            String sql4 = "UPDATE InStationary SET Date=? ,Stock =? ,TotalPrice=? WHERE Code ='"+sercode+"'";
            
            pst = con.prepareStatement(sql);
            pst.setString(1,date);
            pst.setString(2,qty);
            pst.setDouble(3,TotalPur());
            pst.executeUpdate();
            pst.close();
            /*this is a make shift way of update qty :
            String sql = "update Total_InRecords set Date ='"+date+"' ,Stock ='"+qty+"' ,TotalPrice='"+String.valueOf(TotalPur())+"' where Code ='"+code+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            */
            switch (search_InCategory(sercode)) {
                case 1:
                    pst1 =con.prepareStatement(sql1);
                    break;
                case 2:
                    pst1 =con.prepareStatement(sql2);
                    break;
                case 3:
                    pst1 =con.prepareStatement(sql3);
                    break;
                default:
                   pst1 =con.prepareStatement(sql4);
                   break;
            }
            pst1.setString(1,date);
            pst1.setString(2,qty);
            pst1.setDouble(3,TotalPur());
            pst1.executeUpdate();
            pst1.close();
            
        }catch(HeadlessException | SQLException sqlEx){
               JOptionPane.showMessageDialog(null,"Not update Records");
        }      
    }
    public void update_OutQty(String date,String sercode, String qty, String profit, String Tsell)
    { 
        PreparedStatement pst1 = null;
        
        try {
            String sql  = "UPDATE Total_OutRecords SET Date =?, Quantity =?, Profit =?, TotalSellPrice=? WHERE Code ='"+sercode+"'";
            String sql1 = "UPDATE OutCompAcc SET Date =?, Quantity =?, Profit =?, TotalSellPrice=? WHERE Code ='"+sercode+"'";
            String sql2 = "UPDATE OutHardware SET Date =?, Quantity =?, Profit =?, TotalSellPrice=? WHERE Code ='"+sercode+"'";
            String sql3 = "UPDATE OutComposing SET Date =?, Quantity =?, Profit =?, TotalSellPrice=? WHERE Code ='"+sercode+"'";
            String sql4 = "UPDATE OutStationary SET Date =?, Quantity =?, Profit =?, TotalSellPrice=? WHERE Code ='"+sercode+"'";
            
            pst = con.prepareStatement(sql);
            pst.setString(1,date);
            pst.setString(2,qty);
            pst.setString(3,profit);
            pst.setString(4,Tsell);
            pst.executeUpdate();
            pst.close();
 
            switch (search_OutCategory(sercode)) {
                case 1:
                    pst1 =con.prepareStatement(sql1);
                    break;
                case 2:
                    pst1 =con.prepareStatement(sql2);
                    break;
                case 3:
                    pst1 =con.prepareStatement(sql3);
                    break;
                default:
                   pst1 =con.prepareStatement(sql4);
                   break;
            }
            pst1.setString(1,date);
            pst1.setString(2,qty);
            pst1.setString(3,profit);
            pst1.setString(4,Tsell);
            pst1.executeUpdate();
            pst1.close();
            
        }catch(HeadlessException | SQLException sqlEx){
               JOptionPane.showMessageDialog(null,"Not update Records");
        }      
    }
    /*
    public void updateBooking(String ID)
    {
         Connection con = conn.setConnection();    
     PreparedStatement pst =null;
     ResultSet rs =null;
     try {
  
    String sql = "UPDATE Bookings SET FirstName = ?,LastName=?,Gender=?,Cnic=?,Date=?,Pick_Up_Date=?,DepartureTime=?,No_of_days=?,Contact=?,Address=?,City=?,Email=?,Pincode=?,CarType=? WHERE ID = '"+ID+"'";
    pst = con.prepareStatement(sql);
            pst.setString(1,super.getFirstName());
            pst.setString(2, super.getLastName());
            pst.setString(3, super.getGender());
            pst.setString(4, super.getCnic());
           
            pst.setString(5, getDate());
            pst.setString(6,getPickupDate());
            pst.setString(7,getDepartureTime());
            pst.setInt(8,getNo_Of_days());
            pst.setString(9,super.getContact());
            pst.setString(10,super.getAddress());
            pst.setString(11,super.getCity());
            pst.setString(12,super.getEmail_Id());
            pst.setString(13,super.getPincode());
            pst.setString(14, getCarType());
            
            
            JOptionPane.showMessageDialog(null,"Successfull");
            pst.executeUpdate();
            pst.close();
        }
        catch(Exception sqlEx){
           JOptionPane.showMessageDialog(null,"Not update");
    }      
     }*/

    //This method is especially used to find the category  
    public int search_InCategory(String code){
        int found =0;
        
        ResultSet rst1 = null;
        ResultSet rst2 = null;
        ResultSet rst3 = null;
        ResultSet rst4 = null;
  
        try{
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM InCompAcc where Code ='"+code+"'";  
            String sq2 = "SELECT * FROM InHardware where Code ='"+code+"'";
            String sq3 = "SELECT * FROM InComposing where Code ='"+code+"'";
            String sq4 = "SELECT * FROM InStationary where Code ='"+code+"'";
            
            rst1 = st.executeQuery(sql);
            rst2 = st.executeQuery(sq2);
            rst3 = st.executeQuery(sq3);
            rst4 = st.executeQuery(sq4);
            
            while(rst1.next()){
                String c = rst1.getString("Code"); 
                if(code.equals(c))
                    found = 1;
            }
            while(rst2.next()){
                String c = rst2.getString("Code"); 
                if(code.equals(c))
                    found = 2;
            }
            while(rst3.next()){
                String c = rst3.getString("Code"); 
                if(code.equals(c))
                    found = 3;
            }
            while(rst3.next()){
                String c = rst3.getString("Code"); 
                if(code.equals(c))
                    found = 3;
            }
            while(rst4.next()){
                String c = rst4.getString("Code"); 
                if(code.equals(c))
                    found = 4;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    //This method is especially used to find the category  
    public int search_OutCategory(String code){
        int found =0;
        
        ResultSet rst1 = null;
        ResultSet rst2 = null;
        ResultSet rst3 = null;
        ResultSet rst4 = null;
  
        try{
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM OutCompAcc where Code ='"+code+"'";  
            String sq2 = "SELECT * FROM OutHardware where Code ='"+code+"'";
            String sq3 = "SELECT * FROM OutComposing where Code ='"+code+"'";
            String sq4 = "SELECT * FROM OutStationary where Code ='"+code+"'";
            
            rst1 = st.executeQuery(sql);
            rst2 = st.executeQuery(sq2);
            rst3 = st.executeQuery(sq3);
            rst4 = st.executeQuery(sq4);
            
            while(rst1.next()){
                String c = rst1.getString("Code"); 
                if(code.equals(c))
                    found = 1;
            }
            while(rst2.next()){
                String c = rst2.getString("Code"); 
                if(code.equals(c))
                    found = 2;
            }
            while(rst3.next()){
                String c = rst3.getString("Code"); 
                if(code.equals(c))
                    found = 3;
            }
            while(rst3.next()){
                String c = rst3.getString("Code"); 
                if(code.equals(c))
                    found = 3;
            }
            while(rst4.next()){
                String c = rst4.getString("Code"); 
                if(code.equals(c))
                    found = 4;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    public boolean search_InCode(String code){
        boolean found =false;
  
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Total_InRecords where Code ='"+code+"'";   
            rst = st.executeQuery(sql);
            
            while(rst.next()){
                String c = rst.getString("Code");
                
                if(code.equals(c))
                    found = true;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
        public boolean search_OutCode(String code){
        boolean found =false;
  
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Total_OutRecords where Code ='"+code+"'";   
            rst = st.executeQuery(sql);
            
            while(rst.next()){
                String c = rst.getString("Code");
                
                if(code.equals(c))
                    found = true;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    public boolean search_InDate(String date){
        boolean found =false;
  
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Total_InRecords where Date ='"+date+"'";   
            rst = st.executeQuery(sql);
            
            while(rst.next()){
                String c = rst.getString("Date");
                
                if(date.equals(c))
                    found = true;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    public boolean search_InProd(String prod){
        boolean found =false;
  
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Total_InRecords where ProductName ='"+prod+"'";   
            rst = st.executeQuery(sql);
            
            while(rst.next()){
                String p = rst.getString("ProductName");
                
                if(prod.equals(p) )
                    found = true;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    public boolean search_OutProd(String prod){
        boolean found =false;
  
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Total_OutRecords where ProductName ='"+prod+"'";   
            rst = st.executeQuery(sql);
            
            while(rst.next()){
                String p = rst.getString("ProductName");
                
                if(prod.equals(p) )
                    found = true;
            }
        
        }catch(Exception sqlEx){
            System.out.println(sqlEx);
        }     
        return found;
    }
    
    public void set1(JTextField date,JTextField code,JTextField prod,JTextField stock,JTextField perPrice,String serCode,String serProd){

        try{
            Statement st=con.createStatement();
            String Sql="Select [Date],[Code],[ProductName],[Stock],[PerUnitPrice] from Total_InRecords where Code = '"+serCode+"'";
            String Sq2="Select [Date],[Code],[ProductName],[Stock],[PerUnitPrice] from Total_InRecords where ProductName = '"+serProd+"'";
            
            if(!serCode.equals("") && !serProd.equals(""))
                JOptionPane.showMessageDialog(null, "Please RESET Frame before Search Again","Error",JOptionPane.ERROR_MESSAGE);
            
            else if(!serCode.equals(""))
                rst = st.executeQuery(Sql);
            
            else if(!serProd.equals(""))
                rst = st.executeQuery(Sq2);
            
            while (rst.next()){
                String add=rst.getString("Date");
                date.setText(add);
                String add1=rst.getString("Code");
                code.setText(add1);
                String add2=rst.getString("ProductName");
                prod.setText(add2);
                String add3 =rst.getString("Stock");
                stock.setText(add3);
                String add4=rst.getString("PerUnitPrice");
                perPrice.setText(add4);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Id");
        }
    }
    
    public void set(JTextField date,JTextField code,JTextField prod,JTextField stock,JTextField perPrice,String serCode){

        try{
            Statement st=con.createStatement();
            String Sql="Select [Date],[Code],[ProductName],[Stock],[PerUnitPrice] from Total_InRecords where Code = '"+serCode+"'";
            String Sq2="Select [Date],[Code],[ProductName],[Stock],[PerUnitPrice] from Total_InRecords where ProductName = '"+serCode+"'";
            
            if(search_InCode(serCode)==true){
                rst = st.executeQuery(Sql);
            }
            else if(search_InProd(serCode)==true){
                rst = st.executeQuery(Sq2);;
            }
            
            while (rst.next()){
                String add=rst.getString("Date");
                date.setText(add);
                String add1=rst.getString("Code");
                code.setText(add1);
                String add2=rst.getString("ProductName");
                prod.setText(add2);
                String add3 =rst.getString("Stock");
                stock.setText(add3);
                String add4=rst.getString("PerUnitPrice");
                perPrice.setText(add4);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Id");
        }
    }
       
    public void fetch_out(JTextField quant, JTextField tsell, String serCode){
        try{
            Statement st=con.createStatement();
            String Sql="Select [Quantity],[TotalSellPrice] from Total_OutRecords where Code = '"+serCode+"'";
            rst = st.executeQuery(Sql);
            while (rst.next() == true){
                String add=rst.getString("Quantity");
                quant.setText(add);
                String add2=rst.getString("TotalSellPrice");
                tsell.setText(add2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Code");
        }
    }
        
    public void Get_InCdata(JTable table,String serCode){ 
        try{
            String sql="select * from Total_InRecords where Code = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, serCode);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Get_OutCdata(JTable table,String serCode){ 
        try{
            String sql="select * from Total_OutRecords where Code = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, serCode);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Get_InDdata(JTable table,String serDate){ 
        try{
            String sql="select * from Total_InRecords where Date = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, serDate);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Get_InDateDiff_Data(JTable table,String minD, String maxD){ 
        try{
            String sql="select * from Total_InRecords where Date between '"+minD+"' and '"+maxD+"' order by Date desc";
            pst=con.prepareStatement(sql);
           // pst.setString(1, minD);
            //pst.setString(2, maxD);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
    public void Get_InPdata(JTable table,String serProd){ 
        try{
            String sql="select * from Total_InRecords where ProductName = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, serProd);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Get_OutPdata(JTable table,String serProd){ 
        try{
            String sql="select * from Total_OutRecords where ProductName = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1, serProd);
            rst= pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Disp_InRecord(JTable tab, String cat)
    {
        try{
/*          we can also use this method to display records:
            String sql1 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InCompAcc"; 
            String sql2 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InComposing"; 
            String sql3 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InHardware"; 
            String sql4 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InStationary"; 
            String sql5 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from Total_InRecords"; */
            
            String sql ="select * from Total_InRecords order by Date desc";
            String sql1 ="select * from InCompAcc order by Date desc"; 
            String sql2 ="select * from InHardware order by Date desc"; 
            String sql3 ="select * from InComposing order by Date desc"; 
            String sql4 ="select * from InStationary order by Date desc"; 
             
            if(cat.equals("Total_Record"))
                pst=con.prepareStatement(sql);
            
            if(cat.equals("Computer_Accessories"))
                pst=con.prepareStatement(sql1);

            if(cat.equals("Hardware"))
                pst=con.prepareStatement(sql2);

            if(cat.equals("Composing"))
                pst=con.prepareStatement(sql3);

            if(cat.equals("Stationary"))
                pst=con.prepareStatement(sql4);
            
            //pst.setString(1, cat);
            rst=pst.executeQuery();
            tab.setModel(DbUtils.resultSetToTableModel(rst));
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Disp_OutRecord(JTable tab, String cat)
    {
        try{
/*          we can also use this method to display records:
            String sql1 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InCompAcc"; 
            String sql2 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InComposing"; 
            String sql3 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InHardware"; 
            String sql4 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from InStationary"; 
            String sql5 ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from Total_InRecords"; */
            
            String sql ="select * from Total_OutRecords order by Date desc";
            String sql1 ="select * from OutCompAcc order by Date desc"; 
            String sql2 ="select * from OutHardware order by Date desc"; 
            String sql3 ="select * from OutComposing order by Date desc"; 
            String sql4 ="select * from OutStationary order by Date desc"; 
             
            if(cat.equals("Total_Record"))
                pst=con.prepareStatement(sql);
            
            if(cat.equals("Computer_Accessories"))
                pst=con.prepareStatement(sql1);

            if(cat.equals("Hardware"))
                pst=con.prepareStatement(sql2);

            if(cat.equals("Composing"))
                pst=con.prepareStatement(sql3);

            if(cat.equals("Stationary"))
                pst=con.prepareStatement(sql4);
            
            //pst.setString(1, cat);
            rst=pst.executeQuery();
            tab.setModel(DbUtils.resultSetToTableModel(rst));
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void InReset(JTable table){        
        try{
            //String sql ="select Date as [Date], Code as [Code],ProductName as [ProductName],Stock as [Stock],PerUnitPrice as [PerUnitPrice],TotalPrice as [TotalPrice] from Total_InRecords";
            String sql="select * from Total_InRecords order by Date desc";
            
            pst = con.prepareStatement(sql);
            rst=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void OutReset(JTable table){        
        try{
            String sql="select * from Total_InRecords order by Date desc";
            
            pst = con.prepareStatement(sql);
            rst=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rst));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
