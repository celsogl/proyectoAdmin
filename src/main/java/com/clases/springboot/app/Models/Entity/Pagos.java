package com.clases.springboot.app.Models.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pagos {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "fecha")
    private Date fecha;
    @ManyToOne()
    @JoinColumn(name = "id_venta")
    private Venta idVenta;
    @Column(name = "metodo_pago")
    private String metodo_pago;
    @Column(name = "numero_tarjeta")
    private String numeroTarjeta;
    @Column(name="fecha_vencimiento")
    private String fecha_vencimiento;
    @Column(name="cvv")
    private String cvv;
    @Column(name = "nombre_titular")
    private String nombre_titular;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Venta getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }
    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }
    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public String getNombre_titular() {
        return nombre_titular;
    }
    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    
}
