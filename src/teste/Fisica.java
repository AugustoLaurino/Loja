package teste;

public class Fisica extends Pessoa{
	
	private String cpf;
	private String rg;
	private String genero;
	private String dataNasc;
	
	Fisica (String recebeNome, String recebeEmail, String recebeTelefone, String recebeCpf, String recebeRg, String recebeGenero, String recebeDataNasc){
		super(recebeNome, recebeEmail, recebeTelefone);
		this.cpf = recebeCpf;
		this.rg = recebeRg;
		this.genero = recebeGenero;
		this.dataNasc = recebeDataNasc;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
