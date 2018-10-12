package produtos;

import fornecedores.Fornecedor;

public class ProdutoNaoPerecivel extends Produto {

    public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal) {
	super(nome, codigo, fornecedorProduto, precoCusto, precoFinal);
    }
    
    public ProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal, String[] apelido) {
	super(nome, codigo, fornecedorProduto, precoCusto, precoFinal);
    }

}
