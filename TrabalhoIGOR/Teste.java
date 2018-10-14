package trabalhoProgooII.TrabalhoIGOR;

public class Teste {

	public static void main(String[] args) {
	
	
		Padaria tremBao = new Padaria();
		tremBao.cadastrarClientes("nome","endereco", "telefone", "cpf","1");
		tremBao.cadastrarFornecedorNaoRecorrente("nome", "endereco", "cnpj", "codigoFornecedor");
		tremBao.cadastrarFornecedorRecorrente("nome", "endereco", "cnpj", 0.1f, "codigoFornecedor");
		tremBao.cadastrarGerente("nome", "endereco", "telefone", "cpf", 2000, "10");
		tremBao.cadastrarPadeiro("nome", "endereco", "telefone", "cpf", 1200, "20", 180);
		tremBao.cadastrarVendedor("nome12", "endereco", "telefone", "cpf", 1500, "30");
		tremBao.cadastrarProdutoNaoPerecivel("nome", "codigoProduto1", "codigoFornecedor", 50f, 100f, 20);
		tremBao.cadastrarProdutoPerecivel("nome", "codigoProduto2", "codigoFornecedor", 20f, 70f, 10, 01, 2010, 5);
		tremBao.cadastrarProdutoPerecivel("nome", "codigoProduto3", "codigoFornecedor", 2f, 5f, 10, 01, 2010, 5);
				
		tremBao.imprimeClientes();
		tremBao.imprimeFornecedoresPadaria();
		tremBao.imprimeFuncionariosPadaria();
		tremBao.imprimeProdutos();
		
		tremBao.adicionarProdutoCarrinhoCompras("codigoProduto2");
		tremBao.adicionarProdutoCarrinhoCompras("codigoProduto1");
		tremBao.adicionarProdutoCarrinhoCompras("codigoProduto3");
		tremBao.realizarVenda("1", "30", 13, 10, 2018, "A Vista", 0);
		
		tremBao.adicionarProdutoCarrinhoCompras("codigoProduto3");
		tremBao.realizarVenda("1", "30", 20, 10, 2018, "A prazo", 0);
		
		tremBao.imprimeVendas();
		tremBao.imprimeCarrinhoDeCompras();
		tremBao.imprimeCarrinhoDeComprasGenerico();
	
		
	}

}
