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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class SUMahasiswa extends javax.swing.JFrame {

        public Connection con;
        public Statement st;
        public ResultSet rs;
        
    public SUMahasiswa() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Sign Up Mahasiswa");
        this.setResizable(false);
        Cprodi.setSelectedItem("Fakultas Sains dan Teknologi");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tnim = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cjurusan = new javax.swing.JComboBox();
        Cprodi = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttempat = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tjudul = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Blogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Tpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Tsemester = new javax.swing.JTextField();
        Bdaftar = new javax.swing.JButton();
        Breset = new javax.swing.JButton();
        show = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1015, 687));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/imahasiswa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(700, 70, 150, 150);
        getContentPane().add(Tnim);
        Tnim.setBounds(160, 90, 356, 40);
        getContentPane().add(Tnama);
        Tnama.setBounds(160, 140, 356, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prodi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 190, 40, 22);
        getContentPane().add(Tusername);
        Tusername.setBounds(160, 312, 356, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 370, 74, 22);

        Cjurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CjurusanActionPerformed(evt);
            }
        });
        getContentPane().add(Cjurusan);
        Cjurusan.setBounds(160, 249, 356, 50);

        Cprodi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fakultas Sains dan Teknologi", "Ekonomi dan Bisnis Islam", "Adab dan Humaniora", "Syari'ah", "Dakwah dan Ilmu Komunikasi", "Tarbiyah dan Keguruan", "Ushuluddin dan Studi Agama" }));
        Cprodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CprodiActionPerformed(evt);
            }
        });
        getContentPane().add(Cprodi);
        Cprodi.setBounds(160, 193, 356, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 310, 80, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jurusan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 250, 61, 22);

        Ttempat.setColumns(20);
        Ttempat.setRows(5);
        jScrollPane1.setViewportView(Ttempat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(601, 448, 356, 96);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Judul");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(601, 273, 42, 22);

        Tjudul.setColumns(20);
        Tjudul.setRows(5);
        jScrollPane2.setViewportView(Tjudul);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(601, 306, 356, 96);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tempat");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(601, 408, 60, 22);

        Blogin.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        Blogin.setForeground(new java.awt.Color(255, 102, 102));
        Blogin.setText("Login");
        Blogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BloginMouseClicked(evt);
            }
        });
        getContentPane().add(Blogin);
        Blogin.setBounds(530, 590, 90, 33);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(580, 250, 400, 320);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIM");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Semester");

        Tsemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TsemesterKeyTyped(evt);
            }
        });

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

        show.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 0, 0));
        show.setText("Show");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Bdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(Breset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Tsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(show)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(Tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Tsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bdaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Breset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(40, 70, 520, 500);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Nama");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 140, 45, 22);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sudah punya akun?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void kosongkan(){
        Tnim.setText(null);
        Tnama.setText(null);
        Tpassword.setText(null);
        Tusername.setText(null);
        Tjudul.setText(null);
        Ttempat.setText(null);
        Tsemester.setText(null);
        Cprodi.setSelectedItem("Fakultas Sains dan Teknologi");

    }
    private void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukan Karakter Angka");
        }
    }
    
    private void BloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BloginMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_BloginMouseClicked

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        kosongkan();
    }//GEN-LAST:event_BresetActionPerformed

    private void CjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CjurusanActionPerformed
       
    }//GEN-LAST:event_CjurusanActionPerformed

    private void CprodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CprodiActionPerformed
        if(Cprodi.getSelectedItem()=="Fakultas Sains dan Teknologi"){
           Cjurusan.removeAllItems();
           Cjurusan.addItem("Matematika");
           Cjurusan.addItem("Sistem Informasi");
        }else if(Cprodi.getSelectedItem()=="Ekonomi dan Bisnis Islam"){
            Cjurusan.removeAllItems();
            Cjurusan.addItem(" Ekonomi Syariah");
            Cjurusan.addItem("Manajemen Perbankan Syariah");
            Cjurusan.addItem("Akuntansi Syariah");
            Cjurusan.addItem("Manajemen Bisnis Syariah");
            Cjurusan.addItem("Perbankan Syariah");
        }else if(Cprodi.getSelectedItem()=="Adab dan Humaniora"){
            Cjurusan.removeAllItems();
            Cjurusan.addItem("Bahasa dan Sastra Arab");
            Cjurusan.addItem("Sejarah Peradaban Islam");
            Cjurusan.addItem("Ilmu Perpustakaan");
            Cjurusan.addItem("Ilmu Perpustakaan dan Informasi Islam");
        }else if(Cprodi.getSelectedItem()=="Syari'ah"){
            Cjurusan.removeAllItems();
            Cjurusan.addItem("Hukum Keluarga (Al-Akhwal asy Syakhsiyah)");
            Cjurusan.addItem("Perbandingan Mazhab");
            Cjurusan.addItem("Hukum Tata Negara (Jinayah Siyasah)");
            Cjurusan.addItem("Hukum Ekonomi Syariah (Muamalah)");
        }else if(Cprodi.getSelectedItem()=="Dakwah dan Ilmu Komunikasi"){
            Cjurusan.removeAllItems();
            Cjurusan.addItem("Komunikasi dan Penyiaran Islam");
            Cjurusan.addItem("Bimbingan Konseling Islam");
            Cjurusan.addItem("Manajemen Dakwah");
            Cjurusan.addItem("Pengembangan Masyarakat Islam");
        }else if(Cprodi.getSelectedItem()=="Tarbiyah dan Keguruan"){
            Cjurusan.removeAllItems();
            Cjurusan.addItem("Pendidikan Agama Islam");
            Cjurusan.addItem("Pendidikan Bahasa Arab");
            Cjurusan.addItem("Manajemen Pendidikan Islam");
            Cjurusan.addItem("Tadris Matematika");
            Cjurusan.addItem("Tadris Bahasa Inggris");
            Cjurusan.addItem("Tadris IPA - Fisika");
            Cjurusan.addItem("Tadis IPS - Sejarah");
            Cjurusan.addItem("Pendidikan Guru Madrasah Ibtidaiyah");
            Cjurusan.addItem("Bimbingan dan Konseling Pendidikan Islam");
        }else{
            Cjurusan.removeAllItems();
            Cjurusan.addItem("Aqidah dan Filsafat Islam");
            Cjurusan.addItem("Ilmu Al-Qur’an dan Tafsir");
            Cjurusan.addItem("Studi Agama-Agama");
            Cjurusan.addItem("Ilmu Hadis");
            Cjurusan.addItem("Psikologi Islam");
        }
    }//GEN-LAST:event_CprodiActionPerformed

    private void BdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdaftarActionPerformed
        String nim= Tnim.getText();
        String nama = Tnama.getText();
        String prodi = (String)Cprodi.getSelectedItem();
        String jurusan = (String)Cjurusan.getSelectedItem();
        String username = Tusername.getText();
        String password = new String (Tpassword.getPassword());
        String tempat = Ttempat.getText();
        String judul = Tjudul.getText();
        String semester = Tsemester.getText();
        
        koneksi classKoneksi = new koneksi();
        if(nama.equals("")||username.equals("")||password.equals("")||nim.equals("")||
                tempat.equals("")||judul.equals("")||semester.equals("")){
            JOptionPane.showMessageDialog(null, "Mohon Isi Data dengan lengkap !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                con = classKoneksi.getKoneksi();
                st = con.createStatement();
                st.executeUpdate("INSERT into mahasiswa values ('"+nim+"','"
                    +nama+"','"+prodi+"','"+jurusan+"','"+semester+"','"+username+"','"+password+"')");
                st.executeUpdate("INSERT into kerja_praktik values (null,'"+nim+"','"
                    +judul+"','"+tempat+"')");
                        JOptionPane.showMessageDialog(null, "Selamat, Akun Anda Berhasil Dibuat !!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Langsung Login ?", "Question", JOptionPane.YES_NO_OPTION);
                        if (opsi == JOptionPane.YES_OPTION){
                            dispose();
                            new Login().setVisible(true);
                        }else{
                            new SUMahasiswa().setVisible(true);
                        }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Akun anda gagal dibuat!"+
                    ex.getMessage(),"Alert",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        kosongkan();       
    }//GEN-LAST:event_BdaftarActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if (show.getText()=="Show") {
            Tpassword.setEchoChar((char)0);
            show.setText("Hide");
        } 
        else {
            Tpassword.setEchoChar('*');
            show.setText("Show");
        }
    }//GEN-LAST:event_showMouseClicked

    private void TsemesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TsemesterKeyTyped
        filterhuruf(evt);
    }//GEN-LAST:event_TsemesterKeyTyped

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
            java.util.logging.Logger.getLogger(SUMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SUMahasiswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdaftar;
    private javax.swing.JLabel Blogin;
    private javax.swing.JButton Breset;
    private javax.swing.JComboBox Cjurusan;
    private javax.swing.JComboBox Cprodi;
    private javax.swing.JTextArea Tjudul;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnim;
    private javax.swing.JPasswordField Tpassword;
    private javax.swing.JTextField Tsemester;
    private javax.swing.JTextArea Ttempat;
    private javax.swing.JTextField Tusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
