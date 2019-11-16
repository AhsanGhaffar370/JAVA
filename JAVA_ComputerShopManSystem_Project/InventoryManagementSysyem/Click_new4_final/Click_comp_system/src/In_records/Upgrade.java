/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_records;

import Account.Connection2d;
import Classes.AS_prod;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Ahsan
 */
public class Upgrade extends javax.swing.JFrame {

    /**
     * Creates new form Rec_Harware
     */
    public Upgrade() {
        initComponents();
        
        setCentre();
        
        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);
    }

    private void setCentre(){
        //to set the jframe on centre:
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim= new Dimension(tool.getScreenSize());
        int height=(int)dim.getHeight();
        int width=(int)dim.getWidth();
        setLocation(width/ 2-getWidth() / 2,height / 2-getHeight() /2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        t_prod = new javax.swing.JTextField();
        b_upgrade = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t_code = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_purUP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_stock = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        t_UpDate = new com.toedter.calendar.JDateChooser();
        b_cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t_serCode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t_serProd = new javax.swing.JTextField();
        b_serProd = new javax.swing.JButton();
        b_serCode = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_rec = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t_inDateUg = new com.toedter.calendar.JDateChooser();
        cb_cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_qtyUg = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        cb_caty = new javax.swing.JComboBox<>();
        l_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, 30));

        t_prod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_prodActionPerformed(evt);
            }
        });
        getContentPane().add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 190, 30));

        b_upgrade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_upgrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser44.png"))); // NOI18N
        b_upgrade.setText("Upgrade");
        b_upgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_upgradeActionPerformed(evt);
            }
        });
        getContentPane().add(b_upgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Code");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 30));

        t_code.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Last Updated Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Per Unit Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 30));

        t_purUP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 190, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Stock");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 30));

        t_stock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_stockActionPerformed(evt);
            }
        });
        getContentPane().add(t_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/up3.png"))); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 120, 40));

        t_UpDate.setDateFormatString("d-MM-yyyy");
        getContentPane().add(t_UpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, 30));

        b_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upgrade5.png"))); // NOI18N
        b_cancel.setText("CANCEL");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Code");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 40, 30));

        t_serCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t_serCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_serCodeKeyPressed(evt);
            }
        });
        getContentPane().add(t_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Product");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 60, 30));

        t_serProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_serProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 160, 30));

        b_serProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_serProd.setText("Search");
        b_serProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_serProdActionPerformed(evt);
            }
        });
        getContentPane().add(b_serProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, -1, 30));

        b_serCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_serCode.setText("Search");
        b_serCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_serCodeActionPerformed(evt);
            }
        });
        b_serCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_serCodeKeyPressed(evt);
            }
        });
        getContentPane().add(b_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Add Quantity");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, 30));

        tab_rec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tab_rec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_recMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_rec);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 140, 680, 370));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setText("Update Options");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, 30));

        t_inDateUg.setDateFormatString("d-MM-yyyy");
        getContentPane().add(t_inDateUg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 190, 30));

        cb_cat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 NULL", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        getContentPane().add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel4.setText("Search Result");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        t_qtyUg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_qtyUgKeyTyped(evt);
            }
        });
        getContentPane().add(t_qtyUg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 190, 30));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upgrade Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 36), new java.awt.Color(149, 180, 112))); // NOI18N

        cb_caty.setBackground(new java.awt.Color(87, 150, 176));
        cb_caty.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        cb_caty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total_Record", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        cb_caty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_catyMouseClicked(evt);
            }
        });
        cb_caty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_catyActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cb_caty);
        cb_caty.setBounds(440, 10, 250, 40);

        l_title.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        l_title.setForeground(new java.awt.Color(23, 162, 186));
        jDesktopPane1.add(l_title);
        l_title.setBounds(420, 80, 360, 50);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_upgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_upgradeActionPerformed
        // TODO add your handling code here:
        try{
            if(t_purUP.getText().equals("") || t_UpDate.getDateFormatString().equals("") || 
               t_inDateUg.getDateFormatString().equals("") || t_code.getText().equals("") || 
               t_prod.getText().equals("") || t_qtyUg.getText().equals("") || 
               t_stock.getText().equals("") )
            {
                JOptionPane.showMessageDialog(null, "Please input all  detail");
            }
            
            else
            {
                int one=Integer.parseInt(t_stock.getText());
                int two=Integer.parseInt(t_qtyUg.getText());
                String Updatedqty=String.valueOf(one+two);
                String cat=(String)cb_cat.getSelectedItem();
                String d=((JTextField)t_inDateUg.getDateEditor().getUiComponent()).getText();
                
                
                
                int P = JOptionPane.showConfirmDialog(null," Are you sure want to Upgrade ?","Confirmation",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {   
                    AS_prod as=new AS_prod(d, t_code.getText(), t_prod.getText(), cat, Updatedqty, t_purUP.getText());
                    as.update_InQty(d,t_code.getText(), Updatedqty);
                    
                    JOptionPane.showMessageDialog(null, "Succesfully Updated","Records",JOptionPane.INFORMATION_MESSAGE);
                
                    cb_caty.setSelectedItem("Total_Record");
                    as.InReset(tab_rec);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not Updated", "Error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_b_upgradeActionPerformed

    private void t_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_stockActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);

        cb_cat.setSelectedItem("                 NULL");
        t_serCode.setText("");
        t_serProd.setText("");
        t_code.setText("");
        t_prod.setText("");
        t_stock.setText("");
        t_purUP.setText("");
        t_qtyUg.setText("");
        t_UpDate.setCalendar(null);
        t_inDateUg.setCalendar(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cancelActionPerformed

    private void b_serProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serProdActionPerformed
        
        AS_prod ser=new AS_prod();

        if(ser.search_InProd(t_serProd.getText())==true){
            ser.Get_InPdata(tab_rec, t_serProd.getText());
            
            //ser.set((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP,t_serCode.getText(),t_serProd.getText());

            switch (ser.search_InCategory(t_code.getText())) {
                case 1:
                    cb_cat.setSelectedItem("Computer_Accessories");
                    break;
                case 2:
                    cb_cat.setSelectedItem("Hardware");
                    break;
                case 3:
                    cb_cat.setSelectedItem("Composing");
                    break;
                default:
                    cb_cat.setSelectedItem("Stationary");
                    break;
            }
        }
            
        else
            JOptionPane.showMessageDialog(null, "Invalid ID","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_b_serProdActionPerformed

    private void b_serCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serCodeActionPerformed
    
        AS_prod ser=new AS_prod();   
        
        if(ser.search_InCode(t_serCode.getText())==true){
            ser.Get_InCdata(tab_rec, t_serCode.getText());
            
            //ser.set((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_serCode.getText(),t_serProd.getText());
            
            switch (ser.search_InCategory(t_serCode.getText())) {
                case 1:
                    cb_cat.setSelectedItem("Computer_Accessories");
                    break;
                case 2:
                    cb_cat.setSelectedItem("Hardware");
                    break;
                case 3:
                    cb_cat.setSelectedItem("Composing");
                    break;
                default:
                    cb_cat.setSelectedItem("Stationary");
                    break;
            }
            
        }
            
        else
            JOptionPane.showMessageDialog(null, "Invalid ID","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_b_serCodeActionPerformed

    private void tab_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_recMouseClicked
        // TODO add your handling code here:
        AS_prod ser=new AS_prod();
        DefaultTableModel model=(DefaultTableModel) tab_rec.getModel();
        
        ((JTextField)t_UpDate.getDateEditor().getUiComponent()).setText(model.getValueAt(tab_rec.getSelectedRow(), 0).toString());
        t_code.setText(model.getValueAt(tab_rec.getSelectedRow(), 1).toString());
        t_prod.setText(model.getValueAt(tab_rec.getSelectedRow(), 2).toString());
        t_stock.setText(model.getValueAt(tab_rec.getSelectedRow(), 3).toString());
        t_purUP.setText(model.getValueAt(tab_rec.getSelectedRow(), 4).toString());
        
        
        switch (ser.search_InCategory(t_code.getText())) {
                case 1:
                    cb_cat.setSelectedItem("Computer_Accessories");
                    break;
                case 2:
                    cb_cat.setSelectedItem("Hardware");
                    break;
                case 3:
                    cb_cat.setSelectedItem("Composing");
                    break;
                default:
                    cb_cat.setSelectedItem("Stationary");
                    break;
            }
    }//GEN-LAST:event_tab_recMouseClicked

    private void t_qtyUgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_qtyUgKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_qtyUgKeyTyped

    private void t_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodActionPerformed

    private void b_serCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_serCodeKeyPressed

    }//GEN-LAST:event_b_serCodeKeyPressed

    private void cb_catyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_catyMouseClicked
        // TODO add your handling code here:
        AS_prod as=new AS_prod();

        String cat=(String)cb_caty.getSelectedItem();
        as.Disp_InRecord(tab_rec, cat);

        if(cat=="Total_Record")
        l_title.setText("Total Records");

        else if(cat=="Computer_Accessories")
        l_title.setText("Computer Accessories");

        else if(cat=="Composing")
        l_title.setText("Composing");

        else if(cat=="Hardware")
        l_title.setText("Hardware");

        else if(cat=="Stationary")
        l_title.setText("Stationary");
    }//GEN-LAST:event_cb_catyMouseClicked

    private void cb_catyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_catyActionPerformed
        AS_prod as=new AS_prod();

        String cat=(String)cb_caty.getSelectedItem();
        as.Disp_InRecord(tab_rec, cat);

        if(cat=="Total_Record")
        l_title.setText("Total Records");

        else if(cat=="Computer_Accessories")
        l_title.setText("Computer Accessories");

        else if(cat=="Composing")
        l_title.setText("Composing");

        else if(cat=="Hardware")
        l_title.setText("Hardware");

        else if(cat=="Stationary")
        l_title.setText("Stationary");
    }//GEN-LAST:event_cb_catyActionPerformed

    private void t_serCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_serCodeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upgrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upgrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_serCode;
    private javax.swing.JButton b_serProd;
    private javax.swing.JButton b_upgrade;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_caty;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_title;
    private com.toedter.calendar.JDateChooser t_UpDate;
    private javax.swing.JTextField t_code;
    private com.toedter.calendar.JDateChooser t_inDateUg;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_purUP;
    private javax.swing.JTextField t_qtyUg;
    private javax.swing.JTextField t_serCode;
    private javax.swing.JTextField t_serProd;
    private javax.swing.JTextField t_stock;
    private javax.swing.JTable tab_rec;
    // End of variables declaration//GEN-END:variables
}
