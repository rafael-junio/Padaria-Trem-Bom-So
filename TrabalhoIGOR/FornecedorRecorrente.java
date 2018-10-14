package trabalhoProgooII.TrabalhoIGOR;

public class FornecedorRecorrente extends Fornecedores {

	private float txDesconto;
	
	public FornecedorRecorrente(String nome, String endereco, String cnpj, float txDesconto, String codigoFornecedor) {
		super(nome, endereco, cnpj, codigoFornecedor);
		this.txDesconto = txDesconto;
	}

	public float getTxDesconto() {
		return txDesconto;
	}

	public void setTxDesconto(float txDesconto) {
		this.txDesconto = txDesconto;
	}

}
