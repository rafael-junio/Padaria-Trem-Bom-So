package controle.estoque;

import pessoa.fornecedor.Fornecedor;
import funcionalidades.Ordenacao;
import controle.produto.*;

public class Estoque implements AlertaEstoque {
	private Produto[] produtos;

	/**
	 * M�todo construtor da classe Estoque.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Estoque() {
		this.produtos = new Produto[50];
	}
	
	/**
	 * M�todo getProdutos.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Produto[] getProdutos() {
		return produtos;
	}

	/**
	 * M�todo setProdutos.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	/**
	 * M�todo cadastrarProdutoNaoPerecivel.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, String[] apelido, int quantidade) {

		ProdutoNaoPerecivel novoProduto = new ProdutoNaoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal,
				apelido);

		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] == null && novoProduto.verificaQuantidadeProduto(quantidade)) {
					produtos[i] = novoProduto;
					novoProduto = null;
					alertaEstoque(produtos[i]);
					return true;
				}
		novoProduto = null;
		return false;
	}

	/**
	 * M�todo cadastrarProdutoPerecivel.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido, int quantidade) {

		ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal, dia, mes,
				ano, apelido);

		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] == null && novoProduto.verificaQuantidadeProduto(quantidade)) {
					produtos[i] = novoProduto;
					novoProduto = null;
					alertaEstoque(produtos[i]);
					return true;
				}
		novoProduto = null;
		return false;
	}
	
	/**
	 * M�todo atualizarQuantidadeProdutoEstoque.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean atualizarQuantidadeProdutoEstoque(String codigo, int quantidadeNovoProduto) {
		Produto alteraProduto = procurarProduto(codigo);	
		if(alteraProduto != null) {
			alteraProduto.verificaQuantidadeProduto(quantidadeNovoProduto);
			return true;
		}
		else
			return false;	
	}

	/**
	 * M�todo venderQuantidadeProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean venderQuantidadeProduto(String codigo, int quantidade) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo))
				if (produtos[i].verificaQuantidadeVenda(quantidade)) {
					alertaEstoque(produtos[i]);
					return true;
				}
		return false;
	}

	/**
	 * M�todo descadastrarProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean descadastrarProduto(String codigo) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				produtos[i] = null;
				return true;
			}
		return false;
	}

	/**
	 * M�todo produdoEmEstoque.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean produdoEmEstoque(String codigo) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				return true;
			}
		return false;
	}

	/**
	 * M�todo procurarProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Produto procurarProduto(String codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				return produtos[i];
			}
		}
		return null;
	}

	/**
	 * M�todo imprimeInformacoesEstoque.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void imprimeInformacoesEstoque() {
		for (int i = 0; i <= Ordenacao.cont; i++) {
			if (produtos[i] != null) {
				produtos[i].imprimeInformacoesProduto();
				System.out.printf("Cont�m %d unidade(s) em estoque.\n", produtos[i].getQuantidade());
				System.out.println();
			}
		}
	}

	/* (non-Javadoc)
	 * @see controle.estoque.AlertaEstoque#alertaEstoque(java.lang.Object)
	 */
	public void alertaEstoque(Object obj1) {
		Produto produto = (Produto) obj1;

		if (produto.getQuantidade() == 1)
			System.out.println("ALERTA! PRODUTO CONT�M APENAS 1 UNIDADE EM ESTOQUE!");
	}

}
