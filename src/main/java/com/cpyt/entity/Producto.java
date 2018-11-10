package com.cpyt.entity;
// Generated 10/11/2018 02:25:12 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private UnidadMedida unidadMedida;
     private String nombre;
     private String descripcion;
     private String color;
     private BigDecimal precioMaestro;
     private BigDecimal precioPublico;
     private int isDeleted;
     private Set entradaDetalles = new HashSet(0);
     private Set inventarios = new HashSet(0);
     private Set ventaDetalles = new HashSet(0);

    public Producto() {
    }

	
    public Producto(UnidadMedida unidadMedida, String nombre, BigDecimal precioMaestro, BigDecimal precioPublico, int isDeleted) {
        this.unidadMedida = unidadMedida;
        this.nombre = nombre;
        this.precioMaestro = precioMaestro;
        this.precioPublico = precioPublico;
        this.isDeleted = isDeleted;
    }
    public Producto(UnidadMedida unidadMedida, String nombre, String descripcion, String color, BigDecimal precioMaestro, BigDecimal precioPublico, int isDeleted, Set entradaDetalles, Set inventarios, Set ventaDetalles) {
       this.unidadMedida = unidadMedida;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.color = color;
       this.precioMaestro = precioMaestro;
       this.precioPublico = precioPublico;
       this.isDeleted = isDeleted;
       this.entradaDetalles = entradaDetalles;
       this.inventarios = inventarios;
       this.ventaDetalles = ventaDetalles;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public UnidadMedida getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public BigDecimal getPrecioMaestro() {
        return this.precioMaestro;
    }
    
    public void setPrecioMaestro(BigDecimal precioMaestro) {
        this.precioMaestro = precioMaestro;
    }
    public BigDecimal getPrecioPublico() {
        return this.precioPublico;
    }
    
    public void setPrecioPublico(BigDecimal precioPublico) {
        this.precioPublico = precioPublico;
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
    public Set getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set inventarios) {
        this.inventarios = inventarios;
    }
    public Set getVentaDetalles() {
        return this.ventaDetalles;
    }
    
    public void setVentaDetalles(Set ventaDetalles) {
        this.ventaDetalles = ventaDetalles;
    }




}


