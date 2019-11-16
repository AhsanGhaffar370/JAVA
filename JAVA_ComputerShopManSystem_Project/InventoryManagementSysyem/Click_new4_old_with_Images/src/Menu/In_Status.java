/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Ahsan
 */
public class In_Status extends javax.swing.JFrame {

    /**
     * Creates new form Status
     */
    public In_Status() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        t_prod = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t_qty = new javax.swing.JTextField();
        t_PUtotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_total = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("PURCHASING STATUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("THIS MONTH");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 186, 57));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("WHOLE");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 185, 57));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Totals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_prod.setEditable(false);
        t_prod.setBackground(new java.awt.Color(224, 243, 251));
        t_prod.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_prod.setToolTipText("enter code");
        t_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_prodKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total Products");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Quantities");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        t_qty.setEditable(false);
        t_qty.setBackground(new java.awt.Color(224, 243, 251));
        t_qty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_qtyActionPerformed(evt);
            }
        });
        t_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_qtyKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        t_PUtotal.setEditable(false);
        t_PUtotal.setBackground(new java.awt.Color(224, 243, 251));
        t_PUtotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_PUtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_PUtotalActionPerformed(evt);
            }
        });
        t_PUtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_PUtotalKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_PUtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Unit Price");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        t_total.setEditable(false);
        t_total.setBackground(new java.awt.Color(224, 243, 251));
        t_total.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_totalActionPerformed(evt);
            }
        });
        t_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_totalKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 30));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 370, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_prodKeyTyped

    }//GEN-LAST:event_t_prodKeyTyped

    private void t_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_qtyActionPerformed

    private void t_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_qtyKeyTyped

    }//GEN-LAST:event_t_qtyKeyTyped

    private void t_PUtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_PUtotalActionPerformed

    }//GEN-LAST:event_t_PUtotalActionPerformed

    private void t_PUtotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_PUtotalKeyTyped

    }//GEN-LAST:event_t_PUtotalKeyTyped

    private void t_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_totalActionPerformed

    private void t_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_totalKeyTyped

    }//GEN-LAST:event_t_totalKeyTyped

        private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        // here [this] keyword means your current frame
        //OR simply you can use this.hide(); or this.setVisible(false); instead of this.dispose();
        this.dispose();
    } 
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
            java.util.logging.Logger.getLogger(In_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(In_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(In_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(In_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new In_Status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField t_PUtotal;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_qty;
    private javax.swing.JTextField t_total;
    // End of variables declaration//GEN-END:variables
}
