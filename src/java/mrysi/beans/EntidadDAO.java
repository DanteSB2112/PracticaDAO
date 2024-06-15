 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.beans;

import java.sql.SQLException;
import java.util.List;

public interface EntidadDAO {
    public void insert(Entidad entidad) throws SQLException;
    public void update(Entidad entidad) throws SQLException;
    public void delete(Integer id) throws SQLException;
    public Entidad read(Integer id) throws SQLException;
    public List<Entidad> readAll() throws SQLException;
}

