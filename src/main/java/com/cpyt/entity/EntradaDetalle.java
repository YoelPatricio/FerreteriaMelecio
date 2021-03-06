package com.cpyt.entity;
// Generated 10/11/2018 02:25:12 AM by Hibernate Tools 4.3.1



/**
 * EntradaDetalle generated by hbm2java
 */
public class EntradaDetalle  implements java.io.Serializable {


     private Integer idEntradaDetalle;
     private Entrada entrada;
     private Producto producto;
     private int cantidad;

    public EntradaDetalle() {
    }

    public EntradaDetalle(Entrada entrada, Producto producto, int cantidad) {
       this.entrada = entrada;
       this.producto = producto;
       this.cantidad = cantidad;
    }
   
    public Integer getIdEntradaDetalle() {
        return this.idEntradaDetalle;
    }
    
    public void setIdEntradaDetalle(Integer idEntradaDetalle) {
        this.idEntradaDetalle = idEntradaDetalle;
    }
    public Entrada getEntrada() {
        return this.entrada;
    }
    
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}


