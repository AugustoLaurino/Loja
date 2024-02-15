package teste;

public class Produto {
	
	private int codProduto;
	private String nomeProduto;
	
	Produto (int recebeCodProduto, String recebeNomeProduto){
		this.codProduto = recebeCodProduto;
		this.nomeProduto = recebeNomeProduto;
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

	
}
