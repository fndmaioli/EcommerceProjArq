package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import javax.swing.*;

public class DecoratorListaItens extends JanelaDecorator {

    @FXML
    GridPane gp;

    public DecoratorListaItens(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    @Override
    public GridPane draw() {
         GridPane gp = janelaDecorada.draw();
         gp = drawListaItens(gp);
        return gp;
}

    private GridPane drawListaItens(GridPane gridPane) {
        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");

        list.setItems(items);
        list.setPrefWidth(100);
        list.setPrefHeight(200);
        gridPane.add(list,0,0);
        return gridPane;
    }
}
