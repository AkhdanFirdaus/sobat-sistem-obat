/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.database;

import com.akhdanaudi.sobat.models.Penjualan;
import com.akhdanaudi.sobat.models.DetailPenjualan;
import com.akhdanaudi.sobat.models.Obat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.OptionalInt;

/**
 *
 * @author akhda
 */
public class PenjualanDataSource {
    public void saveDetail(List<DetailPenjualan> detail, int idPenjualan) throws SQLException {
        String query = "INSERT INTO penjualan_detail (id_penjualan, id_obat, qty) VALUES (?, ?, ?)";
        Connection koneksi = Koneksi.getKoneksi();
        for (DetailPenjualan item : detail) {
            PreparedStatement preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setInt(1, idPenjualan);
            preparedStatement.setInt(2, item.getObat().getId());
            preparedStatement.setInt(3, item.getQty());
            preparedStatement.executeUpdate();
        }
    }
    
    public void save(Penjualan penjualan) throws SQLException {
        String query = "INSERT INTO penjualan(nama, total, tgl_pembelian) VALUES (?, ?, ?)";
        Connection koneksi = Koneksi.getKoneksi();
        PreparedStatement preparedStatement = koneksi.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, penjualan.getNamaKustomer());
        preparedStatement.setInt(2, penjualan.getTotal());
        preparedStatement.setString(3, penjualan.getTanggalPembelian());
        preparedStatement.executeUpdate();
        
        ResultSet result = preparedStatement.getGeneratedKeys();
        int idPenjualan = 0;
        if (result.next()) {
            idPenjualan = result.getInt(1);
            saveDetail(penjualan.getDetailPenjualan(), idPenjualan);
        }
        
    }
    
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM penjualan WHERE id=?";
        Connection koneksi = Koneksi.getKoneksi();
        PreparedStatement preparedStatement = koneksi.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
    
    public List<Penjualan>  getAllPenjualan() throws SQLException {
        String query = "SELECT * FROM penjualan";
        Connection koneksi = Koneksi.getKoneksi();
        ResultSet result = koneksi.createStatement().executeQuery(query);
        List<Penjualan> listPenjualan = new ArrayList<>();
        while (result.next()) {
            Penjualan penjualan = new Penjualan();
            penjualan.setId(result.getInt("id"));
            penjualan.setNamaKustomer(result.getString("nama_kustomer"));
            penjualan.setTotal(result.getInt("total"));
            penjualan.setTanggalPembelian(result.getString("tgl_pembelian"));
//            OptionalInt tempid = IntStream.range(0, listPenjualan.size())
//                    .filter(i -> i == listPenjualan.get(i).getId())
//                    .findFirst();
            
            listPenjualan.add(penjualan);
        }
        return listPenjualan;
    }
    
    public List<DetailPenjualan> getDetailPenjualan(int id) throws SQLException {
        String query = "SELECT penjualan_detail.id AS id_detail, obat.*, penjualan_detail.qty "
                + "FROM penjualan_detail "
                + "INNER JOIN obat ON obat.id = penjualan_detail.id_obat "
                + "WHERE penjualan_detail.id_penjualan = "
                + id;
        Connection koneksi = Koneksi.getKoneksi();
        Statement statement = koneksi.createStatement();
        ResultSet result = statement.executeQuery(query);
        
        List<DetailPenjualan> listDetailPenjualan = new ArrayList<>();
        while(result.next()) {
            Obat obat = new Obat();
            obat.setId(result.getInt("id"));
            obat.setKodeObat(result.getString("kode_obat"));
            obat.setNamaObat(result.getString("nama_obat"));
            obat.setJenisObatId(result.getInt("jenis_obat_id"));
            obat.setHargaObat(result.getInt("harga_obat"));
            obat.setStokObat(result.getInt("stok_obat"));
            
            DetailPenjualan detail = new DetailPenjualan();
            detail.setId(result.getInt("id"));
            detail.setObat(obat);
            detail.setQty(result.getInt("qty"));
            
            listDetailPenjualan.add(detail);
        }
        return listDetailPenjualan;
    }
    
    public int countPenjualan() throws SQLException {
        String query = "SELECT COUNT(*) AS jmlPenjualan FROM penjualan";
        Connection koneksi = Koneksi.getKoneksi();
        ResultSet result = koneksi.createStatement().executeQuery(query);
        int count = 0;
        while (result.next()) {
            count = result.getInt("jmlPenjualan");
        }
        return count;
    }
}
