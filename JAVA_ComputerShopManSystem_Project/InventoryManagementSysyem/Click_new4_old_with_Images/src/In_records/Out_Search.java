/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_records;

import Classes.AS_prod;
import Menu.Menu;
import Menu.Sell_item;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahsan
 */
public class Out_Search extends javax.swing.JFrame {

    /**
     * Creates new form Upgrade
     */
    public Out_Search() {
        initComponents();
        
        setCentre();
        
        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.OutReset(tab_rec);
        
        l_title.setText("Total Record");
        
        //to prevent date from edit 
        uneditDate();
    }
    //to prevent date field to edit from keyboard:
    public void uneditDate() 
    {
        JTextFieldDateEditor edit;
        edit = (JTextFieldDateEditor) t_UpDate.getDateEditor();
        edit.setEditable(false);
        edit = (JTextFieldDateEditor) t_serDate.getDateEditor();
        edit.setEditable(false);
        edit = (JTextFieldDateEditor) t_minDate.getDateEditor();
        edit.setEditable(false);
        edit = (JTextFieldDateEditor) t_maxDate.getDateEditor();
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
    
    private void ProdCode_Ser_Action(){
        try{
            AS_prod ser=new AS_prod();

            if(t_serPC.getText().equals("")){
                ImageIcon icon=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null,"Enter Code Or Product to Search ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
            }
            
            else if(ser.search_OutCode(t_serPC.getText())==true){
                ser.Get_OutCdata(tab_rec, t_serPC.getText());

                ser.set_out((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP,t_sellUP,t_profit, t_serPC.getText());
            }
            else if(ser.search_OutProd(t_serPC.getText())==true){
                ser.Get_OutPdata(tab_rec, t_serPC.getText());

                ser.set_out((JTextField)t_UpDate.getDateEditor().getUiComponent(),t_code, t_prod, t_stock, t_purUP,t_sellUP,t_profit, t_serPC.getText());
            }
            else 
                JOptionPane.showMessageDialog(null, "Invalid Product or Code","CLICK COMPUTERS SERVICES",JOptionPane.WARNING_MESSAGE);
                
            switch (ser.search_OutCategory(t_code.getText())) {
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
            t_profit.setText(model.getValueAt(row , 6).toString());
            
            switch (ser.search_OutCategory(t_code.getText())) {
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
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_purUP = new javax.swing.JTextField();
        l_invalid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t_UpDate = new com.toedter.calendar.JDateChooser();
        t_sellUP = new javax.swing.JTextField();
        t_profit = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        b_reset = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_back = new javax.swing.JButton();
        l_title = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        t_serPC = new javax.swing.JTextField();
        b_serCode = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t_serDate = new com.toedter.calendar.JDateChooser();
        b_serDate = new javax.swing.JButton();
        b_serDDate = new javax.swing.JButton();
        t_minDate = new com.toedter.calendar.JDateChooser();
        t_maxDate = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        b_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_caty = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 3, 40), new java.awt.Color(222, 97, 15))); // NOI18N
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
        jScrollPane1.setBounds(430, 250, 790, 280);

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
        jLayeredPane1.add(t_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Code");
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Name");
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

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
        jLayeredPane1.add(t_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

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
        jLayeredPane1.add(t_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Stock Left");
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sell Unit Price");
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 30));

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
        jLayeredPane1.add(t_purUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, 30));

        l_invalid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l_invalid.setForeground(new java.awt.Color(222, 7, 46));
        jLayeredPane1.add(l_invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 30, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date");
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        t_UpDate.setBackground(new java.awt.Color(210, 217, 247));
        t_UpDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane1.add(t_UpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 30));

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
        jLayeredPane1.add(t_sellUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, 30));

        t_profit.setEditable(false);
        t_profit.setBackground(new java.awt.Color(224, 243, 251));
        t_profit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        t_profit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_profitActionPerformed(evt);
            }
        });
        t_profit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_profitKeyTyped(evt);
            }
        });
        jLayeredPane1.add(t_profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Profit");
        jLayeredPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Purchase Unit Price");
        jLayeredPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        jDesktopPane1.add(jLayeredPane1);
        jLayeredPane1.setBounds(10, 50, 410, 370);

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
        jLayeredPane3.add(b_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 40));

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
        jLayeredPane3.add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 110, 40));

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
        jLayeredPane3.add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 40));

        jDesktopPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(10, 420, 410, 110);

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
        l_title.setBounds(430, 220, 380, 30);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Harlow Solid Italic", 2, 30), new java.awt.Color(164, 224, 250))); // NOI18N
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
        jLayeredPane4.add(t_serPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, 30));

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
        jLayeredPane4.add(b_serCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Code/Prod");
        jLayeredPane4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date");
        jLayeredPane4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        t_serDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane4.add(t_serDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 170, 30));

        b_serDate.setBackground(new java.awt.Color(87, 150, 176));
        b_serDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_serDate.setForeground(new java.awt.Color(255, 255, 255));
        b_serDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser0 - Copy.png"))); // NOI18N
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
        jLayeredPane4.add(b_serDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 100, 30));

        b_serDDate.setBackground(new java.awt.Color(87, 150, 176));
        b_serDDate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        b_serDDate.setForeground(new java.awt.Color(255, 255, 255));
        b_serDDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser0 - Copy.png"))); // NOI18N
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
        jLayeredPane4.add(b_serDDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 100, 40));

        t_minDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane4.add(t_minDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, 30));

        t_maxDate.setDateFormatString("d-MM-yyyy");
        jLayeredPane4.add(t_maxDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Min Date");
        jLayeredPane4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Max Date");
        jLayeredPane4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 30));

        jDesktopPane1.add(jLayeredPane4);
        jLayeredPane4.setBounds(810, 50, 410, 200);

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
        b_close.setBounds(1185, 0, 45, 30);
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(600, 300, 300, 170);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(440, 90, 80, 40);

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
        cb_caty.setBounds(520, 90, 280, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ser55.png"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(910, 40, 270, 220);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-512 - Copy.png"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(20, 30, 490, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_serDDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serDDateActionPerformed

        try{
            if( t_maxDate.getDateFormatString().equals("") || t_minDate.getDateFormatString().equals("")){
                ImageIcon err=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null, "Please enter DATE Difference to Search","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }
            else{
                AS_prod ser=new AS_prod();

                String minD=((JTextField)t_minDate.getDateEditor().getUiComponent()).getText();
                String maxD=((JTextField)t_maxDate.getDateEditor().getUiComponent()).getText();
                
                ser.Get_OutDateDiff_Data(tab_rec, minD, maxD);
            }
        }catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Poblem in Searching Product by Date Difference ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }
    }//GEN-LAST:event_b_serDDateActionPerformed

    private void b_serDDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serDDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_serDDateMouseClicked

    private void b_serDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_serDateActionPerformed
        try{
            if(t_serDate.getDateFormatString().equals("")){
                ImageIcon err=new ImageIcon("war4.png");
                JOptionPane.showMessageDialog(null, "Please enter DATE to Search","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }
            else{
                AS_prod ser=new AS_prod();
                String date=((JTextField)t_serDate.getDateEditor().getUiComponent()).getText();

                if(ser.search_OutDate(date)==true)
                    ser.Get_OutDdata(tab_rec, date);
                else
                    JOptionPane.showMessageDialog(null, "Invalid Date","CLICK COMPUTERS SERVICES",JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Poblem in Searching Product by Date","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);        
        }
    }//GEN-LAST:event_b_serDateActionPerformed

    private void b_serDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_serDateMouseClicked

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

    private void cb_catKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_catKeyTyped

    }//GEN-LAST:event_cb_catKeyTyped

    private void t_codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_codeKeyTyped

    }//GEN-LAST:event_t_codeKeyTyped

    private void t_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_prodActionPerformed

    private void t_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_prodKeyTyped

    }//GEN-LAST:event_t_prodKeyTyped

    private void t_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_stockActionPerformed

    }//GEN-LAST:event_t_stockActionPerformed

    private void t_stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_stockKeyTyped

    }//GEN-LAST:event_t_stockKeyTyped

    private void t_purUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_purUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_purUPActionPerformed

    private void t_purUPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_purUPKeyTyped

    }//GEN-LAST:event_t_purUPKeyTyped

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed

        AS_prod as=new AS_prod();
        cb_caty.setSelectedItem("Total_Record");
        as.OutReset(tab_rec);

        cb_cat.setSelectedItem("                 NULL");
        t_serPC.setText("");
        t_code.setText("");
        t_prod.setText("");
        t_stock.setText("");
        t_purUP.setText("");
        t_sellUP.setText("");
        t_profit.setText("");
        t_UpDate.setCalendar(null);
        t_serDate.setCalendar(null);
        t_minDate.setCalendar(null);
        t_maxDate.setCalendar(null);
        l_title.setText("Total Record");
        l_invalid.setIcon(new ImageIcon(getClass().getResource("")));
    }//GEN-LAST:event_b_resetActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
                try{
            if( t_UpDate.getDateFormatString().equals("") || t_code.getText().equals("") || t_prod.getText().equals("") || 
                t_purUP.getText().equals("") ||t_sellUP.getText().equals("") ||t_profit.getText().equals("") ||
                t_stock.getText().equals("") || cb_cat.getSelectedItem().equals("                 NULL")){
                    ImageIcon err=new ImageIcon("war4.png");
                    JOptionPane.showMessageDialog(null, "Please input all  details","CLICK COMPUTER SERVICES",JOptionPane.INFORMATION_MESSAGE,err);
            }          
            else{
                
                int P = JOptionPane.showConfirmDialog(null," Do you want to DELETE this item?","CLICK COMPUTER SERVICES",JOptionPane.YES_NO_OPTION);
                if (P==0)
                {
                    AS_prod as=new AS_prod();
                    as.delete_OutProd(t_code.getText());
                    
                    ImageIcon icon=new ImageIcon("multimedia.png");
                    JOptionPane.showMessageDialog(null,"Item Dleted Successfully ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);  
                    
                    as.OutReset(tab_rec);

                    cb_cat.setSelectedItem("                 NULL");
                    t_code.setText("");
                    t_prod.setText("");
                    t_stock.setText("");
                    t_purUP.setText("");
                    t_sellUP.setText("");
                    t_profit.setText("");
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
        Menu s=new Menu();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_backActionPerformed

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

            if(ser.search_OutCode(t_serPC.getText())==true)
                ser.Get_OutCdata(tab_rec, t_serPC.getText());

            else if(ser.search_OutProd(t_serPC.getText())==true)
                ser.Get_OutPdata(tab_rec, t_serPC.getText());

        }catch(Exception e){
            ImageIcon icon=new ImageIcon("notify2.png");
            JOptionPane.showMessageDialog(null,"Exception ERROR, Problem in Record Display ","CLICK COMPUTERS SERVICES",JOptionPane.INFORMATION_MESSAGE,icon);
        }
    }//GEN-LAST:event_t_serPCKeyReleased

    private void cb_catyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_catyMouseClicked
        // TODO add your handling code here:
        AS_prod as=new AS_prod();

        String cat=(String)cb_caty.getSelectedItem();
        as.Disp_OutRecord(tab_rec, cat);

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
        as.Disp_OutRecord(tab_rec, cat);

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

    private void b_serCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_serCodeMouseClicked
     
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
        System.exit(0);
    }//GEN-LAST:event_b_closeActionPerformed

    private void tab_recKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_recKeyTyped
        char c=evt.getKeyChar();
        
        if(!(c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
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

    private void t_profitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_profitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_profitActionPerformed

    private void t_profitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_profitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_profitKeyTyped

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
            java.util.logging.Logger.getLogger(Out_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Out_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Out_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Out_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Out_Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_close;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_reset;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_invalid;
    private javax.swing.JLabel l_title;
    private com.toedter.calendar.JDateChooser t_UpDate;
    private javax.swing.JTextField t_code;
    private com.toedter.calendar.JDateChooser t_maxDate;
    private com.toedter.calendar.JDateChooser t_minDate;
    private javax.swing.JTextField t_prod;
    private javax.swing.JTextField t_profit;
    private javax.swing.JTextField t_purUP;
    private javax.swing.JTextField t_sellUP;
    private com.toedter.calendar.JDateChooser t_serDate;
    private javax.swing.JTextField t_serPC;
    private javax.swing.JTextField t_stock;
    private javax.swing.JTable tab_rec;
    // End of variables declaration//GEN-END:variables
}
