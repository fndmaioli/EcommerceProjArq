import java.util.ArrayList;

public class Carrinho {

    private static Carrinho uniqueInstance = null;
    private ArrayList<Item> itens;

    public static Carrinho instance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Carrinho();
        }
        return uniqueInstance;
    }

    private Carrinho(){
        itens = new ArrayList<>();
        itens.add(new Item());
    }

    public ArrayList<Item> getItens(){
        return itens;
    }

}
