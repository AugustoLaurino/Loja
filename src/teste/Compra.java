package teste;

public class Compra {
	
	private int codCompra;
	private float valorCompra;
	private String dataCompra;
	
	Compra (int recebeCodCompra, Float recebeValorCompra, String recebeDataCompra){
		this.codCompra = recebeCodCompra;
		this.valorCompra = recebeValorCompra;
		this.dataCompra = recebeDataCompra;
	}
	
	public int getCodCompra() {
		return codCompra;
	}
	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}