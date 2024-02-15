package teste;

public class Carrinho {
	
	private int codCarrinho;
	private int quantidade;
	
	Carrinho (int recebeCodCarrinho, int recebeQuantidade){
		this.codCarrinho = recebeCodCarrinho;
		this.quantidade = recebeQuantidade;
	}
	
	public int getCodCarrinho() {
		return codCarrinho;
	}
	public void setCodCarrinho(int codCarrinho) {
		this.codCarrinho = codCarrinho;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
