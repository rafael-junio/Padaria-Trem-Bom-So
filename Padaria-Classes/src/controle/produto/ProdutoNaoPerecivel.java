package controle.produto;

import pessoa.fornecedor.Fornecedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class ProdutoNaoPerecivel extends Produto {

	/**
	 * Método construtor da classe ProdutoNaoPerecivel.
	 *
	 * Pré-condição: recebe duas Strings, um objeto do tipo Fornecedor, dois floats e um vetor de Strings. 
	 * Pós-condição: instancia os atributos da super classe.
	 */
	public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
	}

}
