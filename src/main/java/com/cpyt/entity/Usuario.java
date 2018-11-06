package com.cpyt.entity;
// Generated 06/11/2018 04:24:53 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private Persona persona;
     private String usuario;
     private int password;
     private int inSession;
     private int isDeleted;
     private Set ventas = new HashSet(0);
     private Set pagos = new HashSet(0);
     private Set entradas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Persona persona, String usuario, int password, int inSession, int isDeleted) {
        this.persona = persona;
        this.usuario = usuario;
        this.password = password;
        this.inSession = inSession;
        this.isDeleted = isDeleted;
    }
    public Usuario(Persona persona, String usuario, int password, int inSession, int isDeleted, Set ventas, Set pagos, Set entradas) {
       this.persona = persona;
       this.usuario = usuario;
       this.password = password;
       this.inSession = inSession;
       this.isDeleted = isDeleted;
       this.ventas = ventas;
       this.pagos = pagos;
       this.entradas = entradas;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getPassword() {
        return this.password;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }
    public int getInSession() {
        return this.inSession;
    }
    
    public void setInSession(int inSession) {
        this.inSession = inSession;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }
    public Set getEntradas() {
        return this.entradas;
    }
    
    public void setEntradas(Set entradas) {
        this.entradas = entradas;
    }




}


