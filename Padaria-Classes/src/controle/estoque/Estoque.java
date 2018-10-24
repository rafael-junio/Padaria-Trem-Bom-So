package controle.estoque;

import pessoa.fornecedor.Fornecedor;
import funcionalidades.Ordenacao;
import controle.produto.*;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public class Estoque implements AlertaEstoque {
	private Produto[] produtos;

	/**
	 * M�todo construtor da classe Estoque.
	 *
	 * Pr�-condi��o: n�o recebe par�metro.
	 * P�s-condi��o: instancia o �nico atributo da classe.
	 */
	public Estoque() {
		this.produtos = new Produto[50];
	}
	
	/**
	 * M�todo getProdutos.
	 *
	 * Pr�-condi��o: n�o recebe par�metro.
	 * P�s-condi��o: retorna atributo vetor do tipo Produto.
	 */
	public Produto[] getProdutos() {
		return produtos;
	}

	/**
	 * M�todo setProdutos.
	 *
	 * Pr�-condi��o: recebe vetor do tipo Produto.
	 * P�s-condi��o: n�o retorna valor. Instacia atributo produtos.
	 */
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	/**
	 * M�todo cadastrarProdutoNaoPerecivel.
	 *
	 * Pr�-condi��o: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, um vetor de Strings e um inteiro.
	 * P�s-condi��o: retorna TRUE, caso objeto do tipo ProdutoNaoPerecivel � armazenado no vetor produtos, e FALSE, caso contr�rio.
	 */
	public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, String[] apelido, int quantidade) {

		if(fornecedor == null)
			return false;
		
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
	 * Pr�-condi��o: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, t�s inteiros, um vetor de Strings e um inteiro.
	 * P�s-condi��o: retorna TRUE, caso objeto do tipo ProdutoPerecivel � armazenado no vetor produtos, e FALSE, caso contr�rio.
	 */
	public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedor, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido, int quantidade) {

		if(fornecedor == null)
			return false;
		
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
	 * Pr�-condi��o: recebe uma String c�digo do produto e um inteiro quantidade do produto.
	 * P�s-condi��o: retorna TRUE, caso quantidade do produto com c�digo passado como par�metro � alterada, e FALSE, caso contr�rio.
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
	 * Pr�-condi��o: recebe uma String c�digo do produto e um inteiro quantidade do produto.
	 * P�s-condi��o: retorna TRUE, caso quantidade do produto com c�digo passado como par�metro � vendida, e FALSE, caso contr�rio.
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
	 * M�todo descadastrarProduto.
	 *
	 * Pr�-condi��o: recebe um String c�digo do produto.
	 * P�s-condi��o: retorna TRUE, caso produto a ser descadastrado � encontrado, e FALSE, caso cont�rio.
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
	 * Pr�-condi��o: recebe um String c�digo do produto.
	 * P�s-condi��o: retorna TRUE, caso produto � encontrado, e FALSE, caso cont�rio.
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
	 * Pr�-condi��o: recebe um String c�digo do produto.
	 * P�s-condi��o: retorna objeto do tipo Produto, caso produto � encontrado, e null, caso cont�rio.
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
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna valor. Imprime produtos contidos em atributo vetor do tipo Produto.
	 */
	public void imprimeInformacoesEstoque() {			
			for (int i = 0; i <= Ordenacao.cont; i++) {
				if (produtos[i] != null) {
					produtos[i].imprimeInformacoesProduto();
					System.out.println();
				}
			}
	}

	/**
	 * M�todo alertaEstoque.
	 *
	 * Pr�-condi��o: recebe objeto do tipo Object.
	 * P�s-condi��o: n�o retorna valor.
	 */
	public void alertaEstoque(Object obj1) {
		Produto produto = (Produto) obj1;

		if (produto.getQuantidade() <= 1) {
			System.err.println("\"ALERTA! PRODUTO ATINGIU QUANTIDADE MENOR DO QUE 1 NO ESTOQUE!\"");
		}
	}

}
