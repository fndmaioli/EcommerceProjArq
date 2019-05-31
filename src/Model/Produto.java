package Model;

public class Produto {
	
	int codProduto;
	String nomeProduto;
	double precoProduto;
	
	public Produto(int codProduto, String nomeProduto, double precoProduto) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}
	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto
				+ "]";
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	

}
