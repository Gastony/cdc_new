/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 * @author RTM
 */
public class Update extends javax.swing.JPanel {

    
    public Update() {
        initComponents();
        Fillcombo();//methods for listing all cooler serial availablenon combobox
        generateGatepass(12);
      Fillinfo();
    
 
  

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        outletName_jLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CoolerTag_jTextField = new javax.swing.JTextField();
        OutletTag_jTextField = new javax.swing.JTextField();
        CoolerType_jTextField = new javax.swing.JTextField();
        OutletName_jLabel = new javax.swing.JLabel();
        Update_jButton = new javax.swing.JButton();
        Location_jTextField = new javax.swing.JTextField();
        OutletName_jTextField = new javax.swing.JTextField();
        CustomerName_jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        OutletNumber_jTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CoolerAssetnumber_jTextField = new javax.swing.JTextField();
        Serial_combobox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Gate_pass_jTextField = new javax.swing.JTextField();

        jLabel1.setText("Customer Name");

        jLabel2.setText("Location");

        jLabel3.setText("Outlet Name");

        jLabel4.setText("Cooler Tag");

        jLabel5.setText("Outlet Tag");

        jLabel6.setText("Serial Number");

        jLabel7.setText("Cooler Type");

        CoolerTag_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoolerTag_jTextFieldActionPerformed(evt);
            }
        });

        OutletTag_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutletTag_jTextFieldActionPerformed(evt);
            }
        });

        Update_jButton.setText("Update");
        Update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jButtonActionPerformed(evt);
            }
        });

        Location_jTextField.setEditable(false);

        OutletName_jTextField.setEditable(false);

        CustomerName_jTextField.setEditable(false);

        jLabel9.setText("Outlet Number");

        OutletNumber_jTextField.setEditable(false);

        jLabel10.setText("Cooler Asset Number");

        jLabel11.setText("Gate pass");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outletName_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                    .addComponent(OutletName_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CoolerTag_jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(CoolerAssetnumber_jTextField)
                                            .addComponent(CoolerType_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(Serial_combobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Gate_pass_jTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(46, 46, 46))))
                            .addComponent(Update_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OutletTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OutletNumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Location_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OutletName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(60, 60, 60)
                                    .addComponent(CustomerName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(0, 581, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CustomerName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutletName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(OutletName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Location_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outletName_jLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OutletNumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutletTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Serial_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoolerTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CoolerType_jTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CoolerAssetnumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gate_pass_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(Update_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jButtonActionPerformed
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
            System.out.println("No button clicked");
        } else if (response == JOptionPane.YES_OPTION) {
            try {
                String value1=OutletTag_jTextField.getText();
          
                String value3=CoolerTag_jTextField.getText();
                String value4=CoolerType_jTextField.getText();
                String value5=CoolerAssetnumber_jTextField.getText();
                String value6=Serial_combobox.getSelectedItem().toString();
                String value7=Gate_pass_jTextField.getText();
                String str= CustomerName_jTextField.getText();
                Connection con = DBConn.myConn();
                PreparedStatement stmt = con.prepareStatement("UPDATE loan_coooler SET outlet_tag=? ,cooler_type=?,serial_no=?,approved_by_contlr=1 WHERE outlet_owner=?");
                stmt.setString(1, value1);
            
                stmt.setString(2, value4);
                stmt.setString(3, value6);
                stmt.setString(4, str);

                int rs = stmt.executeUpdate();

                PreparedStatement stmt2 = con.prepareStatement("UPDATE coolers SET cooler_tag=? ,cooler_asset_number=?,is_rented =1 WHERE cooler_sn = ?");
                stmt2.setString(1, value3);


                stmt2.setString(2, value5);
                stmt2.setString(3, value6);
                PreparedStatement stmt3 = con.prepareStatement("INSERT INTO vtrack_release_info(cooler_sn,gate_pass,request_id,release_date) VALUES(?,?,(SELECT  ln_col_id FROM loan_coooler WHERE outlet_owner=?),curdate()) ");
                stmt3.setString(1, value6);
                stmt3.setString(2, value7);
                stmt3.setString(3, str);
                int rs3 = stmt3.executeUpdate();

                int rs2 = stmt2.executeUpdate();
                System.out.println(rs+" records affected");
                System.out.println(rs2+" records affected");
                System.out.println(rs3+" records affected");

                con.close();
                OutletTag_jTextField.setText("");
                
                CoolerTag_jTextField.setText("");
                CoolerType_jTextField.setText("");
                CoolerAssetnumber_jTextField.setText("");
               

                JOptionPane.showMessageDialog(null, "Records successful updated");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, ex.getMessage(), WIDTH, null);
            }
        } else if (response == JOptionPane.CLOSED_OPTION) {
            System.out.println("JOptionPane closed");
        }
        
 Serial_combobox.removeItemAt(0);
                Fillcombo();//methods for listing all cooler serial available on combobox
        generateGatepass(12);
      Fillinfo();// TODO add your handling code here:
    }//GEN-LAST:event_Update_jButtonActionPerformed

    private void OutletTag_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutletTag_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutletTag_jTextFieldActionPerformed

    private void CoolerTag_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoolerTag_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoolerTag_jTextFieldActionPerformed
private void Fillcombo(){
try{
String sql = "SELECT * FROM coolers WHERE is_rented=0";
Connection con = DBConn.myConn();
PreparedStatement pst;
    pst = con.prepareStatement(sql);
ResultSet rs = pst.executeQuery();
while(rs.next()){
String name = rs.getString("cooler_sn");
Serial_combobox.addItem(name);

}

}
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
}

}

String generateGatepass(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(AlphaNumericString.length()* Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
  String gatepass = sb.toString(); 
Gate_pass_jTextField.setText(gatepass);
        return gatepass; 

    }

private void Fillinfo(){

  try {
    
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner,outlet_name,outlet_no,location FROM loan_coooler where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=0");
        if(rs.next()) { 
        String customer = rs.getString("outlet_owner");
        CustomerName_jTextField.setText(customer);
        String outlet = rs.getString("outlet_name");
        OutletName_jTextField.setText(outlet);
        String location = rs.getString("location");
        Location_jTextField.setText(location);
        String outletNo = rs.getString("outlet_no");
        OutletNumber_jTextField.setText(outletNo);
        
    }
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoolerAssetnumber_jTextField;
    private javax.swing.JTextField CoolerTag_jTextField;
    private javax.swing.JTextField CoolerType_jTextField;
    private javax.swing.JTextField CustomerName_jTextField;
    private javax.swing.JTextField Gate_pass_jTextField;
    private javax.swing.JTextField Location_jTextField;
    private javax.swing.JLabel OutletName_jLabel;
    private javax.swing.JTextField OutletName_jTextField;
    private javax.swing.JTextField OutletNumber_jTextField;
    private javax.swing.JTextField OutletTag_jTextField;
    private javax.swing.JComboBox<String> Serial_combobox;
    private javax.swing.JButton Update_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outletName_jLabel;
    // End of variables declaration//GEN-END:variables
}
