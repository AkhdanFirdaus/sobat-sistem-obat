/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.views;

import com.akhdanaudi.sobat.controllers.ObatController;
import com.akhdanaudi.sobat.controllers.PenjualanController;
import com.akhdanaudi.sobat.controllers.ViewController;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.Box;

/**
 *
 * @author akhda
 */
public class MenuView extends javax.swing.JPanel {
    ViewController controller;
    ObatController obatController;
    PenjualanController penjualanController;

    /**
     * Creates new form HomeView
     * @param controller
     * @param jumlahObat
     */
    public MenuView(ViewController controller, ObatController obatController, PenjualanController penjualanController) {
        initComponents();
        this.controller = controller;
        this.obatController = obatController;
        this.penjualanController = penjualanController;
        loadJumlahObat();
        loadJumlahPenjualan();
    }
    
    public void loadJumlahObat() {
        int jumlahObat = obatController.getJumlahObat();
        jumlah_obat_lbl.setText(String.valueOf(jumlahObat));
    }
    
    public void loadJumlahPenjualan() {
        int jumlahPenjualan = penjualanController.getJumlahPenjualan();
        jumlah_penjualan_lbl.setText(String.valueOf(jumlahPenjualan));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        refresh_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        menu_items = new javax.swing.JPanel();
        menu_obat = new javax.swing.JPanel();
        jumlah_obat_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_penjual = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        menu_laporan = new javax.swing.JPanel();
        jumlah_penjualan_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 40, 40, 40));
        setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 0, 30, 0));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        refresh_btn.setText("Refresh Data");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });
        jPanel4.add(refresh_btn);

        jPanel5.add(jPanel4);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SOBAT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 191, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 192, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistem Informasi Obat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 127, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 127, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel2);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Akhdan Musyaffa Firdaus & Zulfa Dwi Audina");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 138, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 139, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel1);

        add(jPanel5);

        menu_items.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        menu_obat.setBackground(new java.awt.Color(255, 255, 255));
        menu_obat.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        menu_obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_obatMouseClicked(evt);
            }
        });
        menu_obat.setLayout(new java.awt.BorderLayout());

        jumlah_obat_lbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jumlah_obat_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah_obat_lbl.setText("20");
        menu_obat.add(jumlah_obat_lbl, java.awt.BorderLayout.PAGE_START);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obat");
        menu_obat.add(jLabel1, java.awt.BorderLayout.CENTER);

        menu_items.add(menu_obat);

        menu_penjual.setBackground(new java.awt.Color(255, 255, 255));
        menu_penjual.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        menu_penjual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_penjualMouseClicked(evt);
            }
        });
        menu_penjual.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("20");
        menu_penjual.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buat Penjualan");
        menu_penjual.add(jLabel8, java.awt.BorderLayout.CENTER);

        menu_items.add(menu_penjual);

        menu_laporan.setBackground(new java.awt.Color(255, 255, 255));
        menu_laporan.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        menu_laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_laporanMouseClicked(evt);
            }
        });
        menu_laporan.setLayout(new java.awt.BorderLayout());

        jumlah_penjualan_lbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jumlah_penjualan_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah_penjualan_lbl.setText("20");
        menu_laporan.add(jumlah_penjualan_lbl, java.awt.BorderLayout.PAGE_START);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Laporan Penjualan");
        menu_laporan.add(jLabel3, java.awt.BorderLayout.CENTER);

        menu_items.add(menu_laporan);

        add(menu_items);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_obatMouseClicked
        controller.changeView("Menu Obat");
    }//GEN-LAST:event_menu_obatMouseClicked

    private void menu_penjualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_penjualMouseClicked
        controller.changeView("Menu Buat Penjualan");
    }//GEN-LAST:event_menu_penjualMouseClicked

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        loadJumlahObat();
        loadJumlahPenjualan();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void menu_laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_laporanMouseClicked
        controller.changeView("Menu Penjualan");
    }//GEN-LAST:event_menu_laporanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jumlah_obat_lbl;
    private javax.swing.JLabel jumlah_penjualan_lbl;
    private javax.swing.JPanel menu_items;
    private javax.swing.JPanel menu_laporan;
    private javax.swing.JPanel menu_obat;
    private javax.swing.JPanel menu_penjual;
    private javax.swing.JButton refresh_btn;
    // End of variables declaration//GEN-END:variables
}
