package com.cpyt.entity;
// Generated 06/11/2018 04:24:53 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Entrada generated by hbm2java
 */
public class Entrada  implements java.io.Serializable {


     private Integer idEntrada;
     private Almacen almacen;
     private Usuario usuario;
     private int descripcion;
     private int fechaRegistro;
     private int isDeleted;
     private Set entradaDetalles = new HashSet(0);

    public Entrada() {
    }

	
    public Entrada(Almacen almacen, Usuario usuario, int descripcion, int fechaRegistro, int isDeleted) {
        this.almacen = almacen;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.isDeleted = isDeleted;
    }
    public Entrada(Almacen almacen, Usuario usuario, int descripcion, int fechaRegistro, int isDeleted, Set entradaDetalles) {
       this.almacen = almacen;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.fechaRegistro = fechaRegistro;
       this.isDeleted = isDeleted;
       this.entradaDetalles = entradaDetalles;
    }
   
    public Integer getIdEntrada() {
        return this.idEntrada;
    }
    
    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
    public int getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(int fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getEntradaDetalles() {
        return this.entradaDetalles;
    }
    
    public void setEntradaDetalles(Set entradaDetalles) {
        this.entradaDetalles = entradaDetalles;
    }




}

