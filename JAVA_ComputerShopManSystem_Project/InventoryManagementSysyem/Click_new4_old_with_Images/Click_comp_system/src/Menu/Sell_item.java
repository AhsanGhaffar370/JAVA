/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Classes.AS_prod;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.UIManager;
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
    }
    
    //if we want to set current date in a text field: 
    public void showDate() 
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        t_qty.setText(s.format(d));
    }

    private void setCentre(){
        //to set the jframe on centre:
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim= new Dimension(tool.getScreenSize());
        int height=(int)dim.getHeight();
        int width=(int)dim.getWidth();
        setLocation(width/ 2-getWidth() / 2,height / 2-getHeight() /2);
    }
    
    private void errorMsg(){
        int sold=Integer.parseInt(t_stock.getText());

        if(sold<=0){
            //t_stock.setBackground(Color.red);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("/Images/war2.png")));
            b_sell.setEnabled(false);
        }
        else{
            //t_stock.setBackground(Color.WHITE);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
            b_sell.setEnabled(true);
        }
    }
    
    private void ProdCode_Action(){
        try{
            AS_prod ser=new AS_prod();

            if(t_serPC.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter Code OR Product Name");
            
            else if(ser.search_InCode(t_serPC.getText())==true){
                ser.Get_InCdata(tab_rec, t_serPC.getText());

                ser.set((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_serPC.getText());
            }
            else if(ser.search_InProd(t_serPC.getText())==true){
                ser.Get_InPdata(tab_rec, t_serPC.getText());

                ser.set((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP,t_serPC.getText());
            }
            else 
                JOptionPane.showMessageDialog(null, "Invalid Product or Code","Error",JOptionPane.ERROR_MESSAGE);
            
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
            errorMsg();

        }catch(Exception e){
            System.out.println(e);
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

            errorMsg();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
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
        jLayeredPane2 = new javax.swing.JLayeredPane();
        t_inDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        t_qty = new javax.swing.JTextField();
        t_sellUP = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
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

        setUndecorated(true);

        t_UpDate.setDateFormatString("d-MM-yyyy");

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELL ITEMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 40), new java.awt.Color(139, 139, 2))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(0, 255, 0));

        tab_rec.setBackground(new java.awt.Color(211, 249, 244));
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
        });
        jScrollPane1.setViewportView(tab_rec);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 210, 770, 420);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 24), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Category");
        jLayeredPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        cb_cat.setBackground(new java.awt.Color(87, 150, 176));
        cb_cat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 NULL", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        jLayeredPane1.add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 30));

        t_code.setBackground(new java.awt.Color(224, 243, 251));
        t_code.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_code.setToolTipText("enter code");
        jLayeredPane1.add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Code");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Product Name");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        t_prod.setBackground(new java.awt.Color(224, 243, 251));
        t_prod.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_prodActionPerformed(evt);
            }
        });
        jLayeredPane1.add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 30));

        t_stock.setBackground(new java.awt.Color(224, 243, 251));
        t_stock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_stockActionPerformed(evt);
            }
        });
        jLayeredPane1.add(t_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Stock Left");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Purchase Unit Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 30));

        t_purUP.setBackground(new java.awt.Color(224, 243, 251));
        t_purUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLayeredPane1.add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        l_invalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid.setForeground(new java.awt.Color(222, 7, 46));
        jLayeredPane1.add(l_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 30, 30));

        jDesktopPane1.add(jLayeredPane1);
        jLayeredPane1.setBounds(20, 70, 420, 240);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sell Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 24), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane2.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_inDate.setBackground(new java.awt.Color(210, 217, 247));
        t_inDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane2.add(t_inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Date");
        jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Selling Quantity");
        jLayeredPane2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        t_qty.setBackground(new java.awt.Color(224, 243, 251));
        t_qty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_qtyKeyTyped(evt);
            }
        });
        jLayeredPane2.add(t_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        t_sellUP.setBackground(new java.awt.Color(224, 243, 251));
        t_sellUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_sellUP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_sellUPKeyTyped(evt);
            }
        });
        jLayeredPane2.add(t_sellUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Selling Unit Price");
        jLayeredPane2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        jDesktopPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(20, 310, 420, 170);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Button Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 24), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_reset.setBackground(new java.awt.Color(87, 150, 176));
        b_reset.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset1.png"))); // NOI18N
        b_reset.setText("Reset");
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, 40));

        b_sell.setBackground(new java.awt.Color(87, 150, 176));
        b_sell.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sell1.png"))); // NOI18N
        b_sell.setText("SELL");
        b_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sellActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 40));

        b_delete.setBackground(new java.awt.Color(87, 150, 176));
        b_delete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete2.png"))); // NOI18N
        b_delete.setText("Delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, 40));

        b_back.setBackground(new java.awt.Color(87, 150, 176));
        b_back.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back1.png"))); // NOI18N
        b_back.setText("Back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 40));

        b_ser1.setBackground(new java.awt.Color(87, 150, 176));
        b_ser1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
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
        jLayeredPane3.add(b_ser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 40));

        jDesktopPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(20, 480, 420, 150);

        l_title.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        l_title.setForeground(new java.awt.Color(204, 204, 204));
        l_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_titleMouseClicked(evt);
            }
        });
        jDesktopPane1.add(l_title);
        l_title.setBounds(870, 160, 360, 50);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 24), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane4.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Category");
        jLayeredPane4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 40));

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
        jLayeredPane4.add(t_serPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 40));

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
        jLayeredPane4.add(cb_caty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 300, 40));

        b_serCode.setBackground(new java.awt.Color(87, 150, 176));
        b_serCode.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_serCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser4.png"))); // NOI18N
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
        jLayeredPane4.add(b_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 120, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Code/Prod");
        jLayeredPane4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jDesktopPane1.add(jLayeredPane4);
        jLayeredPane4.setBounds(450, 70, 420, 140);

        b_close.setBackground(new java.awt.Color(102, 102, 102));
        b_close.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        b_close.setForeground(new java.awt.Color(255, 255, 255));
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
        b_close.setBounds(1185, 0, 45, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(t_UpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(t_TsellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(t_UpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addComponent(t_TsellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sellActionPerformed
        // TODO add your handling code here:
        try{
            if( t_inDate.getDateFormatString().equals("") || t_code.getText().equals("") ||
                t_prod.getText().equals("") || t_qty.getText().equals("") ||
                t_sellUP.getText().equals("") || t_purUP.getText().equals("") 
                || t_stock.getText().equals("") )
                        JOptionPane.showMessageDialog(null, "Please input all  details Properly");
            else{
                
                AS_prod as=new AS_prod();
                
                String cat  = (String)cb_cat.getSelectedItem();
                String d    = ((JTextField)t_inDate.getDateEditor().getUiComponent()).getText();
                String un_d = ((JTextField)t_UpDate.getDateEditor().getUiComponent()).getText();
                
                int P = JOptionPane.showConfirmDialog(null," Press OK to SELL ?","Confirmation",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {
                    if(as.search_OutCode(t_code.getText()) == true){
                        
                        as.fetch_out(t_sellQty, t_TsellPrice, t_code.getText());
                
                        //used in update_OutQty()
                        int    t1   = Integer.parseInt(t_sellQty.getText());
                        int    t2   = Integer.parseInt(t_qty.getText());
                        String Tqty = String.valueOf(t1+t2);
                        
                        //used in update_OutQty()
                        double t3    = Double.parseDouble(t_TsellPrice.getText());
                        double t4    = Double.parseDouble(t_sellUP.getText());
                        int    t5    = Integer.parseInt(t_qty.getText());
                        String Tsell = String.valueOf(t3+(t4*t5));
                        
                        //used in update_OutQty()
                        double t6      = Double.parseDouble(Tsell);
                        double t7      = Double.parseDouble(t_purUP.getText());
                        int    t8      = Integer.parseInt(Tqty);
                        String Tprofit = String.valueOf(t6-(t7*t8));
                        
                        AS_prod as1=new AS_prod(d, t_code.getText(), t_prod.getText(), cat, Tqty, t_purUP.getText(), t_sellUP.getText(), Tprofit, Tsell);
                        as1.update_OutQty(d, t_code.getText(),Tqty,Tprofit,Tsell);
                    }   
                    else{
                        
                        //used in Add_OutItem()
                        double t9   = Double.parseDouble(t_sellUP.getText());
                        int    t10  = Integer.parseInt(t_qty.getText());
                        String sell = String.valueOf(t9*t10);
                        
                        
                        //used in Add_OutItem()
                        double t11    = Double.parseDouble(t_qty.getText());
                        double t12    = Double.parseDouble(t_sellUP.getText());
                        int    t13    = Integer.parseInt(t_purUP.getText());
                        String profit = String.valueOf(t11*(t12-t13));
                        
                        AS_prod as2=new AS_prod(d, t_code.getText(), t_prod.getText(), cat, t_qty.getText(), t_purUP.getText(), t_sellUP.getText(), profit, sell);
                        as2.Add_OutItem();
                    }
                    
                    //used in update_InQty()
                    int    t14     = Integer.parseInt(t_stock.getText());
                    int    t15     = Integer.parseInt(t_qty.getText());
                    String LeftQty = String.valueOf(t14-t15);
                    
                    AS_prod as3=new AS_prod(un_d, t_code.getText(), t_prod.getText(), cat, LeftQty, t_purUP.getText());
                    as3.update_InQty(un_d,t_code.getText(), LeftQty);
                    
                    as.InReset(tab_rec);
                }

                JOptionPane.showMessageDialog(null, "Succesfully Selled","Records",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Not SELL", "Error", JOptionPane.OK_OPTION);
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
        t_sellUP.setText("");
        t_UpDate.setCalendar(null);
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
        ProdCode_Action();
    }//GEN-LAST:event_b_serCodeActionPerformed

    private void b_serCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serCodeMouseClicked
        errorMsg();
    }//GEN-LAST:event_b_serCodeMouseClicked

    private void t_serPCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyReleased
        try{
            AS_prod ser=new AS_prod();

            if(ser.search_InCode(t_serPC.getText())==true)
                ser.Get_InCdata(tab_rec, t_serPC.getText());
            
            else if(ser.search_InProd(t_serPC.getText())==true)
                ser.Get_InPdata(tab_rec, t_serPC.getText());

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }

    }//GEN-LAST:event_t_serPCKeyReleased

    private void t_serPCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ProdCode_Action();
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

    private void t_sellUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellUPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPKeyTyped

    private void t_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_qtyKeyTyped
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_backActionPerformed

    private void b_ser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_ser1ActionPerformed

    private void b_closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseReleased

    }//GEN-LAST:event_b_closeMouseReleased

    private void b_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseEntered

        b_close.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_b_closeMouseEntered

    private void b_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_closeMouseExited
        b_close.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_b_closeMouseExited

    private void b_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_closeActionPerformed

    private void b_ser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ser1MouseEntered
        
    }//GEN-LAST:event_b_ser1MouseEntered

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_invalid;
    private javax.swing.JLabel l_title;
    private javax.swing.JTextField t_TsellPrice;
    private com.toedter.calendar.JDateChooser t_UpDate;
    private javax.swing.JTextField t_code;
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
