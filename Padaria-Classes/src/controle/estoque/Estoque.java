package controle.estoque;

import pessoa.fornecedor.Fornecedor;
import funcionalidades.Ordenacao;
import controle.produto.*;

public class Estoque implements AlertaEstoque {
	private Produto[] produtos; // produtos armazenados em estoque (max 50).

	/**
	 * Método construtor da classe Estoque.
	 *
	 * Pré-condição: não recebe parâmetro.
	 * Pós-condição: instancia único atributo da classe.
	 */
	public Estoque() {
		this.produtos = new Produto[50];
	}
	
	/**
	 * Método getProdutos.
	 *
	 * Pré-condição: não recebe parâmetro.
	 * Pós-condição: retorna atributo vetor do tipo Produto.
	 */
	public Produto[] getProdutos() {
		return produtos;
	}

	/**
	 * Método setProdutos.
	 *
	 * Pré-condição: recebe vetor do tipo Produto.
	 * Pós-condição: não retorna valor. Instacia atributo produtos.
	 */
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	/**
	 * Método cadastrarProdutoNaoPerecivel.
	 *
	 * Pré-condição: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, um vetor de Strings e um inteiro.
	 * Pós-condição: retorna TRUE, caso objeto do tipo ProdutoNaoPerecivel é armazenado no vetor produtos, e FALSE, caso contrário.
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
	 * Pré-condição: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, tês inteiros, um vetor de Strings e um inteiro.
	 * Pós-condição: retorna TRUE, caso objeto do tipo ProdutoPerecivel é armazenado no vetor produtos, e FALSE, caso contrário.
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
	 * Pré-condição: recebe uma String código do produto e um inteiro quantidade do produto.
	 * Pós-condição: retorna TRUE, caso quantidade do produto com código passado como parâmetro é alterada, e FALSE, caso contrário.
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
	 * Pré-condição: recebe uma String código do produto e um inteiro quantidade do produto.
	 * Pós-condição: retorna TRUE, caso quantidade do produto com código passado como parâmetro é vendida, e FALSE, caso contrário.
	 */
	public boolean venderQuantidadeProduto(String codigo, int quantidade) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo))
				if (produtos[i].verificaQuantidadeVenda(quantidade)) {
					alertaEstoque(produtos[i]);
					return true;
				}
				else
					return false;
		return false;
	}

	/**
	 * Método descadastrarProduto.
	 *
	 * Pré-condição: recebe um String código do produto.
	 * Pós-condição: retorna TRUE, caso produto a ser descadastrado é encontrado, e FALSE, caso contário.
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
	 * Pré-condição: recebe um String código do produto.
	 * Pós-condição: retorna TRUE, caso produto é encontrado, e FALSE, caso contário.
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
	 * Pré-condição: recebe um String código do produto.
	 * Pós-condição: retorna objeto do tipo Produto, caso produto é encontrado, e null, caso contário.
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
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna valor. Imprime produtos contidos em atributo vetor do tipo Produto.
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

	/**
	 * Método alertaEstoque.
	 *
	 * Pré-condição: recebe objeto do tipo Object.
	 * Pós-condição: não retorna valor.
	 */
	public void alertaEstoque(Object obj1) {
		Produto produto = (Produto) obj1;

		if (produto.getQuantidade() == 1)
			System.err.println("ALERTA! PRODUTO CONTÉM APENAS 1 UNIDADE EM ESTOQUE!");
	}

}
