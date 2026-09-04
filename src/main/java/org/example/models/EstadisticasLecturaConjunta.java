package org.example.models;

import java.time.LocalDateTime;

public class EstadisticasLecturaConjunta {
    private int idEstadisticasLecturaConjunta;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechafinalizacion;
    private boolean lecturaCompletada;
    private boolean abandonado;
    private double numEstrellas;
    private int idUsuarioCreador;
}
