package teste;

public class Usuario extends Pessoa{
	
	private String loginUser;
	private String senhaUser;
	
	Usuario (String recebeNome, String recebeEmail, String recebeTelefone, String recebeLoginUser, String recebeSenhaUser){
		super(recebeNome, recebeEmail, recebeTelefone);
		this.loginUser = recebeLoginUser;
		this.senhaUser = recebeSenhaUser;
	}
	
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getSenhaUser() {
		return senhaUser;
	}
	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}
}
