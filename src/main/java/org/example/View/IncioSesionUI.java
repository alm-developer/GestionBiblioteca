package org.example.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import javax.swing.*;

public class IncioSesionUI extends BorderPane {

    public IncioSesionUI(){
        HBox panel = new HBox();
        this.setCenter(panel);

        VBox centro = new VBox();
        HBox.setHgrow(centro, Priority.ALWAYS);
        centro.setAlignment(Pos.CENTER);
        centro.setPadding(new Insets(0,60,0,60));

        Label titulo = new Label("Inicio sesion");
        Label nombre = new Label("usuario");
        TextField entradaNombre = new TextField();
        Label contrasena = new Label("Contraseña");
        TextField entradaContrasena = new TextField();
        Button btnConfirmar = new Button("Aceptar");



        centro.getChildren().addAll(titulo,nombre,entradaNombre,contrasena,entradaContrasena,btnConfirmar);
        panel.getChildren().add(centro);

    }

}
