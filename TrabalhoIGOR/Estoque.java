/*package trabalhoProgooII.TrabalhoIGOR;

public class Estoque {
	
	protected Produto [] produtosEmEstoque;
	protected int qtdProdutos; // não pode ser maior que 30
	
	
	public Estoque() {
		produtosEmEstoque = new Produto [50];
		
	}
	public void cadastrarProdutoEstoque(Produto produto, int qtd) {
		boolean cadastrado = false;
		for(int i=0; i < produtosEmEstoque.length && !cadastrado; i++) {
			if(produtosEmEstoque[i] == null) {
				produtosEmEstoque[i] = produto;
				produtosEmEstoque[i].setQtdProdutos(qtd);
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}

	public void descadastrarProdutoEstoque(Produto produto) {
		boolean descadastrado = false;
		for(int i=0; i < produtosEmEstoque.length && !descadastrado; i++) {
			if(produtosEmEstoque[i].equals(produto)) {
				produtosEmEstoque[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	
	public Produto[] getProdutosEmEstoque() {
		return produtosEmEstoque;
	}
	public void setProdutosEmEstoque(Produto[] produtosEmEstoque) {
		this.produtosEmEstoque = produtosEmEstoque;
	}
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	public void imprimeInformacoesEstoque() {
		for(int i=0; i < produtosEmEstoque.length; i++) {
			if(produtosEmEstoque[i] !=null) {
				System.out.println("Produto: " + produtosEmEstoque[i].getNome());
				System.out.println("Produto: " + produtosEmEstoque[i].getQtdProdutos());
			}
		}
	}
}
*/