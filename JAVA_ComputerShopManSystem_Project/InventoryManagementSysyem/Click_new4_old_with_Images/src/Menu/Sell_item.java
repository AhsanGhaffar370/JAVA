/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Classes.AS_prod;
import In_records.In_Search;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Ahsan
 */
public class Sell_item extends javax.swing.JFrame{

    /**
     * Creates new form Sell
     */
    public Sell_item() {
        initComponents();
        
        setCentre();
        
        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);
        
        l_title.setText("Total Record");
        
        //if we want to set current date in a jdateChooser field : 
        Calendar cal=new GregorianCalendar();
        t_inDate.setCalendar(cal);
        
        //to prevent date from edit 
        editDate();
    }
    
    //if we want to set current date in a text field: 
    //at that moment it is unused
    public void showDate() 
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        t_qty.setText(s.format(d));
    }
    
    //to prevent date field to edit from keyboard:
    public void editDate() 
    {
        JTextFieldDateEditor edit;
        edit = (JTextFieldDateEditor) t_inDate.getDateEditor();
        edit.setEditable(false);
    }
    
    private void setCentre(){
        //to set the jframe on centre:
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim= new Dimension(tool.getScreenSize());
        int height=(int)dim.getHeight();
        int width=(int)dim.getWidth();
        setLocation(width/ 2-getWidth() / 2,height / 2-getHeight() /2);
    }
    
    private void sold_errorMsg(){
        int sold=Integer.parseInt(t_stock.getText());

        if(sold<=0){
            //t_stock.setBackground(Color.red);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("/Images/report-512.png")));
            b_sell.setEnabled(false);
        }
        else{
            //t_stock.setBackground(Color.WHITE);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
            b_sell.setEnabled(true);
        }
    }
    
    private void ProdCode_Ser_Action(){
        try{
            AS_prod ser=new AS_prod();

            if(t_serPC.getText().equals("")){
                ImageIcon icon=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null,"Enter Code Or Product to Search ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
            }
            
            else if(ser.search_InCode(t_serPC.getText())==true){
                ser.Get_InCdata(tab_rec, t_serPC.getText());

                ser.set_in((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_sellUP, t_serPC.getText());
            }
            else if(ser.search_InProd(t_serPC.getText())==true){
                ser.Get_InPdata(tab_rec, t_serPC.getText());

                ser.set_in((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_sellUP, t_serPC.getText());
            }
            else 
                JOptionPane.showMessageDialog(null, "Invalid Product or Code","CLICK COMPUTERS SERVICES",JOptionPane.WARNING_MESSAGE);
                
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
                case 4:
                    cb_cat.setSelectedItem("Stationary");
                    break;
                default:
                    cb_cat.setSelectedItem("                 NULL");
                    break;
            }
            sold_errorMsg();

        }catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Searching ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        
        }
    }
    private void tab_recAction(){

        try{
            AS_prod ser=new AS_prod();
            DefaultTableModel model=(DefaultTableModel) tab_rec.getModel();
            int row = tab_rec.getSelectedRow();

            ((JTextField)t_UpDate.getDateEditor().getUiComponent()).setText(model.getValueAt(row , 0).toString());
            t_code.setText(model.getValueAt(row , 1).toString());
            t_prod.setText(model.getValueAt(row , 2).toString());
            t_stock.setText(model.getValueAt(row , 3).toString());
            t_purUP.setText(model.getValueAt(row , 4).toString());
            t_sellUP.setText(model.getValueAt(row , 5).toString());

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

            sold_errorMsg();
                
        }catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Poblem in Records ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_UpDate = new com.toedter.calendar.JDateChooser();
        t_sellQty = new javax.swing.JTextField();
        t_TsellPrice = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_rec = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel23 = new javax.swing.JLabel();
        cb_cat = new javax.swing.JComboBox<>();
        t_code = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t_prod = new javax.swing.JTextField();
        t_stock = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_purUP = new javax.swing.JTextField();
        l_invalid = new javax.swing.JLabel();
        t_sellUP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        t_inDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        t_qty = new javax.swing.JTextField();
        t_discount = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        l_invalid1 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        b_reset = new javax.swing.JButton();
        b_sell = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_back = new javax.swing.JButton();
        b_ser1 = new javax.swing.JButton();
        l_title = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        t_serPC = new javax.swing.JTextField();
        cb_caty = new javax.swing.JComboBox<>();
        b_serCode = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        b_close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_Tprofit = new javax.swing.JTextField();
        t_Tdiscount = new javax.swing.JTextField();
        t_Tpur = new javax.swing.JTextField();

        setUndecorated(true);

        t_UpDate.setDateFormatString("d-MM-yyyy");

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELL ITEMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 3, 40), new java.awt.Color(222, 97, 15))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(0, 255, 0));

        tab_rec.setBackground(new java.awt.Color(76, 190, 232));
        tab_rec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tab_rec.setForeground(new java.awt.Color(255, 255, 255));
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
        tab_rec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tab_recKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tab_recKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab_recKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tab_rec);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 230, 810, 480);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Category");
        jLayeredPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        cb_cat.setBackground(new java.awt.Color(87, 150, 176));
        cb_cat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 NULL", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        cb_cat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cb_catKeyTyped(evt);
            }
        });
        jLayeredPane1.add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        t_code.setEditable(false);
        t_code.setBackground(new java.awt.Color(224, 243, 251));
        t_code.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_code.setToolTipText("enter code");
        t_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_codeKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Code");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Name");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        t_prod.setEditable(false);
        t_prod.setBackground(new java.awt.Color(224, 243, 251));
        t_prod.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_prodActionPerformed(evt);
            }
        });
        t_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_prodKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 30));

        t_stock.setEditable(false);
        t_stock.setBackground(new java.awt.Color(224, 243, 251));
        t_stock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_stockActionPerformed(evt);
            }
        });
        t_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_stockKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Stock Left");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Purchase Unit Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        t_purUP.setEditable(false);
        t_purUP.setBackground(new java.awt.Color(224, 243, 251));
        t_purUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_purUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_purUPActionPerformed(evt);
            }
        });
        t_purUP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_purUPKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, 30));

        l_invalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid.setForeground(new java.awt.Color(222, 7, 46));
        jLayeredPane1.add(l_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 30, 30));

        t_sellUP.setEditable(false);
        t_sellUP.setBackground(new java.awt.Color(224, 243, 251));
        t_sellUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_sellUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_sellUPActionPerformed(evt);
            }
        });
        t_sellUP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_sellUPKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_sellUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sell Unit Price");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        jDesktopPane1.add(jLayeredPane1);
        jLayeredPane1.setBounds(20, 70, 420, 290);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sell", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane2.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_inDate.setBackground(new java.awt.Color(210, 217, 247));
        t_inDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane2.add(t_inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date");
        jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Selling Quantity");
        jLayeredPane2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        t_qty.setBackground(new java.awt.Color(224, 243, 251));
        t_qty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_qtyKeyTyped(evt);
            }
        });
        jLayeredPane2.add(t_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 30));

        t_discount.setBackground(new java.awt.Color(224, 243, 251));
        t_discount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_discountKeyTyped(evt);
            }
        });
        jLayeredPane2.add(t_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Discount");
        jLayeredPane2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        l_invalid1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid1.setForeground(new java.awt.Color(222, 7, 46));
        l_invalid1.setToolTipText("future date choose notification");
        jLayeredPane2.add(l_invalid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 30, 30));

        jDesktopPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(20, 360, 420, 180);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action Performed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_reset.setBackground(new java.awt.Color(80, 137, 161));
        b_reset.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_reset.setForeground(new java.awt.Color(255, 255, 255));
        b_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset1.png"))); // NOI18N
        b_reset.setText("Reset");
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, 40));

        b_sell.setBackground(new java.awt.Color(80, 137, 161));
        b_sell.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_sell.setForeground(new java.awt.Color(255, 255, 255));
        b_sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sell1.png"))); // NOI18N
        b_sell.setText("SELL");
        b_sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_sellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_sellMouseExited(evt);
            }
        });
        b_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sellActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 40));

        b_delete.setBackground(new java.awt.Color(80, 137, 161));
        b_delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_delete.setForeground(new java.awt.Color(255, 255, 255));
        b_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete2.png"))); // NOI18N
        b_delete.setText("Delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, 40));

        b_back.setBackground(new java.awt.Color(80, 137, 161));
        b_back.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_back.setForeground(new java.awt.Color(255, 255, 255));
        b_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.png"))); // NOI18N
        b_back.setText("Back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 40));

        b_ser1.setBackground(new java.awt.Color(80, 137, 161));
        b_ser1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_ser1.setForeground(new java.awt.Color(255, 255, 255));
        b_ser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser2.png"))); // NOI18N
        b_ser1.setText("Advanced");
        b_ser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_ser1MouseEntered(evt);
            }
        });
        b_ser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ser1ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_ser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 40));

        jDesktopPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(20, 540, 420, 170);

        l_title.setBackground(new java.awt.Color(164, 224, 250));
        l_title.setFont(new java.awt.Font("Algerian", 3, 29)); // NOI18N
        l_title.setForeground(new java.awt.Color(164, 224, 250));
        l_title.setText("Computer Accessories");
        l_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_titleMouseClicked(evt);
            }
        });
        jDesktopPane1.add(l_title);
        l_title.setBounds(450, 200, 390, 30);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane4.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category");
        jLayeredPane4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 40));

        t_serPC.setBackground(new java.awt.Color(224, 243, 251));
        t_serPC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_serPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_serPCMouseClicked(evt);
            }
        });
        t_serPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_serPCActionPerformed(evt);
            }
        });
        t_serPC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_serPCKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_serPCKeyReleased(evt);
            }
        });
        jLayeredPane4.add(t_serPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, 40));

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
        jLayeredPane4.add(cb_caty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 300, 40));

        b_serCode.setBackground(new java.awt.Color(80, 137, 161));
        b_serCode.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_serCode.setForeground(new java.awt.Color(255, 255, 255));
        b_serCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser0 - Copy.png"))); // NOI18N
        b_serCode.setText("Search");
        b_serCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_serCodeMouseClicked(evt);
            }
        });
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
        jLayeredPane4.add(b_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 120, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Code/Prod");
        jLayeredPane4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 40));

        jDesktopPane1.add(jLayeredPane4);
        jLayeredPane4.setBounds(840, 70, 420, 160);

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
        jDesktopPane1.add(b_close);
        b_close.setBounds(1230, 0, 45, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser22.png"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(110, 100, 240, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1-512.png"))); // NOI18N
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(110, 370, 240, 180);
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(940, 90, 240, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser55.png"))); // NOI18N
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(920, 60, 270, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/15104-illustration-of-a-green-power-button-icon-pv - Copy.png"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(120, 560, 240, 150);

        t_Tprofit.setBackground(new java.awt.Color(224, 243, 251));
        t_Tprofit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_Tprofit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_TprofitKeyTyped(evt);
            }
        });
        jDesktopPane1.add(t_Tprofit);
        t_Tprofit.setBounds(500, 90, 70, 23);

        t_Tdiscount.setBackground(new java.awt.Color(224, 243, 251));
        t_Tdiscount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_Tdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_TdiscountKeyTyped(evt);
            }
        });
        jDesktopPane1.add(t_Tdiscount);
        t_Tdiscount.setBounds(500, 60, 70, 23);

        t_Tpur.setBackground(new java.awt.Color(224, 243, 251));
        t_Tpur.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_Tpur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_TpurKeyTyped(evt);
            }
        });
        jDesktopPane1.add(t_Tpur);
        t_Tpur.setBounds(510, 120, 70, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(t_UpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(t_TsellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(774, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(t_UpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addComponent(t_TsellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sellActionPerformed
        // TODO add your handling code here:
        try{
            int    temp1    = Integer.parseInt(t_qty.getText());
            int    temp2    = Integer.parseInt(t_stock.getText());
            
            if( t_inDate.getDateFormatString().equals("") || t_code.getText().equals("") ||
                t_prod.getText().equals("") || t_qty.getText().equals("") ||
                t_discount.getText().equals("") || t_purUP.getText().equals("") || t_sellUP.getText().equals("") 
                || t_stock.getText().equals("") || cb_cat.getSelectedItem().equals("                 NULL")){
                ImageIcon err=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null, "Please input all  details","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }
            else if(temp1 > temp2){
                ImageIcon err=new ImageIcon("notify1.png");
                JOptionPane.showMessageDialog(null, "There is not enough Quantity which you wants to SELL","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            
            }
            else if(temp1 <= 0){
                ImageIcon err=new ImageIcon("notify1.png");
                JOptionPane.showMessageDialog(null, "Put some reasonable Quantity to SELL","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            
            }             
            else{
                
                AS_prod as=new AS_prod();
                
                String cat  = (String)cb_cat.getSelectedItem();
                String d    = ((JTextField)t_inDate.getDateEditor().getUiComponent()).getText();
                String un_d = ((JTextField)t_UpDate.getDateEditor().getUiComponent()).getText();
                
                int P = JOptionPane.showConfirmDialog(null," Do you want to SELL this item?","CLICK COMPUTER SERVICES",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {
                    if(as.search_OutCode(t_code.getText()) == true){
                        
                        as.fetch_out(t_sellQty, t_Tdiscount, t_Tprofit, t_TsellPrice, t_code.getText());
                
                        //used in update_OutQty()
                        double    t1   = Double.parseDouble(t_sellQty.getText());//it is hide in jframe 
                        double    t2   = Double.parseDouble(t_qty.getText());
                        String Tqty = String.valueOf(t1+t2);
                        
                        //used in update_OutQty()
                        double    t11   = Double.parseDouble(t_Tdiscount.getText());//it is hide in jframe 
                        double    t22   = Double.parseDouble(t_discount.getText());
                        String TDiscount = String.valueOf(t11+t22);
                        
                        //used in update_OutQty()
                        double t3    = Double.parseDouble(t_TsellPrice.getText());
                        double t4    = Double.parseDouble(t_discount.getText());
                        double t44   = Double.parseDouble(t_sellUP.getText());
                        double t5    = Double.parseDouble(t_qty.getText());
                        String Tsell = String.valueOf(t3+(t5*(t44-t4)));
                        
                        //used in update_OutQty()
                        double t6      = Double.parseDouble(t_sellUP.getText());
                        double t7      = Double.parseDouble(t_purUP.getText());
                        double t77     = Double.parseDouble(t_discount.getText());
                        double t8      = Double.parseDouble(t_qty.getText());
                        double t88      = Double.parseDouble(t_Tprofit.getText());
                        String Tprofit = String.valueOf(t88+(t8*((t6-t7)-t77)));
                        
                        AS_prod as1=new AS_prod(d, t_code.getText(), t_prod.getText(), cat, Tqty, t_purUP.getText(), t_sellUP.getText(), TDiscount, Tprofit, Tsell);
                        as1.update_OutQty(t_code.getText());
                    }   
                    else{
                        
                        //used in Add_OutItem()
                        double t4    = Double.parseDouble(t_discount.getText());
                        double t44   = Double.parseDouble(t_sellUP.getText());
                        double t5    = Double.parseDouble(t_qty.getText());
                        String tsell = String.valueOf(t5*(t44-t4));
                        
                        
                        //used in Add_OutItem()
                        double t6      = Double.parseDouble(t_sellUP.getText());
                        double t7      = Double.parseDouble(t_purUP.getText());
                        double t77     = Double.parseDouble(t_discount.getText());
                        double t8      = Double.parseDouble(t_qty.getText());
                        String tprofit = String.valueOf(t8*((t6-t7)-t77));
                        
                        AS_prod as2=new AS_prod(d, t_code.getText(), t_prod.getText(), cat, t_qty.getText(), t_purUP.getText(), t_sellUP.getText(),t_discount.getText(), tprofit, tsell);
                        as2.Add_OutItem();
                    }
                    
                    //used in update_InQty()
                    int    t14     = Integer.parseInt(t_stock.getText());
                    int    t15     = Integer.parseInt(t_qty.getText());
                    String LeftQty = String.valueOf(t14-t15);
                    
                    as.fetch_in(t_Tpur,t_code.getText());
                    double Ttpur=Double.parseDouble(t_Tpur.getText())-(Double.parseDouble(t_qty.getText())*Double.parseDouble(t_purUP.getText()));
                        
                    
                    AS_prod as3=new AS_prod(un_d, t_code.getText(), t_prod.getText(), cat, LeftQty, t_purUP.getText(), t_sellUP.getText(),String.valueOf(Ttpur));
                        
                    as3.update_InQty(t_code.getText());
                    
                    
                    ImageIcon icon=new ImageIcon("selled.png");
                    JOptionPane.showMessageDialog(null,"Item Selled Successfully ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);   
                    
                    as.InReset(tab_rec);
                    
                    cb_cat.setSelectedItem("                 NULL");
                    t_code.setText("");
                    t_prod.setText("");
                    t_stock.setText("");
                    t_purUP.setText("");
                    t_qty.setText("");
                    t_sellQty.setText("");
                    t_discount.setText("");
                    Calendar cal=new GregorianCalendar();
                    t_UpDate.setCalendar(cal);
                    l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
                }     
            }
        }
        catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Selling item ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }

    }//GEN-LAST:event_b_sellActionPerformed

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed

        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);
        
        cb_cat.setSelectedItem("                 NULL");
        t_serPC.setText("");
        t_code.setText("");
        t_prod.setText("");
        t_stock.setText("");
        t_purUP.setText("");
        t_qty.setText("");
        t_sellQty.setText("");
        t_discount.setText("");
        Calendar cal=new GregorianCalendar();
        t_inDate.setCalendar(cal);
        l_title.setText("Total Record");
        l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
    }//GEN-LAST:event_b_resetActionPerformed

    private void t_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stockActionPerformed

    }//GEN-LAST:event_t_stockActionPerformed

    private void t_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodActionPerformed

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

    private void b_serCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_serCodeKeyPressed

    }//GEN-LAST:event_b_serCodeKeyPressed

    private void b_serCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serCodeActionPerformed
        ProdCode_Ser_Action();
    }//GEN-LAST:event_b_serCodeActionPerformed

    private void b_serCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serCodeMouseClicked
        sold_errorMsg();
    }//GEN-LAST:event_b_serCodeMouseClicked

    private void t_serPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyReleased
        try{
            AS_prod ser=new AS_prod();

            if(ser.search_InCode(t_serPC.getText())==true)
                ser.Get_InCdata(tab_rec, t_serPC.getText());
            
            else if(ser.search_InProd(t_serPC.getText())==true)
                ser.Get_InPdata(tab_rec, t_serPC.getText());

        }catch(Exception e){    
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Record Display ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }

    }//GEN-LAST:event_t_serPCKeyReleased

    private void t_serPCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ProdCode_Ser_Action();
        }
    }//GEN-LAST:event_t_serPCKeyPressed

    private void t_serPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_serPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_serPCActionPerformed

    private void tab_recKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN){
            tab_recAction();
        }
    }//GEN-LAST:event_tab_recKeyReleased

    private void tab_recKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyPressed

    }//GEN-LAST:event_tab_recKeyPressed

    private void tab_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_recMouseClicked
        tab_recAction();
    }//GEN-LAST:event_tab_recMouseClicked

    private void t_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_discountKeyTyped
        char c=evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_discountKeyTyped

    private void t_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_qtyKeyTyped
        char c=evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_qtyKeyTyped

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

    private void t_serPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_serPCMouseClicked
        
    }//GEN-LAST:event_t_serPCMouseClicked

    private void l_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_titleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_titleMouseClicked

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
                try{
            if( t_UpDate.getDateFormatString().equals("") || t_code.getText().equals("") ||
                t_prod.getText().equals("") || t_purUP.getText().equals("") 
                || t_stock.getText().equals("") || cb_cat.getSelectedItem().equals("                 NULL")){
                ImageIcon err=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null, "Please input all  details","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }          
            else{
                
                int P = JOptionPane.showConfirmDialog(null," Do you want to DELETE this item?","CLICK COMPUTER SERVICES",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {
                    AS_prod as=new AS_prod();
                    as.delete_InProd(t_code.getText());
                    
                    ImageIcon icon=new ImageIcon("multimedia.png");
                    JOptionPane.showMessageDialog(null,"Item Dleted Successfully ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);  
                    
                    as.InReset(tab_rec);
                    
                    cb_cat.setSelectedItem("                 NULL");
                    t_code.setText("");
                    t_prod.setText("");
                    t_stock.setText("");
                    t_purUP.setText("");
                    t_UpDate.setCalendar(null);
                    l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
                }      
            
            }
        }
        catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Selling item ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        dispose();
    }//GEN-LAST:event_b_backActionPerformed

    private void b_ser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ser1ActionPerformed
        In_Search ser=new In_Search();
        ser.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_ser1ActionPerformed

    private void b_closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseReleased

    }//GEN-LAST:event_b_closeMouseReleased

    private void b_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseEntered

        b_close.setBackground(Color.RED);        // TODO add your handling code here:
        b_close.setForeground(Color.white);
    }//GEN-LAST:event_b_closeMouseEntered

    private void b_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseExited
        b_close.setBackground(Color.GRAY);
        b_close.setForeground(Color.red);
    }//GEN-LAST:event_b_closeMouseExited

    private void b_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_closeActionPerformed
        dispose();
    }//GEN-LAST:event_b_closeActionPerformed

    private void b_ser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ser1MouseEntered
        
    }//GEN-LAST:event_b_ser1MouseEntered

    private void b_sellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sellMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_b_sellMouseEntered

    private void b_sellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sellMouseExited
        
    }//GEN-LAST:event_b_sellMouseExited

    private void t_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_stockKeyTyped

    }//GEN-LAST:event_t_stockKeyTyped

    private void t_purUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_purUPKeyTyped

    }//GEN-LAST:event_t_purUPKeyTyped

    private void t_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_prodKeyTyped
 
    }//GEN-LAST:event_t_prodKeyTyped

    private void t_codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_codeKeyTyped

    }//GEN-LAST:event_t_codeKeyTyped

    private void cb_catKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_catKeyTyped

    }//GEN-LAST:event_cb_catKeyTyped

    private void t_purUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_purUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_purUPActionPerformed

    private void tab_recKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyTyped
        char c=evt.getKeyChar();
        
        if(!(c==java.awt.event.KeyEvent.VK_BACK_SPACE || c==java.awt.event.KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tab_recKeyTyped

    private void t_sellUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_sellUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPActionPerformed

    private void t_sellUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellUPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPKeyTyped

    private void t_TprofitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_TprofitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_TprofitKeyTyped

    private void t_TdiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_TdiscountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_TdiscountKeyTyped

    private void t_TpurKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_TpurKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_TpurKeyTyped

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
                /*
                //Theme 1:
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                
                //Theme 2:
                com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "my company");
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                
                //Theme 3:
                Properties props = new Properties();
            
                props.put("logoString", "my company"); 
                props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");

                props.put("selectionBackgroundColor", "180 240 197"); 
                props.put("menuSelectionBackgroundColor", "180 240 197"); 

                props.put("controlColor", "218 254 230");
                props.put("controlColorLight", "218 254 230");
                props.put("controlColorDark", "180 240 197"); 

                props.put("buttonColor", "218 230 254");
                props.put("buttonColorLight", "255 255 255");
                props.put("buttonColorDark", "244 242 232");

                props.put("rolloverColor", "218 254 230"); 
                props.put("rolloverColorLight", "218 254 230"); 
                props.put("rolloverColorDark", "180 240 197"); 

                props.put("windowTitleForegroundColor", "0 0 0");
                props.put("windowTitleBackgroundColor", "180 240 197"); 
                props.put("windowTitleColorLight", "218 254 230"); 
                props.put("windowTitleColorDark", "180 240 197"); 
                props.put("windowBorderColor", "218 254 230");
                
                SmartLookAndFeel.setCurrentTheme(props);
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                */
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sell_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sell_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sell_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_close;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_reset;
    private javax.swing.JButton b_sell;
    private javax.swing.JButton b_ser1;
    private javax.swing.JButton b_serCode;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_caty;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_invalid;
    private javax.swing.JLabel l_invalid1;
    private javax.swing.JLabel l_title;
    private javax.swing.JTextField t_Tdiscount;
    private javax.swing.JTextField t_Tprofit;
    private javax.swing.JTextField t_Tpur;
    private javax.swing.JTextField t_TsellPrice;
    private com.toedter.calendar.JDateChooser t_UpDate;
    private javax.swing.JTextField t_code;
    private javax.swing.JTextField t_discount;
    private com.toedter.calendar.JDateChooser t_inDate;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_purUP;
    private javax.swing.JTextField t_qty;
    private javax.swing.JTextField t_sellQty;
    private javax.swing.JTextField t_sellUP;
    private javax.swing.JTextField t_serPC;
    private javax.swing.JTextField t_stock;
    private javax.swing.JTable tab_rec;
    // End of variables declaration//GEN-END:variables
}
