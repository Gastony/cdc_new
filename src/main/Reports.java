/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
/**
 *
 * @author RTM
 */
public class Reports extends javax.swing.JPanel {

  
    public Reports() {
        initComponents();
        
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
        Export_jButton = new javax.swing.JButton();
        Print_jButton = new javax.swing.JButton();
        customer_jButton = new javax.swing.JButton();
        contract_jButton = new javax.swing.JButton();
        Cooler_jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        Export_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/export.png"))); // NOI18N
        Export_jButton.setText("Export");
        Export_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_jButtonActionPerformed(evt);
            }
        });

        Print_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Printer-16.png"))); // NOI18N
        Print_jButton.setText("Print");
        Print_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_jButtonActionPerformed(evt);
            }
        });

        customer_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/customer_person.png"))); // NOI18N
        customer_jButton.setText("Customer info");
        customer_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_jButtonActionPerformed(evt);
            }
        });

        contract_jButton.setText("Contracts");
        contract_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contract_jButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contract_jButtonMouseExited(evt);
            }
        });
        contract_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contract_jButtonActionPerformed(evt);
            }
        });

        Cooler_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Declined", "Pending", "Approved", "Delivered", "Defective" }));
        Cooler_jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cooler_jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customer_jButton)
                .addGap(18, 18, 18)
                .addComponent(Cooler_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contract_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(Print_jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Export_jButton)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cooler_jComboBox1)
                    .addComponent(contract_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Print_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Export_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customer_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_jButtonActionPerformed
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            PreparedStatement stmt1 = con.prepareStatement(" ALTER view loanCoolerView as select   *  , case when approved_by_asm = 0 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 0 and approved_by_rsm = 1 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 1 THEN 'APPROVED'else 'DECLINED' end cooler_status from loan_coooler");
int rs1 = stmt1.executeUpdate();
System.out.println(rs1+" records affected");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT doc_no,contract_no,outlet_name,outlet_owner,location,street,next_to,route,order_no,recomendations,cooler_status FROM loanCoolerView");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_customer_jButtonActionPerformed

    private void Export_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_jButtonActionPerformed
 try{
 
            Connection con = DBConn.myConn();
            Statement statement = con.createStatement();
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("CUSTOMER.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Customer Info");
            Row row1 = worksheet.createRow((short)0);
            row1.createCell(0).setCellValue("DOCUMENT NUMBER");
            row1.createCell(1).setCellValue("CONTRACT NUMBER");
             row1.createCell(2).setCellValue("OUTLET NAME");
              row1.createCell(3).setCellValue("OUTLET OWNER NAME");
               row1.createCell(4).setCellValue("LOCATION/AREA");
                  row1.createCell(5).setCellValue("STREET");
            row1.createCell(6).setCellValue("TO/NEXT TO");
             row1.createCell(7).setCellValue("ROUTE NAME");
              row1.createCell(8).setCellValue("EMPTIES");
               row1.createCell(9).setCellValue("ORDER(TWICE COOLER CAPACITY)");
                  row1.createCell(10).setCellValue("MOTIVATION");
            row1.createCell(11).setCellValue("REQUEST DATE");
             row1.createCell(12).setCellValue("STATUS");
              
              
            Row row2 ;
           PreparedStatement stmt1 = con.prepareStatement(" CREATE OR REPLACE view loanCoolerView as select   *  , case when approved_by_asm = 0 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 0 and approved_by_rsm = 1 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 1 THEN 'APPROVED'else 'DECLINED' end cooler_status from loan_coooler");
int rs1 = stmt1.executeUpdate();
System.out.println(rs1+" records affected");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT doc_no,contract_no,outlet_name,outlet_owner,location,street,next_to,route,empties,order_no,recomendations,request_date,cooler_status FROM loanCoolerView");
            
            while(rs.next()){
                int a = rs.getRow();
                row2 = worksheet.createRow((short)a);
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                row2.createCell(4).setCellValue(rs.getString(5));
                row2.createCell(5).setCellValue(rs.getString(6));
                row2.createCell(6).setCellValue(rs.getString(7));
                row2.createCell(7).setCellValue(rs.getString(8));
                row2.createCell(8).setCellValue(rs.getString(9));
                row2.createCell(9).setCellValue(rs.getString(10));
                row2.createCell(10).setCellValue(rs.getString(11));
                row2.createCell(11).setCellValue(rs.getString(12));
                row2.createCell(12).setCellValue(rs.getString(13));
               
                
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
            rs.close();
            statement.close();
            con.close();
             JOptionPane.showMessageDialog(null, "Records successful Exported");
           
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(IOException ioe){
            System.out.println(ioe);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Export_jButtonActionPerformed

    private void Print_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_jButtonActionPerformed
 MessageFormat header = new MessageFormat("Print Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
    try {
         jTable1.setShowGrid(true);
        jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
    } 
    catch (java.awt.print.PrinterAbortException e) {
    }   catch (PrinterException ex) {
            Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }//GEN-LAST:event_Print_jButtonActionPerformed

    private void contract_jButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contract_jButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_contract_jButtonMouseExited

    private void contract_jButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contract_jButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contract_jButtonMouseClicked

    private void contract_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contract_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contract_jButtonActionPerformed

    private void Cooler_jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cooler_jComboBox1ActionPerformed
 Object item = Cooler_jComboBox1.getSelectedItem();
                    if ("Declined".equals(item)) {
                       declined();
                    } else if ("Pending".equals(item)) {
                      pending();
                    }
                    else if ("Approved".equals(item)) {
                      approved();
                    }
                    else if ("Delivered".equals(item)) {
                       delivered();
                    }
                    else   {
                       defective();
                    }          // TODO add your handling code here:
    }//GEN-LAST:event_Cooler_jComboBox1ActionPerformed

    
private void declined(){
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner,outlet_name,outlet_no,street,next_to,request_date,reject_reason FROM loan_coooler l JOIN rejected_loan_cooler r ON l.ln_col_id = r.loan_cooler_id where approved_by_asm =2 OR approved_by_rsm=2");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        } 

}
    
    private void pending(){
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner,outlet_no,next_to,sales_rep_id,request_date FROM loan_coooler where approved_by_asm =0 OR approved_by_rsm=0");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        } 

}

    private void approved(){
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT outlet_owner,outlet_no,next_to,sales_rep_id,request_date FROM loan_coooler where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=0");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        } 

}
    
    private void delivered(){
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT v.cooler_sn, l.cooler_type,l.serial_no,outlet_no,outlet_name,location,street FROM vtrack_release_info v  JOIN loan_coooler l ON v.request_id = l.ln_col_id WHERE is_delivered=1");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        } 

}
    
    private void defective(){
try {
    jTable1.setShowGrid(true);
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_name,outlet_no,street,near_to,cooler_type,date_of_repair,repairedby FROM cooler_maintenance");
            
            // get columns info
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
                                           DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
headerRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
            // Close ResultSet and Statement
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        } 

}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cooler_jComboBox1;
    private javax.swing.JButton Export_jButton;
    private javax.swing.JButton Print_jButton;
    private javax.swing.JButton contract_jButton;
    private javax.swing.JButton customer_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}