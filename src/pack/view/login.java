/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pack.control.login_koneksi;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        JOptionPane = new javax.swing.JOptionPane();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 30, 40, 40);
        jPanel1.add(txtnama);
        txtnama.setBounds(250, 120, 170, 30);

        jLabel3.setFont(new java.awt.Font("KG Blank Space Solid", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 110, 170, 40);
        jPanel1.add(txtpass);
        txtpass.setBounds(250, 170, 170, 30);

        jLabel2.setFont(new java.awt.Font("KG Blank Space Solid", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 170, 160, 30);

        jButton17.setFont(new java.awt.Font("Porky's", 0, 18)); // NOI18N
        jButton17.setText("SIGN UP");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(60, 230, 120, 40);

        jButton18.setFont(new java.awt.Font("Porky's", 0, 18)); // NOI18N
        jButton18.setText("EXIT");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(210, 230, 110, 40);

        jButton1.setFont(new java.awt.Font("Porky's", 0, 18)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 230, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 550, 390);

        setSize(new java.awt.Dimension(536, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String username = txtnama.getText();
        String password = txtpass.getText();

        try {
            try (Statement statement = (Statement) login_koneksi.GetConnection().createStatement()) {
                statement.executeUpdate("insert into tb_akun(username, password) VALUES ('"+username+"','"+password+"');");
            }
            JOptionPane.showMessageDialog(null, "Selamat! Anda berhasil Sign Up!");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Mohon maaf, ulangi lagi prosedur");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection connection;
        PreparedStatement ps;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/toko?zeroDateTimeBehavior=convertToNull", "root", "");
            ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, txtnama.getText());
            ps.setString(2, txtpass.getText());
            ResultSet result =ps.executeQuery();
            if(result.next()){
                String user = txtnama.getText();
                new home(user).show();
                //perlu deklarasi user diclass utama.
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Salah!");
                txtpass.setText("");
                txtnama.requestFocus();
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Gagal!");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
