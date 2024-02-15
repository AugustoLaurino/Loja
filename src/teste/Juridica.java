package teste;

public class Juridica extends Pessoa{

	private String cnpj;
	private String dataFundacao;
	private String tipoEmpresa;
	
	Juridica (String recebeNome, String recebeEmail, String recebeTelefone, String recebeCnpj, String recebeDataFundacao, String recebeTipoEmpresa){
		super(recebeNome, recebeEmail, recebeTelefone);
		this.cnpj = recebeCnpj;
		this.dataFundacao = recebeDataFundacao;
		this.tipoEmpresa = recebeTipoEmpresa;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	
}
