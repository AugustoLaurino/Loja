package teste;

public class Loja {
	
	private int codLoja;
	private String nomeLoja;
	
	Loja (int recebeCodLoja, String recebeNomeLoja){
		this.codLoja = recebeCodLoja;
		this.nomeLoja = recebeNomeLoja;
	}
	
	public int getCodLoja() {
		return codLoja;
	}
	public void setCodLoja(int codLoja) {
		this.codLoja = codLoja;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
}
