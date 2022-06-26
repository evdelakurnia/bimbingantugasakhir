package bimbingantugasakhir;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    private Connection koneksi;
    public Connection getKoneksi(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException ex){
	
	}
	try{
		koneksi = DriverManager.getConnection("jdbc:mysql://localhost/bimbingan_sbd","root","");
        }catch(SQLException ex){
			System.out.println("Koneksi gagal");
		}
	return koneksi;
	}
}
