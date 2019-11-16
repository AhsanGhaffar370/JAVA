package Classes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Faraz
 */
public class AdminLogin {

    Connection2d conn = new Connection2d();

    public boolean match(String user, String pass){
        boolean successful =false;
        try {
              
            Connection con = conn.setConnection();  
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM Login where UserName = '"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String userName = rs.getString("UserName");
                String password = rs.getString("Password");
                
                if(user.equals(userName) && pass.equals(password))
                    successful = true;
                else
                    successful = false;
            }
            con.close();
        }
        catch(Exception sqlEx){
                    System.out.println(sqlEx);
        }     
        return successful;
    }
    public void ChangePassword(String UserName,String OldPassw,String NewPass,String ConfirmPass) {                                                  
        try{
         String Newpass=String.valueOf(NewPass);
         String ConfPass=String.valueOf(ConfirmPass);
        String OldPass=String.valueOf(OldPassw);
        String uName=UserName;
        if (Newpass.length()< 5) {
            ImageIcon icon=new ImageIcon("war4.png");
            JOptionPane.showMessageDialog(null,"The New PAssword Should be Atleaset Of 5 Characters ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
            return;
        }
        
        else if (!(Newpass).equals(ConfPass)) {
            ImageIcon icon=new ImageIcon("war4.png");
            JOptionPane.showMessageDialog(null,"Confirm Password doesn't match with New Password ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
            return;
            }

    Connection con =conn.setConnection();
            PreparedStatement pst =null;
            ResultSet rs=null;
    String sql= "select UserName,Password from Login where UserName='" + UserName + "' and Password= '" + OldPassw + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("UserName").trim();
            String passwd = rs.getString("Password").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=conn.setConnection();
                 String sql1= "update Login set Password= '" + Newpass + "' where UserName= '" + uName + "' and Password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 ImageIcon icon=new ImageIcon("right.png");
                        JOptionPane.showMessageDialog(null,"Password Changed Successfully ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);

                 return;
              }
            else
            {
             ImageIcon icon=new ImageIcon("war4.png");
            JOptionPane.showMessageDialog(null,"Invalid Username Or Password ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
            UserName="";
             OldPassw="";
             NewPass="";
             ConfirmPass="";
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(null,ex); 
        }
    }
}
