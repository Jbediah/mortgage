/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author prime
 */
public class closing extends javax.swing.JFrame {
    
    
    String sno;
    String cdate;
    String ramount;
    String comment;
    String True="true";
    String Mod="yes";
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    /**
     * Creates new form closing
     */
    public closing() {
         con=sql_connection.ConnectDB();
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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label4 = new java.awt.Label();
        button1 = new java.awt.Button();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        label5 = new java.awt.Label();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 153, 153));
        label1.setFont(new java.awt.Font("Cambria", 0, 40)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 255, 0));
        label1.setText("Close Account");
        jInternalFrame1.getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 400, 80));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        label2.setText("Returned Amount");
        jInternalFrame1.getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 310, 40));

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 400, 30));

        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 400, 30));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        label3.setText("Serial Number");
        jInternalFrame1.getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 40));

        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 400, 30));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        label4.setText("Close Date");
        jInternalFrame1.getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 310, 40));

        button1.setBackground(new java.awt.Color(0, 204, 153));
        button1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Go Back");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 50));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jInternalFrame1.getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 400, 40));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        label5.setText("Comment");
        jInternalFrame1.getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 310, 40));

        button2.setBackground(new java.awt.Color(0, 153, 153));
        button2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        button2.setForeground(new java.awt.Color(153, 255, 102));
        button2.setLabel("Close Account");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        jInternalFrame1.getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 170, 50));

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1510, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 860));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        
        
        new welcome().setVisible(true);
                super.dispose();  
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
   
        
        sno=textField2.getText();
        int i=Integer.valueOf(sno);
        
        ramount=textField1.getText();
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
             cdate = sdf.format(jDateChooser1.getDate());
            
            
            comment=textField3.getText();
            
        String SQL="update  lent set closed='True' , c_date='"+cdate+"' , c_amount='"+ramount+"' , c_comment='"+comment+"' where serial ='"+i+"' ";
                 
             try{
           
           pst=con.prepareStatement(SQL);
            
             pst.execute();
             JOptionPane.showMessageDialog(null ,"Closed Successfully !");
             
             
 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null ,e);
            
            
        }
      
    }//GEN-LAST:event_button2MouseClicked

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
            java.util.logging.Logger.getLogger(closing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(closing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(closing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(closing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new closing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
