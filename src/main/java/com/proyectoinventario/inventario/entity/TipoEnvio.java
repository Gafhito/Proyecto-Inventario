package com.proyectoinventario.inventario.entity;

import javax.persistence.*;

@Entity
@Table(name = "Tipo_Envio")
public class TipoEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;

    public TipoEnvio(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}