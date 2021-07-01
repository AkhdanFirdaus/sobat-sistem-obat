/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.models;

/**
 *
 * @author akhda
 */
public class Obat {
    private int id;
    private String kodeObat;
    private String namaObat;
    private int jenisObatId;
    private String jenisObatNama;
    private int hargaObat;
    private int stokObat;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getKodeObat() {
        return this.kodeObat;
    }
    
    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }
    
    public String getNamaObat() {
        return this.namaObat;
    }
    
    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }
    
    public int getJenisObatId() {
        return this.jenisObatId;
    }
    
    public void setJenisObatId(int jenisObatId) {
        this.jenisObatId = jenisObatId;
    }
    
    public String getJenisObatNama() {
        return this.jenisObatNama;
    }
    
    public void setJenisObatNama(String jenisObatNama) {
        this.jenisObatNama = jenisObatNama;
    }
    
    public int getHargaObat() {
        return this.hargaObat;
    }
    
    public void setHargaObat(int hargaObat) {
        this.hargaObat = hargaObat;
    }
    
    public int getStokObat() {
        return this.stokObat;
    }
    
    public void setStokObat(int stokObat) {
        this.stokObat = stokObat;
    }
}
