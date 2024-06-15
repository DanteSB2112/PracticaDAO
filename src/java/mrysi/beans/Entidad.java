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
public class Entidad implements java.io.Serializable {
    private final int idEntidad;
    private String nombreEntidad;

    /**
     *
     * @param idEntidad
     * @param nombreEntidad
     */
    public Entidad(int idEntidad, String nombreEntidad) {
        this.idEntidad = idEntidad;
        this.nombreEntidad = nombreEntidad;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }
}

