package com.cpyt.entity;
// Generated 10/11/2018 02:25:12 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoPersona generated by hbm2java
 */
public class TipoPersona  implements java.io.Serializable {


     private Integer idTipoPersona;
     private String nombre;
     private Set personas = new HashSet(0);

    public TipoPersona() {
    }

	
    public TipoPersona(String nombre) {
        this.nombre = nombre;
    }
    public TipoPersona(String nombre, Set personas) {
       this.nombre = nombre;
       this.personas = personas;
    }
   
    public Integer getIdTipoPersona() {
        return this.idTipoPersona;
    }
    
    public void setIdTipoPersona(Integer idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set personas) {
        this.personas = personas;
    }




}


