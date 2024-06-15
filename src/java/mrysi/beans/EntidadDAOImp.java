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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntidadDAOImp implements EntidadDAO {
    private final String TABLE_NAME;
    private final ConexionMySQL conMySQL;
    private Connection conn;

    public EntidadDAOImp() {
        TABLE_NAME = "Entidades";
        conMySQL = new ConexionMySQL();
    }

    @Override
    public void insert(Entidad entidad) throws SQLException {
        // abrir la conexion
        conn = conMySQL.getConnection();
        String insertQuery = "INSERT INTO " + TABLE_NAME + " (nombreEntidad) " + "VALUES(?) ";
        try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            // enviar el commando insert
            ps.setString(1, entidad.getNombreEntidad());
            ps.executeUpdate();
        }
        conn.close();
    }
    
    @Override
    public void update(Entidad entidad) throws SQLException {
        conn = conMySQL.getConnection();
        String updateQuery = "UPDATE " + TABLE_NAME + " SET nombreEntidad = ? WHERE idEntidad = ?";
        try (PreparedStatement ps = conn.prepareStatement(updateQuery)) {
            // agregar parametros y ejecutar la actualización
            ps.setString(1, entidad.getNombreEntidad());
            ps.setInt(2, entidad.getIdEntidad());
            ps.executeUpdate();
        }
        conn.close();
    }
    
    @Override
    public void delete(Integer id) throws SQLException {
        conn = conMySQL.getConnection();
        String deleteQuery = "DELETE FROM " + TABLE_NAME + " WHERE idEntidad = ?";
        try (PreparedStatement ps = conn.prepareStatement(deleteQuery)) {
            // agregar parámetros y ejecutar el Delete
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        conn.close();
    }
    
    @Override
    public Entidad read(Integer id) throws SQLException {
        Entidad entidad = null;
        conn = conMySQL.getConnection();
        String Query = "SELECT idEntidad, nombreEntidad FROM " + TABLE_NAME + " WHERE idEntidad = ?";
        try (PreparedStatement ps = conn.prepareStatement(Query)) {
            // agregar parámetros y ejecutar la consulta
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // obtener cada una de la columnas y mapearlas a la clase Entidad
                    entidad = new Entidad(id, rs.getString("nombreEntidad"));
                }
            }
        }
        return entidad;
    }
    
    @Override
    public List<Entidad> readAll() throws SQLException {
        List<Entidad> entidades = new ArrayList<>();
        Connection con = conMySQL.getConnection();
        String Query = "SELECT * FROM " + conMySQL.getTABLE_NAME();
        try (PreparedStatement ps = con.prepareStatement(Query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Entidad entidad = new Entidad(
                    rs.getInt("idEntidad"),
                    rs.getString("nombreEntidad")
                );
                entidades.add(entidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entidades;
    }
}





    



