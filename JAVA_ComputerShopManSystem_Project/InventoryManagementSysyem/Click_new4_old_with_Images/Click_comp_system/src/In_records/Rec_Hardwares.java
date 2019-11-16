/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_records;

import Classes.AS_prod;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahsan
 */
public class Rec_Hardwares extends javax.swing.JFrame {

    /**
     * Creates new form Upgrade
     */
    public Rec_Hardwares() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_rec = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        t_serPC = new javax.swing.JTextField();
        b_serCode = new javax.swing.JButton();
        cb_caty = new javax.swing.JComboBox<>();
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
        b_cancel = new javax.swing.JButton();
        b_reset = new javax.swing.JButton();
        b_sell = new javax.swing.JButton();
        b_print = new javax.swing.JButton();
        b_help = new javax.swing.JButton();
        l_title = new javax.swing.JLabel();
        b_serDate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        t_serDate = new com.toedter.calendar.JDateChooser();
        t_minDate = new com.toedter.calendar.JDateChooser();
        t_maxDate = new com.toedter.calendar.JDateChooser();
        b_serDDate = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_UpDate = new com.toedter.calendar.JDateChooser();
        t_sellQty = new javax.swing.JTextField();
        t_TsellPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELL ITEMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 48), new java.awt.Color(139, 139, 2))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(0, 255, 0));

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
        jScrollPane1.setBounds(420, 210, 700, 370);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText(" Code/Prod");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(800, 60, 80, 30);

        t_serPC.setBackground(new java.awt.Color(224, 243, 251));
        t_serPC.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        t_serPC.setForeground(new java.awt.Color(153, 153, 153));
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
        jDesktopPane1.add(t_serPC);
        t_serPC.setBounds(880, 60, 150, 30);

        b_serCode.setBackground(new java.awt.Color(87, 150, 176));
        b_serCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jDesktopPane1.add(b_serCode);
        b_serCode.setBounds(1040, 60, 73, 30);

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
        cb_caty.setBounds(430, 10, 250, 40);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 30), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
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
        jLabel17.setText("Code");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
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
        jLabel14.setText("Stock Left");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setText("Purchase Unit Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 30));

        t_purUP.setBackground(new java.awt.Color(224, 243, 251));
        t_purUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLayeredPane1.add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        l_invalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid.setForeground(new java.awt.Color(222, 7, 46));
        jLayeredPane1.add(l_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 30, 30));

        jDesktopPane1.add(jLayeredPane1);
        jLayeredPane1.setBounds(10, 70, 400, 240);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sell Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 30), new java.awt.Color(17, 163, 184))); // NOI18N
        jLayeredPane2.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_inDate.setBackground(new java.awt.Color(210, 217, 247));
        t_inDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane2.add(t_inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel11.setText("Date");
        jLayeredPane2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
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

        t_sellUP.setBackground(new java.awt.Color(224, 243, 251));
        t_sellUP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_sellUP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_sellUPKeyTyped(evt);
            }
        });
        jLayeredPane2.add(t_sellUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel26.setText("Selling Unit Price");
        jLayeredPane2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        jDesktopPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(10, 320, 400, 170);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vijaya", 3, 36), new java.awt.Color(203, 57, 109))); // NOI18N
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_cancel.setBackground(new java.awt.Color(87, 150, 176));
        b_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_cancel.setText("CANCEL");
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 30));

        b_reset.setBackground(new java.awt.Color(87, 150, 176));
        b_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_reset.setText("Reset");
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        b_sell.setBackground(new java.awt.Color(87, 150, 176));
        b_sell.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/invalid1.png"))); // NOI18N
        b_sell.setText("SELL");
        b_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sellActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 30));

        b_print.setBackground(new java.awt.Color(87, 150, 176));
        b_print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_print.setText("Print");
        b_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_printActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 30));

        b_help.setBackground(new java.awt.Color(87, 150, 176));
        b_help.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_help.setText("HELP");
        b_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_helpActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, 30));

        jDesktopPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(10, 490, 400, 90);

        l_title.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        l_title.setForeground(new java.awt.Color(23, 162, 186));
        l_title.setText(" ");
        l_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_titleMouseClicked(evt);
            }
        });
        jDesktopPane1.add(l_title);
        l_title.setBounds(420, 160, 360, 50);

        b_serDate.setBackground(new java.awt.Color(87, 150, 176));
        b_serDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_serDate.setText("Search");
        b_serDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_serDateMouseClicked(evt);
            }
        });
        b_serDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_serDateActionPerformed(evt);
            }
        });
        jDesktopPane1.add(b_serDate);
        b_serDate.setBounds(1040, 100, 73, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel13.setText("Max Date");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(810, 170, 70, 30);

        t_serDate.setDateFormatString("d-MM-yyyy");
        jDesktopPane1.add(t_serDate);
        t_serDate.setBounds(880, 100, 150, 30);

        t_minDate.setDateFormatString("d-MM-yyyy");
        jDesktopPane1.add(t_minDate);
        t_minDate.setBounds(880, 140, 150, 30);

        t_maxDate.setDateFormatString("d-MM-yyyy");
        jDesktopPane1.add(t_maxDate);
        t_maxDate.setBounds(880, 170, 150, 30);

        b_serDDate.setBackground(new java.awt.Color(87, 150, 176));
        b_serDDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b_serDDate.setText("Search");
        b_serDDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_serDDateMouseClicked(evt);
            }
        });
        b_serDDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_serDDateActionPerformed(evt);
            }
        });
        jDesktopPane1.add(b_serDDate);
        b_serDDate.setBounds(1040, 150, 73, 40);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel15.setText("Date");
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(810, 100, 70, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel18.setText("Min Date");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(810, 140, 70, 30);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 23, 23));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error1.png"))); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(1100, 10, 20, 20);

        t_UpDate.setBackground(new java.awt.Color(210, 217, 247));
        t_UpDate.setDateFormatString("d-MM-yyyy");
        jDesktopPane1.add(t_UpDate);
        t_UpDate.setBounds(630, 300, 0, 0);

        t_sellQty.setBackground(new java.awt.Color(224, 243, 251));
        t_sellQty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_sellQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_sellQtyKeyTyped(evt);
            }
        });
        jDesktopPane1.add(t_sellQty);
        t_sellQty.setBounds(720, 290, 6, 0);

        t_TsellPrice.setBackground(new java.awt.Color(224, 243, 251));
        t_TsellPrice.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_TsellPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_TsellPriceKeyTyped(evt);
            }
        });
        jDesktopPane1.add(t_TsellPrice);
        t_TsellPrice.setBounds(590, 290, 0, 0);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_recMouseClicked
        tab_recAction();
    }//GEN-LAST:event_tab_recMouseClicked

    private void tab_recKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyPressed

    }//GEN-LAST:event_tab_recKeyPressed

    private void tab_recKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN){
            tab_recAction();
        }
    }//GEN-LAST:event_tab_recKeyReleased

    private void t_serPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_serPCMouseClicked

    }//GEN-LAST:event_t_serPCMouseClicked

    private void t_serPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_serPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_serPCActionPerformed

    private void t_serPCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ProdCode_Action();
        }
    }//GEN-LAST:event_t_serPCKeyPressed

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

    private void b_serCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serCodeMouseClicked
        errorMsg();
    }//GEN-LAST:event_b_serCodeMouseClicked

    private void b_serCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serCodeActionPerformed
        ProdCode_Action();
    }//GEN-LAST:event_b_serCodeActionPerformed

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

    private void t_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodActionPerformed

    private void t_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stockActionPerformed

    }//GEN-LAST:event_t_stockActionPerformed

    private void t_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_qtyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_qtyKeyTyped

    private void t_sellUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellUPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPKeyTyped

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cancelActionPerformed

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
        t_serDate.setCalendar(null);
        t_minDate.setCalendar(null);
        t_maxDate.setCalendar(null);
        l_title.setText("Total Record");
        l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
    }//GEN-LAST:event_b_resetActionPerformed

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

    private void b_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_printActionPerformed
        MessageFormat header=new MessageFormat("Report Print");

        MessageFormat footer=new MessageFormat("Page(0,number,integer)");

        try{
            tab_rec.print(JTable.PrintMode.NORMAL, header, footer);

        }catch(java.awt.print.PrinterException e){
            System.err.format("Can't Print Check Out your connection", e.getMessage());
        }
    }//GEN-LAST:event_b_printActionPerformed

    private void b_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_helpActionPerformed
        try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"G:\\Ahsan(BSCS-3B)\\imp docs\\Ahsan Ghaffar (CV)_org.pdf");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_b_helpActionPerformed

    private void l_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_titleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_titleMouseClicked

    private void b_serDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_serDateMouseClicked

    private void b_serDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serDateActionPerformed
        try{
            AS_prod ser=new AS_prod();
            String date=((JTextField)t_serDate.getDateEditor().getUiComponent()).getText();

            if(ser.search_InDate(date)==true)
            ser.Get_InDdata(tab_rec, date);
            else
            JOptionPane.showMessageDialog(null, "Invalid Date");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_b_serDateActionPerformed

    private void b_serDDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serDDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_serDDateMouseClicked

    private void b_serDDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serDDateActionPerformed

        try{
            AS_prod ser=new AS_prod();

            String minD=((JTextField)t_minDate.getDateEditor().getUiComponent()).getText();
            String maxD=((JTextField)t_maxDate.getDateEditor().getUiComponent()).getText();

            if(ser.search_InDate(minD)==true && ser.search_InDate(maxD)==true)
            ser.Get_InDateDiff_Data(tab_rec, minD, maxD);
            else
            JOptionPane.showMessageDialog(null, "Invalid Date Difference");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }

    }//GEN-LAST:event_b_serDDateActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void t_sellQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellQtyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellQtyKeyTyped

    private void t_TsellPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_TsellPriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_TsellPriceKeyTyped

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
            java.util.logging.Logger.getLogger(Rec_Hardwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rec_Hardwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rec_Hardwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rec_Hardwares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rec_Hardwares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_help;
    private javax.swing.JButton b_print;
    private javax.swing.JButton b_reset;
    private javax.swing.JButton b_sell;
    private javax.swing.JButton b_serCode;
    private javax.swing.JButton b_serDDate;
    private javax.swing.JButton b_serDate;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_caty;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_invalid;
    private javax.swing.JLabel l_title;
    private javax.swing.JTextField t_TsellPrice;
    private com.toedter.calendar.JDateChooser t_UpDate;
    private javax.swing.JTextField t_code;
    private com.toedter.calendar.JDateChooser t_inDate;
    private com.toedter.calendar.JDateChooser t_maxDate;
    private com.toedter.calendar.JDateChooser t_minDate;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_purUP;
    private javax.swing.JTextField t_qty;
    private javax.swing.JTextField t_sellQty;
    private javax.swing.JTextField t_sellUP;
    private com.toedter.calendar.JDateChooser t_serDate;
    private javax.swing.JTextField t_serPC;
    private javax.swing.JTextField t_stock;
    private javax.swing.JTable tab_rec;
    // End of variables declaration//GEN-END:variables
}
