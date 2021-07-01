/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.controllers;

import com.akhdanaudi.sobat.views.BuatPenjualanView;
import com.akhdanaudi.sobat.views.MenuView;
import com.akhdanaudi.sobat.views.ObatView;
import com.akhdanaudi.sobat.views.PenjualanView;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author akhda
 */
public class ViewController {
    JFrame frame;
    JPanel panel;

    public ViewController() {
        frame = new JFrame();
        frame.setTitle("Sobat: Sistem Obat");
        frame.setSize(800, 600);
        
        ObatController obatController = new ObatController();
        PenjualanController penjualanController = new PenjualanController();
        
        panel = new JPanel(new CardLayout());
        panel.add(new MenuView(this, obatController, penjualanController), "Menu Utama");
        panel.add(new ObatView(this, obatController), "Menu Obat");
        panel.add(new BuatPenjualanView(this, penjualanController), "Menu Buat Penjualan");
        panel.add(new PenjualanView(this, penjualanController), "Menu Penjualan");
        frame.add(panel);
    }
    
    public void initView() {
        frame.setVisible(true);
    }
    
    public void changeView(String viewName) {
        CardLayout view = (CardLayout) panel.getLayout();
        view.show(panel, viewName);
    }
}
