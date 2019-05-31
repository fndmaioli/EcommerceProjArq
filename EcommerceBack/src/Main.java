public class Main {

    public static void main(String args[]) {
        Carrinho c = Carrinho.instance();

        Carrinho b = Carrinho.instance();

        System.out.println(c.getItens().get(0));
        System.out.println(b.getItens().get(0));
    }





}
