/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbingantugasakhir;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
public class KelolaJadwal extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model;
    
    public KelolaJadwal() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Kelola Jadwal");
        this.setResizable(false);
        Login login = new Login();
        String nip = Login.getusername();
        String nama = Login.getnama();
        Lnama.setText(nama);
        Lnip.setText(nip);
        String[] header = {"No","id","Tanggal & Waktu","jam","Kuota"};
        model = new DefaultTableModel (header,0);
        tabel.setModel(model);
        tampil();
        Bedit.setEnabled(false);
        Bhapus.setEnabled(false);
        Tid.setEnabled(false);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Twaktu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Lnip = new javax.swing.JLabel();
        Lnama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bedit = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        Breset = new javax.swing.JButton();
        Btambah = new javax.swing.JButton();
        Tid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Bcari = new javax.swing.JButton();
        Tcari = new javax.swing.JTextField();
        Tkuota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tport = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1018, 638));
        getContentPane().setLayout(null);

        Twaktu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TwaktuKeyTyped(evt);
            }
        });
        getContentPane().add(Twaktu);
        Twaktu.setBounds(360, 143, 331, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Kelola Jadwal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 214, 44);

        Lnip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lnip.setForeground(new java.awt.Color(255, 255, 255));
        Lnip.setText("Nip");
        getContentPane().add(Lnip);
        Lnip.setBounds(78, 336, 160, 17);

        Lnama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lnama.setForeground(new java.awt.Color(255, 204, 204));
        Lnama.setText("Nama");
        getContentPane().add(Lnama);
        Lnama.setBounds(78, 296, 121, 22);

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
        jScrollPane1.setBounds(78, 383, 882, 229);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/daftarjadwal.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(78, 128, 150, 154);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Jadwal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 50, 56, 17);

        Bedit.setBackground(new java.awt.Color(255, 102, 102));
        Bedit.setForeground(new java.awt.Color(255, 255, 255));
        Bedit.setText("Edit");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        getContentPane().add(Bedit);
        Bedit.setBounds(787, 196, 151, 45);

        Bhapus.setBackground(new java.awt.Color(255, 102, 102));
        Bhapus.setForeground(new java.awt.Color(255, 255, 255));
        Bhapus.setText("Hapus");
        Bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhapusActionPerformed(evt);
            }
        });
        getContentPane().add(Bhapus);
        Bhapus.setBounds(787, 247, 151, 45);

        Breset.setBackground(new java.awt.Color(255, 102, 102));
        Breset.setForeground(new java.awt.Color(255, 255, 255));
        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });
        getContentPane().add(Breset);
        Breset.setBounds(787, 298, 151, 45);

        Btambah.setBackground(new java.awt.Color(255, 102, 102));
        Btambah.setForeground(new java.awt.Color(255, 255, 255));
        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });
        getContentPane().add(Btambah);
        Btambah.setBounds(787, 145, 151, 45);
        getContentPane().add(Tid);
        Tid.setBounds(360, 80, 330, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal (YYYY-MM-DD)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 120, 144, 17);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ex.(2021-12-31)");

        Bcari.setBackground(new java.awt.Color(255, 102, 102));
        Bcari.setForeground(new java.awt.Color(255, 255, 255));
        Bcari.setText("Cari");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });

        Tkuota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TkuotaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kuota Mahasiswa");

        Tport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TportKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam (Hour : Minute : Second)");

        jLabel3.setText("Ex. (23:59:00)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tport, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(329, 329, 329))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Tkuota, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(Tport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(Tkuota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void kosongkan(){
        Twaktu.setText(null);
        Tkuota.setText(null);
        Tport.setText(null);
    }
    private void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukan Karakter Angka");
        }
    }
    
    public void tampil(){
        int jumlahrow = tabel.getRowCount();
        for(int n=0;n<jumlahrow;n++){
            model.removeRow(0);
        }
        koneksi classKoneksi = new koneksi();
        try{
            String nip = Login.getusername();
            con = classKoneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM jadwal_bimbingan where NIP "
                    + "= '"+nip+"'");
            int no = 1;
            while(rs.next()){
                String[] row= {Integer.toString(no),
                    rs.getString(1),
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
    
    
    
    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        Tid.setEnabled(false);
        String nip = Login.getusername();
        String nama = Login.getnama();
        String tanggal = Twaktu.getText();
        String kuota = Tkuota.getText();
        String port = Tport.getText();
        koneksi classKoneksi = new koneksi();
        if(tanggal.equals("")||kuota.equals("")||port.equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Isi Data dengan lengkap "
                    + "!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                con = classKoneksi.getKoneksi();
                st = con.createStatement();
                st.executeUpdate("INSERT into jadwal_bimbingan values (null,"
                        + "'"+nip+"','"+nama+"','"+tanggal+"','"+port+"','"+
                        kuota+"')");
                        JOptionPane.showMessageDialog(null, "Selamat, jadwal "
                                + "Anda Berhasil Dibuat !!", "Success", 
                                JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"jadwal anda gagal dibuat!"+
                    ex.getMessage(),"Alert",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        kosongkan();
        tampil();
    }//GEN-LAST:event_BtambahActionPerformed

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        kosongkan();
    }//GEN-LAST:event_BresetActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed

        String id = Tid.getText();
        String nip = Login.getusername();
        String nama = Login.getnama();
        String tanggal = Twaktu.getText();
        String kuota = Tkuota.getText();
        String port = Tport.getText();
         try{
            st.executeUpdate("UPDATE JADWAL_BIMBINGAN set Tanggal='"+tanggal+"',jam"
                    + "='"+port+"',Kuota='"+kuota+"'WHERE Id_jadwal='"+id+"'");
            JOptionPane.showMessageDialog(null,"Anda berhasil mengubah jadwaL!",
                    "Alert",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Anda GAGAL mengubah jadwal!",
                    "Alert",JOptionPane.ERROR_MESSAGE);
        }
        kosongkan();
        tampil();
    }//GEN-LAST:event_BeditActionPerformed

    private void BhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhapusActionPerformed
        String id = Tid.getText();
        try{
            st.executeUpdate("DELETE FROM jadwal_bimbingan where Id_jadwal= '"+id+"'");
            JOptionPane.showMessageDialog(null, "Anda berhasil menghapus jadwal",
                    "Alert",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Anda gagal menghapus jadwal",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        kosongkan();
        tampil();
    }//GEN-LAST:event_BhapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        Bedit.setEnabled(true);
        Bhapus.setEnabled(true);
        int row = tabel.getSelectedRow();
        String id = tabel.getValueAt(row,1).toString();
        String tanggal= tabel.getValueAt(row,2).toString();
        String port = tabel.getValueAt(row,3).toString();
        String kuota = tabel.getValueAt(row,4).toString();
        Tid.setText(id);
        Twaktu.setText(tanggal);
        Tport.setText(port);
        Tkuota.setText(kuota);
    }//GEN-LAST:event_tabelMouseClicked

    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
       int jumlahrow = tabel.getRowCount();
        for(int n=0;n<jumlahrow;n++){
            model.removeRow(0);
        }

        koneksi classKoneksi = new koneksi();
        String ket = Tcari.getText();
        if(ket.equals("")){
             JOptionPane.showMessageDialog(null,"Masukkan data!","Error",
                     JOptionPane.ERROR_MESSAGE);
             tampil();
        }else{
 
            try{
               Login login = new Login();
               String nip = Login.getusername();
                con = classKoneksi.getKoneksi();
                st = con.createStatement();
                rs = st.executeQuery("SELECT * FROM jadwal_bimbingan WHERE (Id_jadwal LIKE '%"
                        +ket+"%' OR Tanggal LIKE '%"+ket+"%'"
                        +" OR jam LIKE '%"+ket+"%' OR Kuota LIKE '%"
                        +ket+"%') AND NIP = '"+nip+"'");
                int no = 1;
                int total=0;
                while(rs.next()){
                    String[] row= {Integer.toString(no),
                        rs.getString(1),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)};
                        model.addRow(row);
                        total = rs.getRow();
                        no++;
                }
                
                
                 if(total==0){
                     JOptionPane.showMessageDialog(null,"Tidak menemukan data !","Error",
                     JOptionPane.ERROR_MESSAGE);
                     tampil();
                 }else{
                     JOptionPane.showMessageDialog(null, "Didapatkan "+total+" Hasil Pencarian", "Success", 
                                    JOptionPane.INFORMATION_MESSAGE);
                     tabel.setModel(model);
                 }
  
                 
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        } 
    }//GEN-LAST:event_BcariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new DashboardDosen().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TkuotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TkuotaKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_TkuotaKeyTyped

    private void TportKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TportKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_TportKeyTyped

    private void TwaktuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TwaktuKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_TwaktuKeyTyped

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
            java.util.logging.Logger.getLogger(KelolaJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Breset;
    private javax.swing.JButton Btambah;
    private javax.swing.JLabel Lnama;
    private javax.swing.JLabel Lnip;
    private javax.swing.JTextField Tcari;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tkuota;
    private javax.swing.JTextField Tport;
    private javax.swing.JTextField Twaktu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}