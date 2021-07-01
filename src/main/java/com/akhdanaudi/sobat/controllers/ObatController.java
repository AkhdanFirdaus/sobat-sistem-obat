/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.controllers;

import com.akhdanaudi.sobat.database.ObatDataSource;
import com.akhdanaudi.sobat.models.JenisObat;
import com.akhdanaudi.sobat.models.Obat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhda
 */
public class ObatController {
    private ObatDataSource obatDataSource;
    private DefaultTableModel tableModel;

    public ObatController() {
        obatDataSource = new ObatDataSource();
        initTable();
        loadTableData();
    }
    
    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    
    private void initTable() {
        String columns[] = {"ID", "Kode", "Nama", "Jenis", "Harga", "Stok"};
        tableModel = new DefaultTableModel(columns, 0);
    }
    
    public void loadTableData() {
        try {
            List<Obat> obatList = obatDataSource.getAllObat();
            for (Obat obat : obatList) {
                addRowTable(obat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void addRowTable(Obat obat) {
        tableModel.addRow(new Object[] {
            obat.getId(),
            obat.getKodeObat(),
            obat.getNamaObat(),
            obat.getJenisObatNama(),
            obat.getHargaObat(),
            obat.getStokObat()
        });
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
        Obat obat = new Obat();
        obat.setKodeObat(kode);
        obat.setNamaObat(nama);
        obat.setJenisObatId(jenis);
        obat.setHargaObat(harga);
        obat.setStokObat(stok);
        obatDataSource.save(obat);
    }
    
    public void updateFromDatabase(String kode, String nama, int jenis, int harga, int stok, int id) throws SQLException {
        Obat obat = new Obat();
        obat.setId(id);
        obat.setKodeObat(kode);
        obat.setNamaObat(nama);
        obat.setJenisObatId(jenis);
        obat.setHargaObat(harga);
        obat.setStokObat(stok);
        obatDataSource.update(obat);
    }
    
    public void deleteFromDatabase(int id) throws SQLException {
        obatDataSource.delete(id);
    }
    
    public int getJumlahObat() {
        try {
          return obatDataSource.countObat();
        } catch (SQLException e) {
          return 0;
        }
    }
    
    public List<JenisObat> getJenisObat() {
        try {
          return obatDataSource.getJenisObat();
        } catch (SQLException e) {
          return new ArrayList<>();
        }
    }
}
