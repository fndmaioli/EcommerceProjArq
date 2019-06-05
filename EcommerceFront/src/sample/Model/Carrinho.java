package sample.Model;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList<Produto> listaProdutos;
	private static Carrinho uniqueInstance = null;

	private Carrinho() {}
	
	public static Carrinho instance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Carrinho();
		}
		
		return uniqueInstance;
	}

	public boolean addProduto(Produto produto) {
		if (listaProdutos.contains(produto)) {
			return false;
		}
		else {
			listaProdutos.add(produto);
			return true;
		}
	}
	
	public boolean retiraProduto(Produto produto) {
		return listaProdutos.remove(produto);
	}
	
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
}
