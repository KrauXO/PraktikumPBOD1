/*
 *  File        : MysqlMahasiswaService.java
 *  Deskripsi   : menyediakan layanan untuk program utama
*/
package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    private Connection koneksi = null;

    // Constructor 
    public MysqlMahasiswaService(){
        this.koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs){
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs){
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    public void delete(int id){
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil data by id: " + e.getMessage());
        }
        return null;
    }

    public List<Mahasiswa> getAll(){
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (Statement s = koneksi.createStatement();
             ResultSet rs = s.executeQuery(query)) {
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil semua data: " + e.getMessage());
        }
        return listMhs;
    }
    
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            java.sql.Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Indeks tabel mahasiswa berhasil di-reset ke 1.");
        } catch (java.sql.SQLException e) {
            System.err.println("Gagal mereset indeks: " + e.getMessage());
        }
    }
    
    public boolean isEmpty() {
        String query = "SELECT COUNT(*) AS total FROM mahasiswa";
        try {
            java.sql.Statement stmt = koneksi.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                return rs.getInt("total") == 0;
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Gagal memeriksa status tabel: " + e.getMessage());
        }
        return true; 
    }
    
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ke database berhasil ditutup.");
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Gagal menutup koneksi database: " + e.getMessage());
        }
    }
}