/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.design;
import com.main.utility.DbConnection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import  java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.DriverManager;
import  java.sql.ResultSet;
import  java.sql.ResultSetMetaData;
import  java.sql.SQLException;
import  java.util.logging.Level;
import  java.util.logging.Logger;
import  javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;


import javax.swing.table.DefaultTableModel;
/**
 *
 * @author NIVEDITA BIRAJDAR
 */
public class worker extends javax.swing.JFrame {

    /**
     * Creates new form worker
     */
    

    public worker() {
        
        initComponents();
        table_update();
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        txtadress = new javax.swing.JTextField();
        btnaddworker = new javax.swing.JButton();
        btnupdateworker = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclearworker = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workertable = new javax.swing.JTable();
        btnprintworker = new javax.swing.JButton();
        btnbackworker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        searchByLab = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration"));
        jPanel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mobile no:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Adress:");

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobileKeyPressed(evt);
            }
        });

        txtadress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadressKeyPressed(evt);
            }
        });

        btnaddworker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addPeople.png"))); // NOI18N
        btnaddworker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddworkerActionPerformed(evt);
            }
        });

        btnupdateworker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editPeople.png"))); // NOI18N
        btnupdateworker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateworkerActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete item.png"))); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnclearworker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclearworker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearworkerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Name:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Add");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Update");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Delete");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Clear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnaddworker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnupdateworker, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclearworker, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmobile))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtname)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtadress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaddworker, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnupdateworker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndelete)
                        .addComponent(btnclearworker)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)))
                .addGap(55, 55, 55))
        );

        workertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "MobileNo", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workertable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnprintworker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnprintworker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printLarge.png"))); // NOI18N
        btnprintworker.setText("print");
        btnprintworker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintworkerActionPerformed(evt);
            }
        });

        btnbackworker.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbackworker.setText("Back");
        btnbackworker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackworkerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("WORKERS");

        btnrefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        searchByLab.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        searchByLab.setText("Search");

        searchTxt.setToolTipText("Search using Product Name, Brand Name OR Product Code");
        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnrefresh)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(searchByLab)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnprintworker)
                .addGap(18, 18, 18)
                .addComponent(btnbackworker)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnrefresh)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(searchByLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnprintworker)
                    .addComponent(btnbackworker, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateworkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateworkerActionPerformed
                                          
        // TODO add your handling code here:
        DefaultTableModel Df=(DefaultTableModel)workertable.getModel();
int selectedIndex = workertable.getSelectedRow();
Connection con1;
PreparedStatement insert ;
try {

int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString ());
String name = txtname.getText();
 String mobile = txtmobile.getText();
String address=txtadress.getText();
con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();

 insert = con1.prepareStatement("update workers set name=?,mobileno=?,address=? where id=?");

insert.setString(1, name);
insert.setString (2, mobile);
insert.setString(3, address);
insert.setInt (4, id);
insert.executeUpdate();
JOptionPane.showMessageDialog(this,"Record updatedd!!");
table_update();

}
catch(SQLException e){
    }
                          
    }//GEN-LAST:event_btnupdateworkerActionPerformed

    
    
    
    PreparedStatement insert;
    private void btnaddworkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddworkerActionPerformed
        // TODO add your handling code here:
        String name =txtname.getText();
 String mobile = txtmobile.getText();

String address = txtadress.getText();

try
{
 //Class.forName("com.mysqi.jdbc.Driver");
   com.mysql.jdbc.Connection  con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
//con1 = DriverManager.getConnection(   path       ):

insert=con1.prepareStatement ("insert into workers(name,mobileno,address)values(?,?,?)");
insert.setString(1,name);

insert.setString(2,mobile);


insert.setString(3,address);

            int executeUpdate = insert.executeUpdate(); 

JOptionPane.showMessageDialog(this,"Record Added.....!!!!!");
table_update();
txtname.setText("");
txtmobile.setText("");
txtadress.setText("");
txtname.requestFocus();


}
        

catch(SQLException ex) {

Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);


}
    }

