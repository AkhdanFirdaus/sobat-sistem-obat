/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akhda
 */
public class Penjualan {
    private int id;
    private String namaKustomer;
    private List<DetailPenjualan> detailPenjualan;
    private int total;
    private String tglPembelian;
    
    public Penjualan() {
        detailPenjualan = new ArrayList<>();
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNamaKustomer() {
        return this.namaKustomer;
    }
    
    public void setNamaKustomer(String nama) {
        this.namaKustomer = nama;
    }
    
    public List getDetailPenjualan() {
        return this.detailPenjualan;
    }
    
    public void setTanggalPembelian(String tgl) {
        this.tglPembelian = tgl;
    }
    
    public void addAllDetailPenjualan(List<DetailPenjualan> detail) {
        this.detailPenjualan = detail;
    }
    
    public void addItemDetailPenjualan(DetailPenjualan item) {
        this.detailPenjualan.add(item);
    }
    
    public int getTotal() {
//        int total = 0;
//        for (DetailPenjualan item : detailPenjualan) {
//            total += item.subtotal();
//        }
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public String getTanggalPembelian() {
        return this.tglPembelian;
    }
}
