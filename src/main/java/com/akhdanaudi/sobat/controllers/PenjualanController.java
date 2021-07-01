/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.controllers;

import com.akhdanaudi.sobat.database.PenjualanDataSource;
import com.akhdanaudi.sobat.models.DetailPenjualan;
import com.akhdanaudi.sobat.models.Penjualan;
import com.akhdanaudi.sobat.models.DetailPenjualan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhda
 */
public class PenjualanController {
    private PenjualanDataSource penjualanDataSource;
    private DefaultTableModel tableModel;
    private DefaultTableModel tableDetailModel;

    public PenjualanController() {
        penjualanDataSource = new PenjualanDataSource();
        initTable();
        loadTableData();
        initTableDetail();
    }
    
    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
    public DefaultTableModel getTableDetailModel() {
        return tableDetailModel;
    }
    
    private void initTable() {
        String columns[] = {"ID", "Nama Kustomer", "Total", "Tgl Penjualan"};
        tableModel = new DefaultTableModel(columns, 0);
    }
    
    public void loadTableData() {
        try {
            List<Penjualan> penjualanList = penjualanDataSource.getAllPenjualan();
            for (Penjualan penjualan : penjualanList) {
                addRowTable(penjualan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void addRowTable(Penjualan penjualan) {
        tableModel.addRow(new Object[] {
            penjualan.getId(),
            penjualan.getNamaKustomer(),
            penjualan.getTotal(),
            penjualan.getTanggalPembelian()
        });
    }
    
    public void loadTableDetailData(int idPenjualan) {
        try {
            List<Penjualan> penjualanList = penjualanDataSource.getAllPenjualan();
            for (Penjualan penjualan : penjualanList) {
                addRowTable(penjualan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> validateInput(String kode, String nama, String jenis, String harga, int stok) {
        ArrayList<String> message = new ArrayList<>();
        if (kode.isEmpty()) {
            message.add("Kode Kosong");
        }
        
        if (nama.isEmpty()) {
            message.add("Nama Kosong");
        }
        
        if (jenis.isEmpty()) {
            message.add("Jenis tidak dipilih");
        }
        
        if (harga.isEmpty()) {
            message.add("Harga tidak valid");
        }
        
        if (stok < 1) {
            message.add("Stok tidak boleh kosong");
        }
        
        return message;
    }
    
    public void saveToDatabase(String kode, String nama, int jenis, int harga, int stok) throws SQLException {
//        Obat obat = new Obat();
//        obat.setKodeObat(kode);
//        obat.setNamaObat(nama);
//        obat.setJenisObatId(jenis);
//        obat.setHargaObat(harga);
//        obat.setStokObat(stok);
//        obatDataSource.save(obat);
    }
    
    public void updateFromDatabase(String kode, String nama, int jenis, int harga, int stok, int id) throws SQLException {
//        Obat obat = new Obat();
//        obat.setId(id);
//        obat.setKodeObat(kode);
//        obat.setNamaObat(nama);
//        obat.setJenisObatId(jenis);
//        obat.setHargaObat(harga);
//        obat.setStokObat(stok);
//        obatDataSource.update(obat);
    }
    
    public void deleteFromDatabase(int id) throws SQLException {
//        obatDataSource.delete(id);
    }
    
    public int getJumlahPenjualan() {
        try {
          return penjualanDataSource.countPenjualan();
        } catch (SQLException e) {
          return 0;
        }
    }
    
    private void initTableDetail() {
        String columnsDetail[] = {"Obat", "Harga", "QTY"};
        tableDetailModel = new DefaultTableModel(columnsDetail, 0);
    }
    
    public int setDetail(int idPenjualan) {
        tableDetailModel.setRowCount(0);
        try {
            int total = 0;
            List<DetailPenjualan> detailPenjualanList = penjualanDataSource.getDetailPenjualan(idPenjualan);
            for (DetailPenjualan detail : detailPenjualanList) {
                addDetailRowTable(detail);
                total += detail.getObat().getHargaObat() * detail.getQty();
            }
            return total;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    private void addDetailRowTable(DetailPenjualan detail) {
        tableDetailModel.addRow(new Object[] {
            detail.getObat().getNamaObat(),
            detail.getObat().getHargaObat(),
            detail.getQty(),
        });
    }
}
