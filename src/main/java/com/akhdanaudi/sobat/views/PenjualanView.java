/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.views;

import com.akhdanaudi.sobat.controllers.PenjualanController;
import com.akhdanaudi.sobat.controllers.ViewController;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author akhda
 */
public class PenjualanView extends javax.swing.JPanel {
    ViewController viewController;
    PenjualanController controller;

    /**
     * Creates new form ObatView
     * @param viewController
     * @param controller
     */
    public PenjualanView(ViewController viewController, PenjualanController controller) {
        initComponents();
        this.viewController = viewController;
        this.controller = controller;
        
        tabelPenjualan.setModel(controller.getTableModel());
        tabelDetail.setModel(controller.getTableDetailModel());
        
        tabelPenjualan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!tabelPenjualan.getSelectionModel().isSelectionEmpty()) {
                    int baris = tabelPenjualan.getSelectedRow();
                    int idPenjualan = Integer.parseInt(tabelPenjualan.getValueAt(baris, 0).toString());
                    int total = controller.setDetail(idPenjualan);
                    total_price_lbl.setText("Total: Rp." + String.valueOf(total));
                } else {
                    total_price_lbl.setText("Total: Rp.0");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JToggleButton();
        reset_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPenjualan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        total_price_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelDetail = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        setLayout(new java.awt.GridLayout(5, 0));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);

        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        jPanel1.add(reset_btn);

        add(jPanel1);

        jLabel1.setText("Data Penjualan");
        add(jLabel1);

        tabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabelPenjualan.setPreferredSize(new java.awt.Dimension(200, 64));
        jScrollPane1.setViewportView(tabelPenjualan);

        add(jScrollPane1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Detail Penjualan");
        jPanel2.add(jLabel2);
        jPanel2.add(jPanel3);

        total_price_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total_price_lbl.setText("Total: Rp.0");
        jPanel2.add(total_price_lbl);

        add(jPanel2);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(220, 23));

        tabelDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabelDetail.setPreferredSize(new java.awt.Dimension(225, 64));
        jScrollPane2.setViewportView(tabelDetail);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        viewController.changeView("Menu Utama");
    }//GEN-LAST:event_backButtonActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        controller.getTableDetailModel().setRowCount(0);
        tabelPenjualan.getSelectionModel().clearSelection();
        tabelDetail.getSelectionModel().clearSelection();
    }//GEN-LAST:event_reset_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset_btn;
    private javax.swing.JTable tabelDetail;
    private javax.swing.JTable tabelPenjualan;
    private javax.swing.JLabel total_price_lbl;
    // End of variables declaration//GEN-END:variables
}
