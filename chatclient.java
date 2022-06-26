/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimbingantugasakhir;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 7
 */
public class chatclient extends javax.swing.JFrame implements Runnable{
     public Connection con;
    public Statement st;
    public ResultSet rs;
    Socket client;
    ServerSocket server;
    BufferedReader server_reader, client_reader;
    BufferedWriter server_writer, client_writer;
    
    /**
     * Creates new form latCS
     */
    public chatclient() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Gambar/uty.png");
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("ChitChat : Mahasiswa");
        this.setResizable(false);
        txtuser.setEditable(false);
        String nama = Login.getnama();
       
        txtuser.setText(nama);
    }
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    private int getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");  
        Date date1 = new Date();  
        dateFormat.format(date1).toString();
         String[] hourMin = dateFormat.format(date1).toString().split(":");
         int hour = Integer.parseInt(hourMin[0]);
        return hour;
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
        btnConnect = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        listmessage = new java.awt.List();
        txtmessage = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConnect.setText("Hubungkan");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        txtuser.setText("username");

        txtmessage.setText("message");

        btnsend.setText("kirim");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        bkembali.setText("Kembali");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listmessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bkembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConnect))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmessage, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsend)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnect)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsend))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        if (btnConnect.getText().equals("Hubungkan")) {
            btnConnect.setText("Putuskan");
            client_connection();
            Thread thread = new Thread(this);
            thread.start();
        }  else if(btnConnect.getText().equals("Putuskan")){
            disconnected_by_client();
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        try {
            server_writer.write(txtuser.getText() + ": "+ txtmessage.getText());
            server_writer.newLine();
            server_writer.flush();
        } catch (IOException e) {
            Logger.getLogger(chatclient.class.getName()).log(Level.SEVERE, null, e);
        }
        listmessage.add("Me : "+txtmessage.getText());
        txtmessage.setText("");
    }//GEN-LAST:event_btnsendActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        // TODO add your handling code here:
        new DasboardMaha().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkembaliActionPerformed
     private void client_connection()  {
         try {
             String nim = Login.getusername();
             String  ip_address = JOptionPane.showInputDialog("Masukan Alamat IP :");
             
             if(ip_address.equals("localhost") || ip_address.equals("127.0.0.1")){
                 koneksi classKoneksi = new koneksi();
                 con = classKoneksi.getKoneksi();
                 st = con.createStatement();
                 rs = st.executeQuery("select * from pelaksanaan_bimbingan WHERE NIM='"+nim+"'");
                 String waktu =null;
                 String tgl =null;
                 int hour=0;
                 SimpleDateFormat dateFormat= new SimpleDateFormat("HH:mm:ss");
                 while(rs.next()){
                      waktu = dateFormat.format(rs.getDate(8)).toString();
                      String[] hourMin = waktu.split(":");
                        hour = Integer.parseInt(hourMin[0]);
                      tgl = rs.getString(6);   
                 }
                 if(tgl.equals(getTanggal())){
                     if(hour <= getWaktu()){
                         client = new Socket (ip_address, 2000);
                            server_reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                            server_writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                            btnConnect.setText("Putuskan");
                     }else{
                         JOptionPane.showMessageDialog(null, "Hari ini tidak ada jam pelaksanaan bimbingan  !!", "Warning", JOptionPane.WARNING_MESSAGE);
                        dispose();
                        new chatclient().setVisible(true);
                     }
                          
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Hari ini tidak ada tanggal pelaksanaan bimbingan  !!", "Warning", JOptionPane.WARNING_MESSAGE);
                    dispose();
                    new chatclient().setVisible(true);

                 }
                
                 
                 
             }
             else{
                 JOptionPane.showMessageDialog(null, "IP harus localhost atau (127.0.0.1) !!", "Warning", JOptionPane.WARNING_MESSAGE);
                 dispose();
                 new chatclient().setVisible(true);
             }
             
         } catch (UnknownHostException e) {
             System.err.println("Akses data server gagal");
             System.exit(-1);
         }catch (IOException e){
             Logger.getLogger(chatclient.class.getName()).log(Level.SEVERE, null, e);
         }
         catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     }
     private void read_connection() {
         try {
             try {
                 try {
                     server = new ServerSocket(2000);
                     this.setTitle("Mohon tunggu sebentar");
                 } catch (IOException e) {
                     System.err.println("Gagal membuat server");
                     System.exit(-1);
                 }
                 client = server.accept();
                 this.setTitle("terhubung ke "+client.getInetAddress());
             } catch (IOException e) {
                 System.err.println("Akses ke server ditolak!");
                 System.exit(-1);
             }
             server_reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
             server_writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
         } catch (IOException e) {
            System.err.println("Tidak dapat membaca pesan");
            
         }
     }
     private void disconnected_by_client(){
         try {
            client.close();
            server_reader.close();
            server_writer.close();
            
            btnConnect.setText("Hubungkan");
         } catch (IOException e) {
             Logger.getLogger(chatclient.class.getName()).log(Level.SEVERE, null, e);
         }
     }
     private void stopped_by_server (){
         try {
             server_reader.close();
             server_writer.close();
             btnConnect.setText("ON");
             this.setTitle("Terputus!");
         } catch (Exception e) {
             Logger.getLogger(chatclient.class.getName()).log(Level.SEVERE, null, e);
         }
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
            java.util.logging.Logger.getLogger(chatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkembali;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnsend;
    private javax.swing.JPanel jPanel1;
    private java.awt.List listmessage;
    private javax.swing.JTextField txtmessage;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {            
            try {
                listmessage.add(server_reader.readLine());
            } catch (Exception e) {
                Logger.getLogger(chatclient.class.getName()).log(Level.SEVERE,null, e);
            }
        }
    }
}