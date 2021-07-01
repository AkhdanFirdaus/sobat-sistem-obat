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
public class JenisObat {
    private int id;
    private String nama;
    
    public int getJenisId() {
        return this.id;
    }
    
    public void setJenisId(int id) {
        this.id = id;
    }
    
    public String getNamaJenis() {
        return this.nama;
    }
    
    public void setNamaJenis(String nama) {
        this.nama = nama;
    }
}
