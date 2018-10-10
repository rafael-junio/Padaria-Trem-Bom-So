package trabalhoProgooII;

public class FornecedorRecorrente extends Fornecedor{
	private float descontoProdutos;

	public FornecedorRecorrente(String nome, String endereco, String cnpj, float descontoProdutos) {
		super(nome, endereco, cnpj);
		this.descontoProdutos = descontoProdutos;
	}

	public float getDescontoProdutos() {
		return descontoProdutos;
	}

	public void setDescontoProdutos(float descontoProdutos) {
		this.descontoProdutos = descontoProdutos;
	}
	
}
