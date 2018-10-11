package trabalhoProgooII;

public class EstoqueVendas {
	
	protected Produto[] produtos;
	protected Produto[] produtosVendidos;
	
	public EstoqueVendas() {
		this.produtos = new Produto[50];
		this.produtosVendidos = new Produto[20];
	}
	
	boolean cadastrarProduto(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, 
			String[] apelido, int codigo, int quantidadeEstoque, int diaValidade, int mesValidade, int anoValidade) {
		
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = new ProdutoPerecivel(nome, fornecedor, precoCusto, precoFinal, apelido, codigo, diaValidade, mesValidade, anoValidade, quantidadeEstoque);
				System.out.println("Produto cadastrado com sucesso");
				
				return true;
			}
		}
		
		System.out.println("N�o foi poss�vel cadastrar o produto");
		return false;
	}
	
	boolean cadastrarProduto(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, 
			String[] apelido, int codigo, int quantidadeEstoque) {
		
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = new ProdutoNaoPerecivel(nome, fornecedor, precoCusto, precoFinal, apelido, codigo, quantidadeEstoque);
				System.out.println("Produto cadastrado com sucesso");
				return true;
			}
		}
		System.out.println("N�o foi poss�vel cadastrar o produto");
		return false;
	}
	
	boolean descadastrarProduto(int codigo) {
		return true;
	}
	
	Produto procurarProduto(int codigo) {
		
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null && produtos[i].getCodigo() == codigo) {
				return produtos[i];
			}
		}
		return null;
	}
	
	boolean venderProduto(int codigo, int diaVenda, int mesVenda, int anoVenda, Vendedor vendedor) {
		
		for (int i = 0; i < produtosVendidos.length; i++) {
			if(produtosVendidos[i] == null && procurarProduto(codigo) != null && procurarProduto(codigo).getQuantidadeEstoque() > 0 &&procurarProduto(codigo).getCodigo() == codigo) {
				
				produtosVendidos[i] = new Produto(procurarProduto(codigo).getNome(), procurarProduto(codigo).getPrecoFinal(), codigo, diaVenda, mesVenda, anoVenda, vendedor) {};
			
				procurarProduto(codigo).setQuantidadeEstoque(procurarProduto(codigo).getQuantidadeEstoque() - 1);
				
				System.out.println("Produto " + procurarProduto(codigo).getNome() + " Vendido com sucesso");
				return true;
			}
		}
			System.out.println("Produto n�o dispon�vel no estoque");
			return false;
		
	}
	
	void imprimeInformacoesProdutosVendidos() {
		System.out.println("--Produtos Vendidos--");
		for (int i = 0; i < produtosVendidos.length && produtosVendidos[i] != null; i++) {
			System.out.println("----");
			System.out.println("Produto: " + produtosVendidos[i].getNome());
			System.out.println("C�digo: " + produtosVendidos[i].getCodigo());
			System.out.println("Forma de pagamento: "); //FALTA IMPLEMENTAR
			System.out.println("Vendedor: " + produtosVendidos[i].vendedor.getNome());
			System.out.println("Data: " + produtosVendidos[i].diaVenda + "/" + produtosVendidos[i].mesVenda + "/" +produtosVendidos[i].anoVenda);
			System.out.println("----");
		}
	}
	
	void imprimeInformacoesProdutosEstoque() {
		
	}
}
