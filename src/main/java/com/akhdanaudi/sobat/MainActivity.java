/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat;

import com.akhdanaudi.sobat.controllers.ViewController;
import com.akhdanaudi.sobat.database.Koneksi;
import java.sql.SQLException;

/**
 *
 * @author akhda
 */
public class MainActivity {
    public static void main(String[] args) {
        testKoneksi();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewController viewController = new ViewController();
                viewController.initView();
            }
        });
    }
    
    private static void testKoneksi() {
        try {
            Koneksi.getKoneksi();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal");
        }
    }
}
