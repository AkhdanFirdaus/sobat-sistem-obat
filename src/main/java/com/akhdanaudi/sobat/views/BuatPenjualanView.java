/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.views;

import com.akhdanaudi.sobat.controllers.PenjualanController;
import com.akhdanaudi.sobat.controllers.ViewController;

/**
 *
 * @author akhda
 */
public class BuatPenjualanView extends javax.swing.JPanel {
    ViewController viewController;
    PenjualanController controller;

    /**
     * Creates new form ObatView
     * @param viewController
     * @param controller
     */
    public BuatPenjualanView(ViewController viewController, PenjualanController controller) {
        initComponents();
        this.viewController = viewController;
        this.controller = controller;
    }
    
    private void resetForm() {
        nama_kustomer_field.setText("");
        obat_id_cmb.setSelectedIndex(0);
        harga_field.setText("");
        qty_field.setValue((int) 0);
        tabelObat.getSelectionModel().clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atas = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        obat_id_cmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        harga_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qty_field = new javax.swing.JSpinner();
        button = new javax.swing.JPanel();
        delete_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        form1 = new javax.swing.JPanel();
        backButton = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        nama_kustomer_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        button1 = new javax.swing.JPanel();
        reset_btn1 = new javax.swing.JButton();
        add_btn1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelObat = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(2, 0));

        atas.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        atas.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        form.setLayout(new java.awt.GridLayout(7, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Obat");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 14));
        form.add(jLabel4);

        obat_id_cmb.setEditable(true);
        obat_id_cmb.setPreferredSize(new java.awt.Dimension(240, 20));
        form.add(obat_id_cmb);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Harga");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 14));
        form.add(jLabel1);

        harga_field.setMinimumSize(new java.awt.Dimension(20, 20));
        harga_field.setPreferredSize(new java.awt.Dimension(240, 20));
        form.add(harga_field);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Qty");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 14));
        form.add(jLabel6);

        qty_field.setPreferredSize(new java.awt.Dimension(240, 20));
        form.add(qty_field);

        button.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        button.add(delete_btn);

        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        button.add(reset_btn);

        add_btn.setText("Tambah");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        button.add(add_btn);

        form.add(button);

        atas.add(form);

        form1.setLayout(new java.awt.GridLayout(7, 0));

        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        form1.add(backButton);

        jLabel7.setText("Nama");
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 14));
        form1.add(jLabel7);

        nama_kustomer_field.setMinimumSize(new java.awt.Dimension(20, 20));
        nama_kustomer_field.setPreferredSize(new java.awt.Dimension(240, 20));
        form1.add(nama_kustomer_field);

        jLabel3.setText("Total Harga");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 14));
        form1.add(jLabel3);

        total_field.setEditable(false);
        total_field.setMinimumSize(new java.awt.Dimension(20, 20));
        total_field.setPreferredSize(new java.awt.Dimension(240, 20));
        form1.add(total_field);

        button1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        reset_btn1.setText("Reset");
        reset_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btn1ActionPerformed(evt);
            }
        });
        button1.add(reset_btn1);

        add_btn1.setText("Simpan");
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn1ActionPerformed(evt);
            }
        });
        button1.add(add_btn1);

        form1.add(button1);

        atas.add(form1);

        add(atas);

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        jPanel9.setLayout(new java.awt.CardLayout());

        tabelObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelObat);

        jPanel9.add(jScrollPane1, "card2");

        add(jPanel9);
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
    }//GEN-LAST:event_delete_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        resetForm();
    }//GEN-LAST:event_reset_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        int idObat = obat_id_cmb.getSelectedIndex();
        String obat = obat_id_cmb.getSelectedItem().toString();
        int harga = Integer.parseInt(harga_field.getText());
        int qty = Integer.parseInt(qty_field.getValue().toString());
    }//GEN-LAST:event_add_btnActionPerformed

    private void reset_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reset_btn1ActionPerformed

    private void add_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_btn1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        viewController.changeView("Menu Utama");
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton add_btn1;
    private javax.swing.JPanel atas;
    private javax.swing.JToggleButton backButton;
    private javax.swing.JPanel button;
    private javax.swing.JPanel button1;
    private javax.swing.JButton delete_btn;
    private javax.swing.JPanel form;
    private javax.swing.JPanel form1;
    private javax.swing.JTextField harga_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_kustomer_field;
    private javax.swing.JComboBox<String> obat_id_cmb;
    private javax.swing.JSpinner qty_field;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton reset_btn1;
    private javax.swing.JTable tabelObat;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables
}
