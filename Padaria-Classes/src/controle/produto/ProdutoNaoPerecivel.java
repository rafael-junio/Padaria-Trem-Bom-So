package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoNaoPerecivel extends Produto {

	/**
	 * M�todo construtor da classe ProdutoNaoPerecivel.
	 *
	 * Pr�-condi��o: recebe duas Strings, um objeto do tipo Fornecedor, dois floats e um vetor de Strings. 
	 * P�s-condi��o: instancia os atributos da super classe.
	 */
	public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
	}

}
