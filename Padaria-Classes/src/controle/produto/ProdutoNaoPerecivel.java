package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoNaoPerecivel extends Produto {

	/**
	 * M�todo construtor da classe ProdutoNaoPerecivel.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
	}

}
