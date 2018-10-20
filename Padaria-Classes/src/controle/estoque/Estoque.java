package controle.estoque;

import pessoa.fornecedor.Fornecedor;
import funcionalidades.Ordenacao;
import controle.produto.*;

public class Estoque implements AlertaEstoque {
	private Produto[] produtos;

	/**
	 * Método construtor da classe Estoque.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Estoque() {
		this.produtos = new Produto[50];
	}
	
	/**
	 * Método getProdutos.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Produto[] getProdutos() {
		return produtos;
	}

	/**
	 * Método setProdutos.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	/**
	 * Método cadastrarProdutoNaoPerecivel.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método cadastrarProdutoPerecivel.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método atualizarQuantidadeProdutoEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método venderQuantidadeProduto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método descadastrarProduto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método produdoEmEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean produdoEmEstoque(String codigo) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				return true;
			}
		return false;
	}

	/**
	 * Método procurarProduto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Método imprimeInformacoesEstoque.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInformacoesEstoque() {
		for (int i = 0; i <= Ordenacao.cont; i++) {
			if (produtos[i] != null) {
				produtos[i].imprimeInformacoesProduto();
				System.out.printf("Contém %d unidade(s) em estoque.\n", produtos[i].getQuantidade());
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
			System.out.println("ALERTA! PRODUTO CONTÉM APENAS 1 UNIDADE EM ESTOQUE!");
	}

}
