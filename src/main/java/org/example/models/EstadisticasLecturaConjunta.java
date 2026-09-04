package org.example.models;

import java.time.LocalDateTime;

public class EstadisticasLecturaConjunta {
    private int idEstadisticasLecturaConjunta;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private int idUsuarioCreador;
    private LocalDateTime fechafinalizacion;
    private boolean lecturaCompletada;
    private boolean abandonado;
    private double numEstrellas;
}
