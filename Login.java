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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Login extends javax.swing.JFrame {
    private static String username,password,nama;
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public Login() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setResizable(false);
       
    }

    public void kosongkan(){
        Tuser.setText(null);
        Tpass.setText(null);
    }
 
    public void setusername(String namauser){
        Login.username = namauser;
    }
    public static String getusername(){
        return username;
    }
    public void setpassword(String pwd){
        Login.password = pwd;
    }
    public static String getpassword(){
        return password;
    }
     public void setnama(String nm){
        Login.nama = nm;
    }
    public static String getnama(){
        return nama;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tuser = new javax.swing.JTextField();
        show = new javax.swing.JLabel();
        Jdaftar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BLogin = new javax.swing.JButton();
        Breset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1023, 660));
        getContentPane().setLayout(null);
        getContentPane().add(Tpass);
        Tpass.setBounds(250, 590, 330, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Bimbingan Kerja Praktik");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 580, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/uty.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 100, 100);

        Tuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TuserActionPerformed(evt);
            }
        });
        getContentPane().add(Tuser);
        Tuser.setBounds(250, 540, 330, 40);

        show.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 0, 0));
        show.setText("Show");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(590, 600, 40, 17);

        Jdaftar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Jdaftar.setForeground(new java.awt.Color(255, 102, 102));
        Jdaftar.setText("Daftar");
        Jdaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JdaftarMouseClicked(evt);
            }
        });
        getContentPane().add(Jdaftar);
        Jdaftar.setBounds(918, 530, 60, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("NIM / NIP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 550, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 600, 80, 20);

        BLogin.setBackground(new java.awt.Color(255, 102, 102));
        BLogin.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BLogin.setForeground(new java.awt.Color(255, 255, 255));
        BLogin.setText("Login");
        BLogin.setBorderPainted(false);
        BLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BLogin);
        BLogin.setBounds(660, 560, 120, 50);

        Breset.setBackground(new java.awt.Color(255, 153, 153));
        Breset.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Breset.setForeground(new java.awt.Color(255, 255, 255));
        Breset.setText("Reset");
        Breset.setBorderPainted(false);
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });
        getContentPane().add(Breset);
        Breset.setBounds(800, 560, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 640);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 600, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 600, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 600, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 153));
        jLabel11.setText("Password");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 600, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TuserActionPerformed

    private void JdaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JdaftarMouseClicked
        new SignUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_JdaftarMouseClicked

    private void BLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginActionPerformed
        String user = Tuser.getText();
        String pass = new String (Tpass.getPassword());
        koneksi classKoneksi = new koneksi();
        
        if(user.equals("")||pass.equals("")){
             JOptionPane.showMessageDialog(null, "Mohon Isi Field Username & Password !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
            
                con = classKoneksi.getKoneksi();
                st = con.createStatement();
                rs=st.executeQuery("SELECT * FROM mahasiswa WHERE NIM = '"
                        +user+"' AND Password ='"+pass+"'");
                if(rs.next()){
                    
                    
                    rs = st.executeQuery("SELECT * FROM mahasiswa where NIM = '"+user+"'");
                        while(rs.next()){
                            username = rs.getString(1);
                            nama = rs.getString(2);
                    }
                    JOptionPane.showMessageDialog(null, "Selamat Datang mahasiswa : "
                        + "'"+nama+"' !!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    password = pass;
                    dispose();
                    new DasboardMaha().setVisible(true);
                    
                }else{
                    rs=st.executeQuery("SELECT * FROM dosen WHERE NIP = '"+user+"' AND Password ='"+pass+"'");
                    if(rs.next()){
                        
                        rs = st.executeQuery("SELECT * FROM dosen where NIP = '"+user+"'");
                        while(rs.next()){
                            username = rs.getString(1);
                            nama = rs.getString(2);
                        }
                        JOptionPane.showMessageDialog(null, "Selamat Datang dosen : "
                        +"'"+nama+"' !!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        password = pass;
                        dispose();
                        new DashboardDosen().setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Gagal login, user "
                           + "dan pass salah", "Warning", JOptionPane.WARNING_MESSAGE);
                    
                    } 
                }kosongkan();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_BLoginActionPerformed

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        kosongkan();
    }//GEN-LAST:event_BresetActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if (show.getText()=="Show") {
            Tpass.setEchoChar((char)0);
            show.setText("Hide");
        }
        else {
            Tpass.setEchoChar('*');
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLogin;
    private javax.swing.JButton Breset;
    private javax.swing.JLabel Jdaftar;
    private javax.swing.JPasswordField Tpass;
    private javax.swing.JTextField Tuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
