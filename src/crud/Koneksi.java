///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package crud;
//import java.sql.*;
///**
// *
// * @author MyPC
// */
//public class Koneksi {
//
//    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost/data_perpustakaan1";
//    static final String USER = "root";
//    static final String PASS = "";
//
//    static Connection conn;
//    static Statement stmt;
//    static ResultSet rs;
//
//    public static void main(String[] args) {
//        
//        // Melakukan koneksi ke database
//        // harus dibungkus dalam blok try/catch
//        try {
//            // register driver yang akan dipakai
//            Class.forName(JDBC_DRIVER);
//            
//            // buat koneksi ke database
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            
//            // buat objek statement
//            stmt = conn.createStatement();
//            
//            // buat query ke database
//            String sql = "SELECT * FROM t_perpus1";
//            
//            // eksekusi query dan simpan hasilnya di obj ResultSet
//            rs = stmt.executeQuery(sql);
//            
//            // tampilkan hasil query
//            while(rs.next()){
//                String gb ="";
//                if (rs.getInt("genre_buku") == 1){
//                    gb = "Fiksi";
//                }
//                if (rs.getInt("genre_buku") == 2){
//                    gb = "Non-Fiksi";
//                }
//                System.out.println("No Buku : " + rs.getInt("no_buku"));
//                System.out.println("Judul Buku : " + rs.getString("judul_buku"));
//                System.out.println("Genre Buku : " + gb);
//                System.out.println("Pengarang : " + rs.getString("pengarang"));
//                System.out.println("Penerbit : " + rs.getString("penerbit"));
//                System.out.println("Tahun Terbit : " + rs.getString("tahun_terbit"));
//                System.out.println("Tahun Masuk : " + rs.getString("tahun_masuk"));
//            }
//                
//            stmt.close();
//            conn.close();
//            
//        } catch (ClassNotFoundException | SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    static Object getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Koneksi {
    Connection con;
    Statement stm;
    static Connection Koneksi;
    public static Connection getConnection(){
        try{
                Koneksi= DriverManager.getConnection("jdbc:mysql://localhost/data_perpustakaan1","root","");
            }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");
            }
        return Koneksi;
    }
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/data_perpustakaan1", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }

}