/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_records;

import Classes.AS_prod;
import com.sun.glass.events.KeyEvent;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ahsan
 */
public class In_Update extends javax.swing.JFrame {

    /**
     * Creates new form Rec_Harware
     */
    public In_Update() {
        initComponents();
        
        setCentre();
        
        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);
        
        l_title.setText("Total Record");
        
        //if we want to set current date in a jdateChooser field : 
        Calendar cal=new GregorianCalendar();
        t_inDateU.setCalendar(cal);
        
        //to prevent date from edit 
        editDate();
    }
    
    //to prevent date field to edit from keyboard:
    public void editDate() 
    {
        JTextFieldDateEditor edit;
        edit = (JTextFieldDateEditor) t_inDate.getDateEditor();
        edit.setEditable(false);
        edit = (JTextFieldDateEditor) t_inDateU.getDateEditor();
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
        int stock=Integer.parseInt(t_stock.getText());

        if(stock<=0){
            //t_stock.setBackground(Color.red);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("/Images/report-512.png")));
        }
        else{
            //t_stock.setBackground(Color.WHITE);
            l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
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

                ser.set_in((JTextField)t_inDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_sellUP, t_serPC.getText());
            }
            else if(ser.search_InProd(t_serPC.getText())==true){
                ser.Get_InPdata(tab_rec, t_serPC.getText());

                ser.set_in((JTextField)t_inDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP, t_sellUP, t_serPC.getText());
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

            ((JTextField)t_inDate.getDateEditor().getUiComponent()).setText(model.getValueAt(row , 0).toString());
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
        jLabel12 = new javax.swing.JLabel();
        t_purUP = new javax.swing.JTextField();
        l_invalid = new javax.swing.JLabel();
        t_inDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        t_sellUP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        b_reset = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_back = new javax.swing.JButton();
        b_ser1 = new javax.swing.JButton();
        b_update = new javax.swing.JButton();
        l_title = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        t_serPC = new javax.swing.JTextField();
        b_serCode = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_caty = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        b_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        t_codeU = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        t_prodU = new javax.swing.JTextField();
        t_purUPU = new javax.swing.JTextField();
        t_inDateU = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        t_sellUPU = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE PURCHASED ITEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 3, 40), new java.awt.Color(126, 226, 198))); // NOI18N
        jDesktopPane1.setForeground(new java.awt.Color(0, 255, 0));

        tab_rec.setBackground(new java.awt.Color(206, 233, 243));
        tab_rec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jScrollPane1.setBounds(430, 380, 770, 160);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane1.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Category");
        jLayeredPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 30));

        cb_cat.setBackground(new java.awt.Color(87, 150, 176));
        cb_cat.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 NULL", "Computer_Accessories", "Composing", "Hardware", "Stationary" }));
        cb_cat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cb_catKeyTyped(evt);
            }
        });
        jLayeredPane1.add(cb_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 30));

        t_code.setEditable(false);
        t_code.setBackground(new java.awt.Color(224, 243, 251));
        t_code.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_code.setToolTipText("enter code");
        t_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_codeKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Code");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Name");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, 30));

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
        jLayeredPane1.add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 190, 30));

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
        jLayeredPane1.add(t_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 0, 10));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Purchase Unit Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, 30));

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
        jLayeredPane1.add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 190, 30));

        l_invalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid.setForeground(new java.awt.Color(222, 7, 46));
        jLayeredPane1.add(l_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 30, 30));

        t_inDate.setBackground(new java.awt.Color(210, 217, 247));
        t_inDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane1.add(t_inDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 190, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Last Updated Date");
        jLayeredPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, 30));

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
        jLayeredPane1.add(t_sellUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sell Unit Price");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 30));

        jDesktopPane1.add(jLayeredPane1);
        jLayeredPane1.setBounds(430, 210, 770, 170);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action Performed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 30), new java.awt.Color(164, 224, 250))); // NOI18N
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
        jLayeredPane3.add(b_ser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 40));

        b_update.setBackground(new java.awt.Color(80, 137, 161));
        b_update.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_update.setForeground(new java.awt.Color(255, 255, 255));
        b_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit1.png"))); // NOI18N
        b_update.setText("Update");
        b_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_updateMouseExited(evt);
            }
        });
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });
        jLayeredPane3.add(b_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 40));

        jDesktopPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(10, 370, 420, 170);

        l_title.setBackground(new java.awt.Color(164, 224, 250));
        l_title.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        l_title.setForeground(new java.awt.Color(164, 224, 250));
        l_title.setText("Computer Accessories");
        l_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_titleMouseClicked(evt);
            }
        });
        jDesktopPane1.add(l_title);
        l_title.setBounds(810, 180, 350, 30);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane4.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLayeredPane4.add(t_serPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 30));

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
        jLayeredPane4.add(b_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 100, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Code/Prod");
        jLayeredPane4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

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
        jLayeredPane4.add(cb_caty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 260, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category");
        jLayeredPane4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 40));

        jDesktopPane1.add(jLayeredPane4);
        jLayeredPane4.setBounds(430, 70, 380, 140);

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
        b_close.setBounds(1160, 0, 45, 30);
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(940, 90, 240, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/up22.png"))); // NOI18N
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(860, 60, 30, 220);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 30), new java.awt.Color(164, 224, 250))); // NOI18N
        jLayeredPane5.setForeground(new java.awt.Color(19, 212, 206));
        jLayeredPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_codeU.setBackground(new java.awt.Color(224, 243, 251));
        t_codeU.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_codeU.setToolTipText("enter code");
        t_codeU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_codeUKeyTyped(evt);
            }
        });
        jLayeredPane5.add(t_codeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Code");
        jLayeredPane5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Product Name");
        jLayeredPane5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        t_prodU.setBackground(new java.awt.Color(224, 243, 251));
        t_prodU.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_prodU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_prodUActionPerformed(evt);
            }
        });
        t_prodU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_prodUKeyTyped(evt);
            }
        });
        jLayeredPane5.add(t_prodU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 30));

        t_purUPU.setBackground(new java.awt.Color(224, 243, 251));
        t_purUPU.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_purUPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_purUPUActionPerformed(evt);
            }
        });
        t_purUPU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_purUPUKeyTyped(evt);
            }
        });
        jLayeredPane5.add(t_purUPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, 30));

        t_inDateU.setBackground(new java.awt.Color(210, 217, 247));
        t_inDateU.setDateFormatString("d-MM-yyyy");
        jLayeredPane5.add(t_inDateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 190, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date");
        jLayeredPane5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 30));

        t_sellUPU.setBackground(new java.awt.Color(224, 243, 251));
        t_sellUPU.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_sellUPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_sellUPUActionPerformed(evt);
            }
        });
        t_sellUPU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_sellUPUKeyTyped(evt);
            }
        });
        jLayeredPane5.add(t_sellUPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Purchase Unit Price");
        jLayeredPane5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sell Unit Price");
        jLayeredPane5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 30));

        jDesktopPane1.add(jLayeredPane5);
        jLayeredPane5.setBounds(10, 70, 420, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

    private void tab_recKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyTyped
        char c=evt.getKeyChar();

        if(!(c==java.awt.event.KeyEvent.VK_BACK_SPACE || c==java.awt.event.KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tab_recKeyTyped

    private void cb_catKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_catKeyTyped

    }//GEN-LAST:event_cb_catKeyTyped

    private void t_codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_codeKeyTyped

    }//GEN-LAST:event_t_codeKeyTyped

    private void t_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodActionPerformed

    private void t_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_prodKeyTyped

    }//GEN-LAST:event_t_prodKeyTyped

    private void t_purUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_purUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_purUPActionPerformed

    private void t_purUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_purUPKeyTyped

    }//GEN-LAST:event_t_purUPKeyTyped

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed

        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.InReset(tab_rec);

        t_codeU.setText("");
        t_prodU.setText("");
        t_purUPU.setText("");
        t_sellUPU.setText("");
        Calendar cale=new GregorianCalendar();
        t_inDateU.setCalendar(cale);
        cb_cat.setSelectedItem("                 NULL");
        t_serPC.setText("");
        t_code.setText("");
        t_prod.setText("");
        t_stock.setText("");
        t_purUP.setText("");
        t_sellUP.setText("");
        l_title.setText("Total Record");
        l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
    }//GEN-LAST:event_b_resetActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        try{
            if( t_inDateU.getDateFormatString().equals("") || t_code.getText().equals("") ||
                t_prod.getText().equals("") || t_purUP.getText().equals("")|| t_sellUP.getText().equals("")
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
                    t_sellUP.setText("");
                    t_inDate.setCalendar(null);
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

    private void b_ser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_ser1MouseEntered

    }//GEN-LAST:event_b_ser1MouseEntered

    private void b_ser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ser1ActionPerformed
        In_Search ser=new In_Search();
        ser.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_ser1ActionPerformed

    private void l_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_titleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l_titleMouseClicked

    private void t_serPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_serPCMouseClicked

    }//GEN-LAST:event_t_serPCMouseClicked

    private void t_serPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_serPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_serPCActionPerformed

    private void t_serPCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_serPCKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ProdCode_Ser_Action();
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
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Record Display ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_t_serPCKeyReleased

    private void b_serCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serCodeMouseClicked
        sold_errorMsg();
    }//GEN-LAST:event_b_serCodeMouseClicked

    private void b_serCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serCodeActionPerformed
        ProdCode_Ser_Action();
    }//GEN-LAST:event_b_serCodeActionPerformed

    private void b_serCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_serCodeKeyPressed

    }//GEN-LAST:event_b_serCodeKeyPressed

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

    private void t_codeUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_codeUKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_codeUKeyTyped

    private void t_prodUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodUActionPerformed

    private void t_prodUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_prodUKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodUKeyTyped

    private void t_purUPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_purUPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_purUPUActionPerformed

    private void t_purUPUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_purUPUKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_purUPUKeyTyped

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
        try{
            if( t_inDateU.getDateFormatString().equals("") || t_codeU.getText().equals("") ||
                t_prodU.getText().equals("") || t_purUPU.getText().equals("")|| t_sellUPU.getText().equals("")){
                ImageIcon err=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null, "Please input all  details","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }
            else{
                int P = JOptionPane.showConfirmDialog(null,"Do you want to UPDATE this new item?","CLICK COMPUTER SERVICES",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {
                    AS_prod ser=new AS_prod();

                    if( (ser.search_InCode(t_codeU.getText())==true) || (ser.search_InProd(t_prodU.getText())==true) )
                        JOptionPane.showMessageDialog(null,"This Code OR Product is already Exist ","Records",JOptionPane.INFORMATION_MESSAGE);

                    else{
                        String d=((JTextField)t_inDateU.getDateEditor().getUiComponent()).getText();

                        AS_prod as=new AS_prod();
                        as.update_InProd(d,t_codeU.getText(),t_prodU.getText(),t_purUPU.getText(),t_sellUPU.getText(),t_code.getText());

                        ImageIcon icon=new ImageIcon("edit2.png");
                        JOptionPane.showMessageDialog(null,"Item UPDATED Successfully ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);

                        ser.InReset(tab_rec);
                        t_codeU.setText("");
                        t_prodU.setText("");
                        t_purUPU.setText("");
                        t_sellUPU.setText("");
                        Calendar cal=new GregorianCalendar();
                        t_inDateU.setCalendar(cal);
                        cb_cat.setSelectedItem("                 NULL");
                        t_code.setText("");
                        t_prod.setText("");
                        t_stock.setText("");
                        t_purUP.setText("");
                        t_sellUP.setText("");
                        Calendar cale=new GregorianCalendar();
                        t_inDate.setCalendar(cale);
                    }
                }

            }
        }
        catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Updating item ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_b_updateActionPerformed

    private void b_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_b_updateMouseExited

    private void b_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_b_updateMouseEntered

    private void t_sellUPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_sellUPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPUActionPerformed

    private void t_sellUPUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellUPUKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_sellUPUKeyTyped

    private void t_sellUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_sellUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPActionPerformed

    private void t_sellUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_sellUPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sellUPKeyTyped

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

    private void t_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_stockKeyTyped

    }//GEN-LAST:event_t_stockKeyTyped

    private void t_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stockActionPerformed

    }//GEN-LAST:event_t_stockActionPerformed

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
            java.util.logging.Logger.getLogger(In_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(In_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(In_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(In_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new In_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_close;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_reset;
    private javax.swing.JButton b_ser1;
    private javax.swing.JButton b_serCode;
    private javax.swing.JButton b_update;
    private javax.swing.JComboBox<String> cb_cat;
    private javax.swing.JComboBox<String> cb_caty;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_invalid;
    private javax.swing.JLabel l_title;
    private javax.swing.JTextField t_code;
    private javax.swing.JTextField t_codeU;
    private com.toedter.calendar.JDateChooser t_inDate;
    private com.toedter.calendar.JDateChooser t_inDateU;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_prodU;
    private javax.swing.JTextField t_purUP;
    private javax.swing.JTextField t_purUPU;
    private javax.swing.JTextField t_sellUP;
    private javax.swing.JTextField t_sellUPU;
    private javax.swing.JTextField t_serPC;
    private javax.swing.JTextField t_stock;
    private javax.swing.JTable tab_rec;
    // End of variables declaration//GEN-END:variables
}
