package controle.estoque;

import pessoa.fornecedor.Fornecedor;
import funcionalidades.Ordenacao;
import controle.produto.*;

public class Estoque implements AlertaEstoque {
	private Produto[] produtos;

	public Estoque() {
		this.produtos = new Produto[50];
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

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
	
	public boolean atualizarQuantidadeProdutoEstoque(String codigo, int quantidadeNovoProduto) {
		Produto alteraProduto = procurarProduto(codigo);	
		if(alteraProduto != null) {
			alteraProduto.verificaQuantidadeProduto(quantidadeNovoProduto);
			return true;
		}
		else
			return false;	
	}

	public boolean venderQuantidadeProduto(String codigo, int quantidade) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo))
				if (produtos[i].verificaQuantidadeVenda(quantidade)) {
					alertaEstoque(produtos[i]);
					return true;
				}
		return false;
	}

	public boolean descadastrarProduto(String codigo) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				produtos[i] = null;
				return true;
			}
		return false;
	}

	public boolean produdoEmEstoque(String codigo) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				return true;
			}
		return false;
	}

	public Produto procurarProduto(String codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].ehIgual(codigo)) {
				return produtos[i];
			}
		}
		return null;
	}

	public void imprimeInformacoesEstoque() {
		for (int i = 0; i <= Ordenacao.cont; i++) {
			if (produtos[i] != null) {
				produtos[i].imprimeInformacoesProduto();
				System.out.printf("Contém %d unidade(s) em estoque.\n", produtos[i].getQuantidade());
				System.out.println();
			}
		}
	}

	public void alertaEstoque(Object obj1) {
		Produto produto = (Produto) obj1;

		if (produto.getQuantidade() == 1)
			System.out.println("ALERTA! PRODUTO CONTÉM APENAS 1 UNIDADE EM ESTOQUE!");
	}

}
