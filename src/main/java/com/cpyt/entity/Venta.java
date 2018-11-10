package com.cpyt.entity;
// Generated 10/11/2018 02:25:12 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private Integer idVenta;
     private Persona personaByIdReferencia;
     private Persona personaByIdCliente;
     private SerieComprobante serieComprobante;
     private TipoComprobante tipoComprobante;
     private Usuario usuario;
     private Date fechaCompra;
     private String numeroComprobante;
     private BigDecimal montoTotal;
     private int isDeleted;
     private Set ventaDetalles = new HashSet(0);
     private Set pagos = new HashSet(0);

    public Venta() {
    }

	
    public Venta(Persona personaByIdCliente, SerieComprobante serieComprobante, TipoComprobante tipoComprobante, Usuario usuario, Date fechaCompra, String numeroComprobante, BigDecimal montoTotal, int isDeleted) {
        this.personaByIdCliente = personaByIdCliente;
        this.serieComprobante = serieComprobante;
        this.tipoComprobante = tipoComprobante;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.numeroComprobante = numeroComprobante;
        this.montoTotal = montoTotal;
        this.isDeleted = isDeleted;
    }
    public Venta(Persona personaByIdReferencia, Persona personaByIdCliente, SerieComprobante serieComprobante, TipoComprobante tipoComprobante, Usuario usuario, Date fechaCompra, String numeroComprobante, BigDecimal montoTotal, int isDeleted, Set ventaDetalles, Set pagos) {
       this.personaByIdReferencia = personaByIdReferencia;
       this.personaByIdCliente = personaByIdCliente;
       this.serieComprobante = serieComprobante;
       this.tipoComprobante = tipoComprobante;
       this.usuario = usuario;
       this.fechaCompra = fechaCompra;
       this.numeroComprobante = numeroComprobante;
       this.montoTotal = montoTotal;
       this.isDeleted = isDeleted;
       this.ventaDetalles = ventaDetalles;
       this.pagos = pagos;
    }
   
    public Integer getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    public Persona getPersonaByIdReferencia() {
        return this.personaByIdReferencia;
    }
    
    public void setPersonaByIdReferencia(Persona personaByIdReferencia) {
        this.personaByIdReferencia = personaByIdReferencia;
    }
    public Persona getPersonaByIdCliente() {
        return this.personaByIdCliente;
    }
    
    public void setPersonaByIdCliente(Persona personaByIdCliente) {
        this.personaByIdCliente = personaByIdCliente;
    }
    public SerieComprobante getSerieComprobante() {
        return this.serieComprobante;
    }
    
    public void setSerieComprobante(SerieComprobante serieComprobante) {
        this.serieComprobante = serieComprobante;
    }
    public TipoComprobante getTipoComprobante() {
        return this.tipoComprobante;
    }
    
    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaCompra() {
        return this.fechaCompra;
    }
    
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public String getNumeroComprobante() {
        return this.numeroComprobante;
    }
    
    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }
    public BigDecimal getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getVentaDetalles() {
        return this.ventaDetalles;
    }
    
    public void setVentaDetalles(Set ventaDetalles) {
        this.ventaDetalles = ventaDetalles;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}


