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
				System.out.println("Produto perecível cadastrado com sucesso");
				
				return true;
			}
		}
		
		System.out.println("Não foi possível cadastrar o produto perecível");
		return false;
	}
	
	boolean cadastrarProduto(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, 
			String[] apelido, int codigo, int quantidadeEstoque) {
		
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = new ProdutoNaoPerecivel(nome, fornecedor, precoCusto, precoFinal, apelido, codigo, quantidadeEstoque);
				System.out.println("Produto não perecível cadastrado com sucesso");
				return true;
			}
		}
		System.out.println("Não foi possível cadastrar o produto não perecível");
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
