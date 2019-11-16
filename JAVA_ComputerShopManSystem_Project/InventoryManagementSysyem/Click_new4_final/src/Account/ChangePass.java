/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import Classes.AdminLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahsan
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel22 = new javax.swing.JLabel();
        t_name = new javax.swing.JTextField();
        t_pass = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t_Cpass = new javax.swing.JPasswordField();
        t_newPass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane2.setBackground(new java.awt.Color(12, 101, 101));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHANGE PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 3, 36), new java.awt.Color(0, 153, 153))); // NOI18N
        jDesktopPane2.setForeground(new java.awt.Color(169, 199, 200));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("USER NAME");
        jDesktopPane2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        t_name.setBackground(new java.awt.Color(224, 243, 251));
        t_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jDesktopPane2.add(t_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 206, 29));

        t_pass.setBackground(new java.awt.Color(224, 243, 251));
        t_pass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jDesktopPane2.add(t_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 206, 29));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("OLD PASSWORD");
        jDesktopPane2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("NEW PASSWORD");
        jDesktopPane2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("CONFIRM PASSWORD");
        jDesktopPane2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        t_Cpass.setBackground(new java.awt.Color(224, 243, 251));
        t_Cpass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jDesktopPane2.add(t_Cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 206, 29));

        t_newPass.setBackground(new java.awt.Color(224, 243, 251));
        t_newPass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_newPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_newPassActionPerformed(evt);
            }
        });
        jDesktopPane2.add(t_newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 206, 29));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 30));

        jButton2.setBackground(new java.awt.Color(80, 137, 161));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 40));

        jButton1.setBackground(new java.awt.Color(80, 137, 161));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass1.png"))); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 40));

        b_close.setBackground(new java.awt.Color(102, 102, 102));
        b_close.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        b_close.setForeground(java.awt.Color.red);
        b_close.setText("X");
        b_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_closeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b_closeMouseReleased(evt);
            }
        });
        b_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_closeActionPerformed(evt);
            }
        });
        jDesktopPane2.add(b_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_newPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_newPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_newPassActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            t_pass.setEchoChar((char)0);
            t_newPass.setEchoChar((char)0);
            t_Cpass.setEchoChar((char)0);
        }
        else
        {
            t_pass.setEchoChar('*');
            t_newPass.setEchoChar('*');
            t_Cpass.setEchoChar('*');
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(t_name.getText().equals("") || t_pass.getText().equals("") || t_newPass.getText().equals("") || t_Cpass.getText().equals("")){
            ImageIcon icon=new ImageIcon("war4.png");
            JOptionPane.showMessageDialog(null,"Please Input All Details To Change Password ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
        }
        else{
            AdminLogin admin=new AdminLogin();
            admin.ChangePassword(t_name.getText(), t_pass.getText(), t_newPass.getText(), t_Cpass.getText());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseEntered

        b_close.setBackground(Color.RED);        // TODO add your handling code here:
        b_close.setForeground(Color.white);
    }//GEN-LAST:event_b_closeMouseEntered

    private void b_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseExited
        b_close.setBackground(Color.GRAY);
        b_close.setForeground(Color.red);
    }//GEN-LAST:event_b_closeMouseExited

    private void b_closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseReleased

    }//GEN-LAST:event_b_closeMouseReleased

    private void b_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_closeActionPerformed
        dispose();
    }//GEN-LAST:event_b_closeActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPasswordField t_Cpass;
    private javax.swing.JTextField t_name;
    private javax.swing.JPasswordField t_newPass;
    private javax.swing.JPasswordField t_pass;
    // End of variables declaration//GEN-END:variables
}
