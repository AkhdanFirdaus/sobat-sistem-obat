/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.database;

import com.akhdanaudi.sobat.models.JenisObat;
import com.akhdanaudi.sobat.models.Obat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akhda
 */
public class ObatDataSource {
    public void save(Obat obat) throws SQLException {
        String query = "INSERT INTO obat(kode_obat, nama_obat, jenis_obat_id, harga_obat, stok_obat) VALUES (?, ?, ?, ?, ?)";
        Connection koneksi = Koneksi.getKoneksi();
        PreparedStatement preparedStatement = koneksi.prepareStatement(query);
        preparedStatement.setString(1, obat.getKodeObat());
        preparedStatement.setString(2, obat.getNamaObat());
        preparedStatement.setInt(3, obat.getJenisObatId());
        preparedStatement.setInt(4, obat.getHargaObat());
        preparedStatement.setInt(5, obat.getStokObat());
        preparedStatement.executeUpdate();
    }
    
    public void update(Obat obat) throws SQLException {
        String query = "UPDATE obat SET kode_obat=?, nama_obat=?, jenis_obat_id=?, harga_obat=?, stok_obat=? WHERE id=?";
        Connection koneksi = Koneksi.getKoneksi();
        PreparedStatement preparedStatement = koneksi.prepareStatement(query);
        preparedStatement.setString(1, obat.getKodeObat()); 
        preparedStatement.setString(2, obat.getNamaObat());
        preparedStatement.setInt(3, obat.getJenisObatId());
        preparedStatement.setInt(4, obat.getHargaObat());
        preparedStatement.setInt(5, obat.getStokObat());
        preparedStatement.setInt(6, obat.getId());
        preparedStatement.executeUpdate();
    }
    
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM obat WHERE id=?";
        Connection koneksi = Koneksi.getKoneksi();
        PreparedStatement preparedStatement = koneksi.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
    
    public List<Obat>  getAllObat() throws SQLException {
        String query = "SELECT obat.*, obat_jenis.jenis_nama "
                + "FROM obat "
                + "INNER JOIN obat_jenis ON obat_jenis.id = obat.jenis_obat_id";
        Connection koneksi = Koneksi.getKoneksi();
        ResultSet result = koneksi.createStatement().executeQuery(query);
        List<Obat> listObat = new ArrayList<>();
        while (result.next()) {
            Obat obat = new Obat();
            obat.setId(result.getInt("obat.id"));
            obat.setKodeObat(result.getString("obat.kode_obat"));
            obat.setNamaObat(result.getString("obat.nama_obat"));
            obat.setJenisObatId(result.getInt("obat.jenis_obat_id"));
            obat.setJenisObatNama(result.getString("obat_jenis.jenis_nama"));
            obat.setHargaObat(result.getInt("obat.harga_obat"));
            obat.setStokObat(result.getInt("obat.stok_obat"));
            listObat.add(obat);
        }
        return listObat;
    }
    
    public int countObat() throws SQLException {
        String query = "SELECT COUNT(*) AS jmlObat FROM obat";
        Connection koneksi = Koneksi.getKoneksi();
        ResultSet result = koneksi.createStatement().executeQuery(query);
        int count = 0;
        while (result.next()) {
            count = result.getInt("jmlObat");
        }
        return count;
    }
    
    
    public List<JenisObat> getJenisObat() throws SQLException {
        String query = "SELECT * FROM obat_jenis";
        Connection koneksi = Koneksi.getKoneksi();
        ResultSet result = koneksi.createStatement().executeQuery(query);
        List<JenisObat> listJenisObat = new ArrayList<>();
        while (result.next()) {
            JenisObat jenis = new JenisObat();
            jenis.setJenisId(result.getInt("id"));
            jenis.setNamaJenis(result.getString("jenis_nama"));
            listJenisObat.add(jenis);
        }
        return listJenisObat;
    }
}
