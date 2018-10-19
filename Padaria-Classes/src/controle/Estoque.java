package controle;

import fornecedores.Fornecedor;
import produtos.Produto;
import produtos.ProdutoNaoPerecivel;
import produtos.ProdutoPerecivel;

public class Estoque implements AlertaEstoque {
	private Produto[] produtos;
	private int qntProdutosEstoque;
	

	public Estoque() {
		this.produtos = new Produto[50];
		this.qntProdutosEstoque = 0;
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	public int getQntProdutosEstoque() {
		return qntProdutosEstoque;
	}
	
	public void setQntProdutosEstoque(int qntProdutosEstoque) {
		this.qntProdutosEstoque = qntProdutosEstoque;
	}


	public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, String[] apelido, int quantidade) {

		ProdutoNaoPerecivel novoProduto = new ProdutoNaoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal,
				apelido);

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				if ((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
//					System.out.println("Não é possível cadastrar produto! Quantidade inválida.");
					novoProduto = null;
					return false;
				} else {
					produtos[i] = novoProduto;
					novoProduto = null;
					produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
//					System.out.println("Produto cadastrado com sucesso!");
					alertaEstoque(produtos[i]);
					qntProdutosEstoque++;
					return true;
				}
			} else {
				if (produtos[i].getCodigo().equals(novoProduto.getCodigo())) {
//					System.out.println("Produto já está em estoque!");
					novoProduto = null;
					return false;
				}
			}
		}
		return false;
	}

	public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido, int quantidade) {

		ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, codigo, fornecedor, precoCusto, precoFinal, dia, mes,
				ano, apelido);

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] == null) {
				if ((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
//					System.out.println("Não é possível cadastrar produto! Quantidade inválida.");
					novoProduto = null;
					return false;
				} else {
					produtos[i] = novoProduto;
					novoProduto = null;
					produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
//					System.out.println("Produto cadastrado com sucesso!");
					alertaEstoque(produtos[i]);
					qntProdutosEstoque++;
					return true;
				}
			} else {
				if (produtos[i].getCodigo().equals(novoProduto.getCodigo())) {
//					System.out.println("Produto já está em estoque!");
					novoProduto = null;
					return false;
				}
			}
		}
		return false;
	}

	public boolean venderQuantidadeProduto(String codigo, int quantidade) {
		for (int i = 0; i < produtos.length; i++)
			if (produtos[i] != null && produtos[i].getCodigo().equals(codigo))
				if ((produtos[i].getQuantidade() - quantidade) > 0) {
					produtos[i].setQuantidadeVenda(quantidade);
					produtos[i].setQuantidade(produtos[i].getQuantidade() - quantidade);
					alertaEstoque(produtos[i]);
					return true;
				}
		return false;
	}

	public boolean descadastrarProduto(String codigo) {

		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].getCodigo().equals(codigo)) {
				produtos[i] = null;
				qntProdutosEstoque--;
				return true;
			}
		}

		return false; // produto não encontrado
	}

	public boolean produdoEmEstoque(String codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}

	public Produto procurarProduto(String codigo) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].getCodigo().equals(codigo)) {
				return produtos[i];
			}
		}
//		System.out.println("Produto não encontrado!");
		return null;
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
