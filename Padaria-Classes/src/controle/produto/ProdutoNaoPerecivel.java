package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoNaoPerecivel extends Produto {

	/**
	 * Método construtor da classe ProdutoNaoPerecivel.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
	}

}
