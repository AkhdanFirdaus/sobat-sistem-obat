/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhdanaudi.sobat.database;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author akhda
 */
public class Koneksi {
    private static final String DB = "sobat";
    private static final String HOST = "jdbc:mysql://localhost/" + DB;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection getKoneksi() throws SQLException {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection(HOST, USERNAME, PASSWORD);
    }
}
