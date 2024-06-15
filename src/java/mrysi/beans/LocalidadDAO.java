/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.beans;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface LocalidadDAO {
    public void insert(Localidad localidad) throws SQLException;
    public void update(Localidad localidad) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public Localidad read(Integer id) throws SQLException;
    public List<Localidad> readAll() throws SQLException;
}

