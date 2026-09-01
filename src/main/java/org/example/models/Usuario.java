package org.example.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String descripcion;
    private int librosCompletados;
    private LocalDateTime fechaRegistro;
    private LocalDateTime ultimaConexion;
    private boolean Activo;
}
