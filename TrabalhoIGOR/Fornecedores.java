package trabalhoProgooII.TrabalhoIGOR;

public abstract class Fornecedores extends Pessoa {

	protected String cnpj;
	protected String codigoFornecedor;

	
	public Fornecedores(String nome, String endereco, String cnpj, String codigoFornecedor) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.codigoFornecedor = codigoFornecedor;
			
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	

		
}
