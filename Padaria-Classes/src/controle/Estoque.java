package controle;

import fornecedores.Fornecedor;
import produtos.Produto;
import produtos.ProdutoNaoPerecivel;
import produtos.ProdutoPerecivel;
import trabalhoProgooII.Vendedor;

public class Estoque implements AlertaEstoque {
	protected Produto[] produtos;

	public Estoque() {
		this.produtos = new Produto[50];
	}

	public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, boolean temApelido, int quantidade) {

		ProdutoNaoPerecivel novoProduto = new ProdutoNaoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal,
				temApelido);

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				if ((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
					System.out.println("Não é possível cadastrar produto! Quantidade inválida.");
					novoProduto = null;
					return false;
				} else {
					produtos[i] = novoProduto;
					novoProduto = null;
					produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
					System.out.println("Produto cadastrado com sucesso!");
					alertaEstoque(produtos[i]);
					return true;
				}
			} else {
				if (produtos[i].getCodigo().equals(novoProduto.getCodigo())) {
					System.out.println("Produto já está em estoque!");
					novoProduto = null;
					return false;
				}
			}
		}
		System.out.println("Não é possível cadastrar produto!");
		return false;
	}

	public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, int dia, int mes, int ano, boolean temApelido, int quantidade) {

		ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal, dia, mes,
				ano, temApelido);

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				if ((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
					System.out.println("Não é possível cadastrar produto! Quantidade inválida.");
					novoProduto = null;
					return false;
				} else {
					produtos[i] = novoProduto;
					novoProduto = null;
					produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
					System.out.println("Produto cadastrado com sucesso!");
					alertaEstoque(produtos[i]);
					return true;
				}
			} else {
				if (produtos[i].getCodigo().equals(novoProduto.getCodigo())) {
					System.out.println("Produto já está em estoque!");
					novoProduto = null;
					return false;
				}
			}
		}
		System.out.println("Não é possível cadastrar produto!");
		return false;
	}

	public boolean descadastrarProduto(String codigo, int quantidade) {

		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null)
				if (produtos[i].getCodigo().equals("codigo"))
					if ((produtos[i].getQuantidade() - quantidade) > 0) {
						produtos[i].setQuantidade(produtos[i].getQuantidade() - quantidade);
						return true;
					} else if (((produtos[i].getQuantidade() - quantidade) == 0)) {
						///////////////////////////////////////////////////////////////////
						produtos[i].setQuantidade(0);
//						produtos[i] = null;
					}
		return false;

	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public boolean produdoEmEstoque(String codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].getCodigo().equals(codigo)) {
				produtos[i].imprimeInformacoesProduto();
				return true;
			}
		}
		System.out.println("Produto não encontrado!");
		return false;
	}

	public void imprimeInformacoesEstoque() {
		for (Produto i : produtos) {
			if (i != null) {
				i.imprimeInformacoesProduto();
				System.out.printf("Contém %d unidade(s) em estoque.\n", i.getQuantidade());
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
