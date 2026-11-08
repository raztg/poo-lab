package com.log.logistics.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "logistics_viajes")
public class Logistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String operador;

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private Double tarifa;

    @Column(nullable = false)
    private LocalDate fechaViaje;

    @Column(nullable = false)
    private String estatus; // Pendiente, Completado, Cancelado

    public Logistics() {}

    public Logistics(String operador, String origen, String destino, Double tarifa, LocalDate fechaViaje, String estatus) {
        this.operador = operador;
        this.origen = origen;
        this.destino = destino;
        this.tarifa = tarifa;
        this.fechaViaje = fechaViaje;
        this.estatus = estatus;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOperador() { return operador; }
    public void setOperador(String operador) { this.operador = operador; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public Double getTarifa() { return tarifa; }
    public void setTarifa(Double tarifa) { this.tarifa = tarifa; }

    public LocalDate getFechaViaje() { return fechaViaje; }
    public void setFechaViaje(LocalDate fechaViaje) { this.fechaViaje = fechaViaje; }

    public String getEstatus() { return estatus; }
    public void setEstatus(String estatus) { this.estatus = estatus; }
}