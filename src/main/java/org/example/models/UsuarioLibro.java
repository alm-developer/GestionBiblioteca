package org.example.models;

import java.time.LocalDateTime;

public class UsuarioLibro {
    private int idLibro;
    private int idUsuario;
    private int pagleidas;
    private int pagRestantes;
    private boolean  leido;
    private LocalDateTime fechaLeido;
    private LocalDateTime fechaAbandono;
    private String opinion;
    private boolean abandonado;
    private double estrellas;
    private int marcaPaginas;
}
