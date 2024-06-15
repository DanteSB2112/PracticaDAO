/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.beans;

/**
 *
 * @author Usuario
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    private Connection conn;
    private final String bd;
    private final String host;
    private final String port;

    public ConexionMySQL() {
        bd = "ProgramacionWeb";
        host = "localhost";
        port = "3306";
        conn = null;
    }

    private boolean setDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public Connection getConnection() throws SQLException {
        if (setDriver()) {
            String URL = "jdbc:mysql://" + host + ":" + port + "/" + bd;
            conn = DriverManager.getConnection(URL, "lania", "admin");
            return conn;
        }
        return null;
    }

    String getTABLE_NAME() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


