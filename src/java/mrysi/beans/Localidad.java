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
import java.io.Serializable;

public class Localidad implements Serializable {
    private int idLocalidad;
    private String nombreLocalidad;
    private int idEntidad;
    private Entidad entidad;

    public Localidad() {}

    public Localidad(int idLocalidad, String nombreLocalidad, int idEntidad, Entidad entidad) {
        this.idLocalidad = idLocalidad;
        this.nombreLocalidad = nombreLocalidad;
        this.idEntidad = idEntidad;
        this.entidad = entidad;
    }

    Localidad(Integer id, String string, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Localidad(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEntidad(Entidad read) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

