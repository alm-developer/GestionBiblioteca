package org.example.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.control.Label;

import javax.swing.*;
import java.awt.*;

public class IncioSesionUI extends BorderPane {

    public IncioSesionUI(){
        HBox panel = new HBox();

        this.setCenter(panel);

        VBox info = new VBox();
        info.setMinWidth(0);
        info.setPrefWidth(300);
        info.setStyle("-fx-background-color: red;");

        VBox inicioSesion = new VBox();
        inicioSesion.setMinWidth(0);
        HBox.setHgrow(inicioSesion, Priority.ALWAYS);
        inicioSesion.setStyle("-fx-background-color: yellow;");

        Label titulo = new Label("Inicio sesion");


        VBox redes = new VBox();
        redes.setMinWidth(0);
        redes.setPrefWidth(140);
        redes.setStyle("-fx-background-color: blue;");



        panel.getChildren().addAll(info,inicioSesion,redes);



    }

}
