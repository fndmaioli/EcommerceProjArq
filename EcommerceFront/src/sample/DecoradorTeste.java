package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class DecoradorTeste extends Application {

    public static void main(String args[]) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Janela janelaDecorada = new DecoratorListaItens(new JanelaSimples());
        GridPane gp = janelaDecorada.draw();
        TextField textField = new TextField();
        textField.setPrefSize(200,20);
        gp.add(textField,600,600);
        Button botao = new Button("Adicionar no carrinho");
        botao.setPrefHeight(20);
        botao.setPrefWidth(200);
        gp.add(botao,300,400);
        Scene sc = new Scene(gp,800,800);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}