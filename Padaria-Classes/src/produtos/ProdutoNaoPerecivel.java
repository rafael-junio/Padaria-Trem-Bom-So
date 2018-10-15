package produtos;

import fornecedores.Fornecedor;

public final class ProdutoNaoPerecivel extends Produto {

	public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, boolean temApelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, temApelido);
	}

}
