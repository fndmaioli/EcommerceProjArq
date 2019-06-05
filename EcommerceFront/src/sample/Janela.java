package sample;

import javafx.scene.layout.GridPane;

abstract class Janela {

    public abstract GridPane draw();
}

class JanelaSimples extends Janela {

    public GridPane draw() {
        GridPane gridPane = new GridPane();
        gridPane.setId("gp");
        return(gridPane);

    }
}

abstract class JanelaDecorator extends Janela {

    protected Janela janelaDecorada;

    public JanelaDecorator(Janela janelaDecorada) {
        this.janelaDecorada = janelaDecorada;
    }

}