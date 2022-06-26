/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbingantugasakhir;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class PelaksanaanBimbingan extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model;
    
    public PelaksanaanBimbingan() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Pelaksanaan Bimbingan");
        this.setResizable(false);
        Login login = new Login();
        String nim = Login.getusername();
        String nama = Login.getnama();
        Lnama.setText(nama);
        Lnim.setText(nim);
        String[] header = {"No", "NIP","Nama Dosen", "NIM","Nama Mahasiswa", "Tanggal","Judul", "Jam"};
        model = new DefaultTableModel (header,0);
        tabel.setModel(model);
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lnim = new javax.swing.JLabel();
        Lnama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        Bkembali = new javax.swing.JButton();
        Bcetak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1025, 632));
        setPreferredSize(new java.awt.Dimension(1025, 632));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/ibimbingan.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(434, 59, 100, 100);

        Lnim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lnim.setForeground(new java.awt.Color(255, 102, 102));
        Lnim.setText("NIP/NIM");
        getContentPane().add(Lnim);
        Lnim.setBounds(100, 70, 223, 29);

        Lnama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lnama.setText("Nama");
        getContentPane().add(Lnama);
        Lnama.setBounds(100, 120, 223, 22);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 190, 961, 340);

        Bkembali.setBackground(new java.awt.Color(255, 102, 102));
        Bkembali.setForeground(new java.awt.Color(255, 255, 255));
        Bkembali.setText("Kembali");
        Bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Bkembali);
        Bkembali.setBounds(30, 540, 114, 42);

        Bcetak.setBackground(new java.awt.Color(255, 102, 102));
        Bcetak.setForeground(new java.awt.Color(255, 255, 255));
        Bcetak.setText("Cetak");
        Bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcetakActionPerformed(evt);
            }
        });
        getContentPane().add(Bcetak);
        Bcetak.setBounds(150, 540, 104, 42);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(4, 4, 1020, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkembaliActionPerformed
        koneksi classKoneksi = new koneksi();
        try {
            Login login = new Login();
            String nim = Login.getusername();
            con = classKoneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM pelaksanaan_bimbingan where NIM = '"+nim+"'");
            if (rs.next()) {
                new DasboardMaha().setVisible(true);
                dispose();
            } else {
                new DashboardDosen().setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_BkembaliActionPerformed

    private void BcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcetakActionPerformed
        try {
            tabel.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Jadwal Bimbingan"), null);
        } catch (PrinterException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_BcetakActionPerformed

    public void tampil(){
        int jumlahrow = tabel.getRowCount();
        for(int n=0;n<jumlahrow;n++){
            model.removeRow(0);
        }
        koneksi classKoneksi = new koneksi();
        try{
            Login login = new Login();
            String nim = Login.getusername();
            con = classKoneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT pelaksanaan_bimbingan.NIP,\n" +
                                    "dosen.Nama,\n" +
                                    "pelaksanaan_bimbingan.NIM,\n" +
                                    "mahasiswa.Nama,\n" +
                                    "pelaksanaan_bimbingan.Tanggal,\n" +
                                    "pelaksanaan_bimbingan.Judul,\n" +
                                    "pelaksanaan_bimbingan.jam\n" +
                                    "FROM pelaksanaan_bimbingan INNER JOIN dosen ON pelaksanaan_bimbingan.NIP=dosen.NIP \n" +
                                    "INNER JOIN mahasiswa ON pelaksanaan_bimbingan.NIM = mahasiswa.NIM \n" +
                                    "WHERE pelaksanaan_bimbingan.NIM = '"+nim+"' OR pelaksanaan_bimbingan.NIP = '"+nim+"'");
            int no = 1;
            while(rs.next()){
                String[] row= {Integer.toString(no),
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                };
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
            java.util.logging.Logger.getLogger(PelaksanaanBimbingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelaksanaanBimbingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelaksanaanBimbingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelaksanaanBimbingan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelaksanaanBimbingan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcetak;
    private javax.swing.JButton Bkembali;
    private javax.swing.JLabel Lnama;
    private javax.swing.JLabel Lnim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