private void table_update()
{
int c;
//Connection con;
try 
{
     com.mysql.jdbc.Connection  con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();
     insert = con1.prepareStatement("select * from workers");
     ResultSet rs =insert.executeQuery();
ResultSetMetaData Rss = rs.getMetaData();
c = Rss.getColumnCount();

DefaultTableModel Df;
    Df = (DefaultTableModel) workertable.getModel();
 Df.setRowCount(0);

while(rs.next ())
{

Vector v2 = new Vector();

for(int a=1; a<=c ; a++)
{

v2.add(rs.getString("id"));

v2.add(rs.getString("name"));

v2.add(rs.getString("mobileno"));

//v2.add(rs.getString("salary"));

//v2.add(rs.getString("leavecount"));
v2.add(rs.getString("address"));

}

 



Df.addRow(v2); 
}
}

catch(SQLException ex) {

Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);


}
        
        
        
        
    }//GEN-LAST:event_btnaddworkerActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnclearworkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearworkerActionPerformed
        // TODO add your handling code here:
        
       txtname.setText("");
       txtmobile.setText("");
       
       txtadress.setText("");
        
    }//GEN-LAST:event_btnclearworkerActionPerformed

    private void workertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workertableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)workertable.getModel();
 int selectedIndex = workertable.getSelectedRow();

txtname.setText(Df.getValueAt(selectedIndex, 1).toString()); 
txtmobile.setText(Df.getValueAt(selectedIndex, 2).toString());

txtadress.setText(Df.getValueAt(selectedIndex, 3).toString());
        
    }//GEN-LAST:event_workertableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)workertable.getModel();
 int selectedIndex = workertable.getSelectedRow();
Connection con1;
PreparedStatement insert;
try {

int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());

int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Record", "warning", JOptionPane.YES_NO_OPTION);

if (dialogResult == JOptionPane.YES_OPTION)
{

con1 = (com.mysql.jdbc.Connection) new DbConnection().getConnection();

insert = con1.prepareStatement("delete from workers where id=?");

insert.setInt(1,id);

insert.executeUpdate(); 



JOptionPane.showMessageDialog(this,"Record Update");

table_update();

txtname.setText("");
txtmobile.setText("");

txtadress.setText("");

txtname.requestFocus();

}

}

catch(SQLException ex) {

Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);


}
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnprintworkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintworkerActionPerformed
        // TODO add your handling code here:
        MessageFormat header =new MessageFormat("Report print");
        MessageFormat footer =new MessageFormat("Page 1");
try
{
workertable.print(JTable.PrintMode.NORMAL,header,footer);
}
catch(java.awt.print.PrinterException e)
{
System.err.format("Cannot print %s%n",e.getMessage());
}

        
    }//GEN-LAST:event_btnprintworkerActionPerformed

    private void btnbackworkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackworkerActionPerformed
        // TODO add your handling code here:
         
  new menu().setVisible(true); 
  close();
    }//GEN-LAST:event_btnbackworkerActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        String text=searchTxt.getText();
       // loadSearchProductsDatas(text);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
       char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c) )
        {
           txtname.setEditable(true);
            
    
        }
        else
        {
        JOptionPane.showMessageDialog(null," Please Enter valid Name.......");
            
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtmobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyPressed
  String telephone=txtmobile.getText();
        int length=telephone.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')
        {
            if(length<10)
            {
                txtmobile.setEditable(true);
            }else{
                txtmobile.setEditable(false);
            }
            
                    
                 
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE )
            {
                txtmobile.setEditable(true);
            }else{
                txtmobile.setEditable(false);
            }
        }

 // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileKeyPressed

    private void txtadressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadressKeyPressed
       char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c) )
        {
          txtadress.setEditable(true);
            
    
        }
        else
        {
        JOptionPane.showMessageDialog(null," Please Enter valid Address.......");
            
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtadressKeyPressed

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
            java.util.logging.Logger.getLogger(worker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(worker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(worker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(worker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new worker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddworker;
    private javax.swing.JButton btnbackworker;
    private javax.swing.JButton btnclearworker;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnprintworker;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdateworker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchByLab;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTable workertable;
    // End of variables declaration//GEN-END:variables
}
