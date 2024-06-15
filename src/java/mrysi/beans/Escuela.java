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
public class Escuela implements java.io.Serializable {
    private String claveEscuela; 
    private String nombreEscuela; 
    private String domicilio; 
    private int codigoPostal; 
    private String turno; 
    private int idLocalidad;
    
    public void setClaveEscuela (String claveEscuela) { 
        this.claveEscuela = claveEscuela;
    }
    
    public void setNombreEscuela (String nombreEscuela){ 
        this.nombreEscuela = nombreEscuela;
    }
    
    public void setDomicilio (String domicilio) {
        this.domicilio = domicilio;
    }
    
    public void setCodigoPostal (int codigoPostal) { 
        this.codigoPostal = codigoPostal;
    }
    
    public void setTurno (String turno) {
        this.turno = turno;
    }
    
    public void setIdLocalidad (int idLocalidad) { 
        this.idLocalidad = idLocalidad;
    }
    
    public String getClaveEscuela() { 
        return claveEscuela;
    }
}

