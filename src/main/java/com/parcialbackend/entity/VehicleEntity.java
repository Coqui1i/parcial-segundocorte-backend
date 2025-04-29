package com.parcialbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class VehicleEntity {

    @Id
    @Getter
    @Column(length = 6)
    private String placa;

    private int horaEntrada;

    private Integer horaSalida; // puede ser null si aún no ha salido

    // --- Getters y Setters ---
    @Setter
    @Getter
    private String ubication;

    @ManyToOne
    @JoinColumn(name = "tipo_vehiculo_id")
    private VehicleTypeEntity tipoVehiculo;


}
