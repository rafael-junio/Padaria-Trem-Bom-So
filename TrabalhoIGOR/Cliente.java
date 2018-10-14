package trabalhoProgooII.TrabalhoIGOR;

public class Cliente extends PessoaFisica {
	
	private String categoria; // Gold, Platinum
	private String codigoCliente;
	
	public Cliente(String nome, String endereco, String telefone, String cpf, String codigoCliente) {
		super(nome, endereco, telefone, cpf);
		this.codigoCliente = codigoCliente;
					
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	

}
