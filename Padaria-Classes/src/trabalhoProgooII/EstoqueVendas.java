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
				System.out.println("Produto perec�vel cadastrado com sucesso");
				
				return true;
			}
		}
		
		System.out.println("N�o foi poss�vel cadastrar o produto perec�vel");
		return false;
	}
	
	boolean cadastrarProduto(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, 
			String[] apelido, int codigo, int quantidadeEstoque) {
		
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = new ProdutoNaoPerecivel(nome, fornecedor, precoCusto, precoFinal, apelido, codigo, quantidadeEstoque);
				System.out.println("Produto n�o perec�vel cadastrado com sucesso");
				return true;
			}
		}
		System.out.println("N�o foi poss�vel cadastrar o produto n�o perec�vel");
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
		return produtos[0];
	}
	
	boolean venderProduto(int codigo, int diaVenda, int mesVenda, int anoVenda, Vendedor vendedor) {
		
		for (int i = 0; i < produtosVendidos.length; i++) {
			if(produtosVendidos[i] == null && procurarProduto(codigo).getCodigo() == codigo) {
				
				produtosVendidos[i] = new Produto(procurarProduto(codigo).getNome(), procurarProduto(codigo).getPrecoFinal(), codigo, diaVenda, mesVenda, anoVenda, vendedor) {};
			
				procurarProduto(codigo).setQuantidadeEstoque(procurarProduto(codigo).getQuantidadeEstoque() - 1);
				
				System.out.println(produtosVendidos[i].getNome());
				return true;
			}
		}
		return false;
		
	}
}
