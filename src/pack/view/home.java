/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;
/**
 *
 * @author User
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home(String user) {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
        txtAdmin.setText(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Cari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Admin Toko : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 100, 30);

        txtAdmin.setEditable(false);
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });
        getContentPane().add(txtAdmin);
        txtAdmin.setBounds(110, 10, 140, 30);
        getContentPane().add(txtkode);
        txtkode.setBounds(170, 90, 250, 30);
        getContentPane().add(txtnama);
        txtnama.setBounds(170, 130, 250, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Baranglain" }));
        getContentPane().add(cbKategoriBrg);
        cbKategoriBrg.setBounds(170, 170, 250, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Plastik" }));
        cbjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenisActionPerformed(evt);
            }
        });
        getContentPane().add(cbjenis);
        cbjenis.setBounds(170, 210, 250, 30);
        getContentPane().add(txtharga);
        txtharga.setBounds(170, 250, 250, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 250, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Packaging");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 210, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kategori Barang");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 170, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama Barang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 130, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kode Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 90, 90, 30);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baranglain", "Minuman" }));
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(320, 300, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pencarian berdasarkan kategori barang : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 300, 280, 30);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori Barang", "Jenis Packaging", "Harga"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 380, 710, 130);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel9.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 30, 40, 40);

        Btn_Simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Simpan);
        Btn_Simpan.setBounds(480, 140, 110, 40);

        Btn_Ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Ubah.setText("UBAH");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ubah);
        Btn_Ubah.setBounds(590, 140, 110, 40);

        Btn_Bersih.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Bersih.setText("BERSIHKAN");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Bersih);
        Btn_Bersih.setBounds(480, 180, 110, 40);

        Btn_Hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Hapus);
        Btn_Hapus.setBounds(590, 180, 110, 40);

        Btn_Keluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Keluar);
        Btn_Keluar.setBounds(480, 220, 220, 40);

        Btn_Cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Cari.setText("CARI");
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cari);
        Btn_Cari.setBounds(590, 290, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("DATA BARANG DI TOKO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 40, 340, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 360);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(510, 30, 40, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 350, 780, 200);

        setSize(new java.awt.Dimension(772, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminActionPerformed

    private void cbjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjenisActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
         ctoko.Ubah();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
       ctoko.CariKategori();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CariActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel1MouseClicked

    public JTextField getTxtKode(){
    return txtkode;
    }
    public JTextField getTxtNama(){
    return txtnama;
    }
    public JTextField getTxtHarga(){
    return txtharga;
    }
    public JComboBox getCbKategori(){
    return cbKategoriBrg;
    }
    public JComboBox getCbJenis(){
    return cbjenis;
    }
    public JComboBox getCbCariKategori(){
    return CbCariKategori;
    }
    public JButton getButtonHapus(){
    return Btn_Hapus;
    }
    public JButton getButtonBersih(){
    return Btn_Bersih;
    }
    public JButton getButtonSimpan(){
    return Btn_Simpan;
    }
    public JButton getButtonUbah(){
    return Btn_Ubah;
    }
    public JButton getButtonKeluar(){
    return Btn_Keluar;
    }
    public JTable getTableData(){
    return Tabel1;
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
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

    
}
