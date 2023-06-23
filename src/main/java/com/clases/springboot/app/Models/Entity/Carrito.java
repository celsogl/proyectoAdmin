package com.clases.springboot.app.Models.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @ManyToOne()
    @JoinColumn(name="id_usuario")
    private Usuario idUsuario;
    @ManyToOne()
    @JoinColumn(name="id_venta")
    private Venta idVenta;
    @Column(name = "cancelado")
    private int cancelado;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Usuario getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Venta getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }
    public int getCancelado() {
        return cancelado;
    }
    public void setCancelado(int cancelado) {
        this.cancelado = cancelado;
    }

    

}
