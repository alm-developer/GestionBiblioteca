package org.example.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private int contrasena;

    private String descripcion;
    private int librosCompletados;
    private LocalDateTime fechaRegistro;
    private LocalDateTime ultimaConexion;
    private boolean Activo;

    public Usuario(int idUsuario, String nombre, int contrasena, String descripcion, int librosCompletados, LocalDateTime fechaRegistro, LocalDateTime ultimaConexion, boolean activo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.descripcion = descripcion;
        this.librosCompletados = librosCompletados;
        this.fechaRegistro = fechaRegistro;
        this.ultimaConexion = ultimaConexion;
        this.Activo = activo;
           }

    public Usuario(String nombre, int contrasena, String descripcion, int librosCompletados, LocalDateTime fechaRegistro, LocalDateTime ultimaConexion, boolean activo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.descripcion = descripcion;
        this.librosCompletados = librosCompletados;
        this.fechaRegistro = fechaRegistro;
        this.ultimaConexion = ultimaConexion;
        Activo = activo;
    }
}
