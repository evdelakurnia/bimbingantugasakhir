/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbingantugasakhir;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class SUDosen extends javax.swing.JFrame {

        public Connection con;
        public Statement st;
        public ResultSet rs;
        
    public SUDosen() {
        
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        this.setLocationRelativeTo(null);
        this.setTitle("Sign Up Dosen");
        this.setResizable(false);
    }

     public void kosongkan(){
        Tnip.setText(null);
        Tnama.setText(null);
        Tpassword.setText(null);
        Tusername.setText(null);
        Tjabatan.removeAllItems();
        Tjabatan.setSelectedItem("Dosen Tetap");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Blogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Tnip = new javax.swing.JTextField();
        show = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Tusername = new javax.swing.JTextField();
        Tjabatan = new javax.swing.JComboBox();
        Bdaftar = new javax.swing.JButton();
        Breset = new javax.swing.JButton();
        Tpassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 638));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/idosen.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(707, 154, 150, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sudah punya akun?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(684, 388, 156, 22);

        Blogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Blogin.setForeground(new java.awt.Color(255, 153, 153));
        Blogin.setText("LOGIN");
        Blogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BloginMouseClicked(evt);
            }
        });
        getContentPane().add(Blogin);
        Blogin.setBounds(787, 421, 53, 22);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("DOSEN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(723, 322, 117, 48);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIP");

        show.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 0, 0));
        show.setText("Show");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jabatan");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        Tjabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dosen Tetap", "Dosen Honor" }));

        Bdaftar.setBackground(new java.awt.Color(255, 102, 102));
        Bdaftar.setForeground(new java.awt.Color(255, 255, 255));
        Bdaftar.setText("Daftar");
        Bdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdaftarActionPerformed(evt);
            }
        });

        Breset.setBackground(new java.awt.Color(255, 153, 153));
        Breset.setForeground(new java.awt.Color(255, 255, 255));
        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tpassword)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Breset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(Tusername)
                    .addComponent(Tjabatan, 0, 352, Short.MAX_VALUE)
                    .addComponent(Tnama)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(Tnip)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(show)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tnip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Breset, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(Bdaftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(149, 101, 414, 480);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdaftarActionPerformed
        String nip = Tnip.getText();
        String nama = Tnama.getText();
        String jabatan = (String)Tjabatan.getSelectedItem();
        String username = Tusername.getText();
        String password = new String (Tpassword.getPassword());
        koneksi classKoneksi = new koneksi();
        if(nama.equals("")||username.equals("")||password.equals("")||nip.equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Isi Data dengan lengkap !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                con = classKoneksi.getKoneksi();
                st = con.createStatement();
                st.executeUpdate("INSERT into dosen values ('"+nip+"','"
                    +nama+"','"+jabatan+"','"+username+"','"+password+"')");
                        JOptionPane.showMessageDialog(null, "Selamat, Akun Anda Berhasil Dibuat !!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Langsung Login ?", "Question", JOptionPane.YES_NO_OPTION);
                        if (opsi == JOptionPane.YES_OPTION){
                            dispose();
                            new Login().setVisible(true);
                        }else{
                            new SUDosen().setVisible(true);
                        }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Akun anda gagal dibuat!"+
                    ex.getMessage(),"Alert",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        kosongkan();       
    }//GEN-LAST:event_BdaftarActionPerformed

    private void BloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloginMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_BloginMouseClicked

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        kosongkan();
    }//GEN-LAST:event_BresetActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if ("Show".equals(show.getText())) {
            Tpassword.setEchoChar((char)0);
            show.setText("Hide");
        } 
        else {
            Tpassword.setEchoChar('*');
            show.setText("Show");
        }
    }//GEN-LAST:event_showMouseClicked

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
            java.util.logging.Logger.getLogger(SUDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SUDosen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdaftar;
    private javax.swing.JLabel Blogin;
    private javax.swing.JButton Breset;
    private javax.swing.JComboBox Tjabatan;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnip;
    private javax.swing.JPasswordField Tpassword;
    private javax.swing.JTextField Tusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
