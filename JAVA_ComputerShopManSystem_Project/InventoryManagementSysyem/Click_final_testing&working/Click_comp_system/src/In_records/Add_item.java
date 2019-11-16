/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_records;

import Classes.*;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.util.Date;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ahsan
 */
public class Add_item extends javax.swing.JFrame {

    /**
     * Creates new form Comp_Accesory
     */
    public Add_item() {
        initComponents();
        
        setCentre();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_cat = new javax.swing.JComboBox<>();
        t_prod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t_code = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_Uprice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_qty = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        t_inDate = new com.toedter.calendar.JDateChooser();
        b_cancel = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ADD ITEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 199, 57));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 40));

        cb_cat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        getContentPane().add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 190, 38));

        t_prod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Code");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 40));

        t_code.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Per Unit Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 40));

        t_Uprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t_Uprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 190, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Quantity");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 40));

        t_qty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_qtyActionPerformed(evt);
            }
        });
        getContentPane().add(t_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 190, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 140, 40));

        t_inDate.setDateFormatString("d-MM-yyyy");
        getContentPane().add(t_inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 190, 30));

        b_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_cancel.setText("CANCEL");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            if(cb_cat.getSelectedItem().equals("Select Category") || t_Uprice.getText().equals("") ||
               t_inDate.getDateFormatString().equals("") || t_code.getText().equals("") ||
               t_prod.getText().equals("") || t_qty.getText().equals("") || t_inDate.getDate().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please input all  detail");
            }
            
            else
            {
                AS_prod ser=new AS_prod();
                
                if( (ser.search_InCode(t_code.getText())==true) || (ser.search_InProd(t_prod.getText())==true) ) 
                    JOptionPane.showMessageDialog(null,"This Code OR Product is already Exist ","Records",JOptionPane.INFORMATION_MESSAGE);
                
                else{
                    String caty=(String)cb_cat.getSelectedItem();
                    String d=((JTextField)t_inDate.getDateEditor().getUiComponent()).getText();
                
                    AS_prod as=new AS_prod(d, t_code.getText(), t_prod.getText(), caty, t_qty.getText(), t_Uprice.getText());
                    as.Add_InItem();
                    
                    JOptionPane.showMessageDialog(null,"Successfully Saved ","Product Records",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not Saved", "Error", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_qtyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        cb_cat.setSelectedItem("Select Category");
        t_code.setText("");
        t_prod.setText("");
        t_qty.setText("");
        t_Uprice.setText("");
        t_inDate.setCalendar(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Add_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t_Uprice;
    private javax.swing.JTextField t_code;
    private com.toedter.calendar.JDateChooser t_inDate;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_qty;
    // End of variables declaration//GEN-END:variables
}
