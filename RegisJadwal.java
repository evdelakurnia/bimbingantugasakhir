/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbingantugasakhir;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class RegisJadwal extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model;
    
    public RegisJadwal() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Regristrasi jadwal");
        this.setResizable(false);
        Login login = new Login();
        String nip = Login.getusername();
        String nama = Login.getnama();
        Lnama.setText(nama);
        Lnim.setText(nip);
        Bdaftar.setEnabled(false);
        String[] header = {"No","Id","NIP","Nama Dosen","Tanggal","Jam","Kuota"};
        model = new DefaultTableModel (header,0);
        tabel.setModel(model);
        tampil();
        Tid.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        Lnama = new javax.swing.JLabel();
        Lnim = new javax.swing.JLabel();
        Bdaftar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Bkembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1018, 641));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/imaha.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(457, 42, 100, 100);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(47, 176, 926, 292);

        Lnama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lnama.setForeground(new java.awt.Color(255, 51, 51));
        Lnama.setText("Nama");
        getContentPane().add(Lnama);
        Lnama.setBounds(614, 54, 247, 29);

        Lnim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lnim.setForeground(new java.awt.Color(255, 204, 204));
        Lnim.setText("nim");
        getContentPane().add(Lnim);
        Lnim.setBounds(614, 94, 222, 26);

        Bdaftar.setBackground(new java.awt.Color(255, 102, 102));
        Bdaftar.setForeground(new java.awt.Color(255, 255, 255));
        Bdaftar.setText("Daftar");
        Bdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdaftarActionPerformed(evt);
            }
        });
        getContentPane().add(Bdaftar);
        Bdaftar.setBounds(227, 479, 96, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Note : Harap dipikirkan sebelum mendaftar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 560, 260, 17);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        Bkembali.setBackground(new java.awt.Color(255, 102, 102));
        Bkembali.setForeground(new java.awt.Color(255, 255, 255));
        Bkembali.setText("Kembali");
        Bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkembaliActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Jadwal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked

        int row = tabel.getSelectedRow();
        String id = tabel.getValueAt(row,1).toString();
        String nip = tabel.getValueAt(row,2).toString();
        String nama = tabel.getValueAt(row,3).toString();
        String tanggal= tabel.getValueAt(row,4).toString();
        String port = tabel.getValueAt(row,5).toString();
        String kuota = tabel.getValueAt(row,6).toString();
        Tid.setText(id);
        Bdaftar.setEnabled(true);
    }//GEN-LAST:event_tabelMouseClicked

    private void BdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdaftarActionPerformed
      koneksi classKoneksi = new koneksi();
        String id = Tid.getText();
        String nim = Login.getusername();
        try{
                 con = classKoneksi.getKoneksi();
                 st = con.createStatement();
                 rs = st.executeQuery("SELECT * FROM regristrasi_jadwal WHERE Nim='"+nim+"' AND Id_jadwal ='"+id+"'");
                 int total=0;
                 while(rs.next()){
                     total = rs.getRow();
                 }
                 rs = st.executeQuery("SELECT * FROM jadwal_bimbingan WHERE Id_jadwal ='"+id+"'");
                 int kuota_sisa = 0;
                 while(rs.next()){
                     kuota_sisa = rs.getInt(6);
                 }
                 if(total>=1){
                     JOptionPane.showMessageDialog(null,"Anda sudah terdaftar !!","Alert",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(kuota_sisa<=0){
                     JOptionPane.showMessageDialog(null,"Kuota sudah habis !!","Alert",JOptionPane.ERROR_MESSAGE);
                 }
            
                 else{
                    st = con.createStatement();
                    st.executeUpdate("INSERT into regristrasi_jadwal values (null,"
                            + "'"+id+"','"+nim+"')");
                    rs= st.executeQuery("Select * from regristrasi_jadwal where Id_jadwal = '"+id+"'");
                    int id_jadwal = 0;
                    int id_reg = 0;
                    while(rs.next()){
                        id_reg = rs.getInt(1);
                        id_jadwal = rs.getInt(2);
                    }
                    rs= st.executeQuery("Select * from jadwal_bimbingan where Id_jadwal = '"+id_jadwal+"'");
                    String NIP = null;
                    String Tanggal = null;
                    String Port = null;
                    int kuota=0;
                    while(rs.next()){
                        NIP = rs.getString(2);
                        Tanggal = rs.getString(4);
                        Port = rs.getString(5);
                        kuota = rs.getInt(6);  
                    }
                    kuota = kuota - 1;
                    st.executeUpdate("Update jadwal_bimbingan set Kuota = '"+kuota+"' where Id_jadwal='"+id_jadwal+"'");
                    String judul = null;
                    rs= st.executeQuery("Select * from kerja_praktik where NIM = '"+nim+"'");
                    while(rs.next()){
                        judul = rs.getString(3); 
                    }
                    st.executeUpdate("INSERT into pelaksanaan_bimbingan values (null,"
                            + "'"+id_reg+"','"+id_jadwal+"','"+NIP+"','"+nim+"','"
                            +Tanggal+"','"+judul+"','"+Port+"')");                
                            JOptionPane.showMessageDialog(null, "Selamat, jadwal "
                                    + "Anda Berhasil Dibuat !!", "Success", 
                                    JOptionPane.INFORMATION_MESSAGE);
                 }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"jadwal anda gagal dibuat!"+
                    ex.getMessage(),"Alert",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
         
         new PelaksanaanBimbingan().setVisible(true);
         dispose();
    }//GEN-LAST:event_BdaftarActionPerformed

    private void BkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkembaliActionPerformed
      dispose();
       new DasboardMaha().setVisible(true);
    }//GEN-LAST:event_BkembaliActionPerformed

    public void tampil(){
        int jumlahrow = tabel.getRowCount();
        for(int n=0;n<jumlahrow;n++){
            model.removeRow(0);
        }
        koneksi classKoneksi = new koneksi();
        try{
            con = classKoneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM jadwal_bimbingan");
            int no = 1;
            while(rs.next()){
                String[] row= {Integer.toString(no),
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)};
                model.addRow(row);
                no++;
            }
        tabel.setModel(model);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(RegisJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdaftar;
    private javax.swing.JButton Bkembali;
    private javax.swing.JLabel Lnama;
    private javax.swing.JLabel Lnim;
    private javax.swing.JTextField Tid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
