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
public class DetailPenjualan {
    private int id;
    private Obat obat;
    private int qty;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Obat getObat() {
        return this.obat;
    }
    
    public void setObat(Obat obat) {
        this.obat = obat;
    }
    
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public int subtotal() {
        return this.obat.getHargaObat() * this.qty;
    }
}
