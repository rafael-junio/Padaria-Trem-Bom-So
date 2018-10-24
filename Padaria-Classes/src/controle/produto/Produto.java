package controle.produto;

import pessoa.fornecedor.Fornecedor;
import pessoa.fornecedor.FornecedorRecorrente;


public abstract class Produto {

	protected String nome; // nome do produto.
	
	protected String codigo; // código do produto.
	
	protected Fornecedor fornecedor; // código do fornecedor.
	
	protected float precoCusto; // preço de custo do produto.
	
	protected float precoFinal; // preço final do produto.
	
	protected String[] apelido; // apelidos do produto.
	
	protected int quantidade; // quantidade do produto em estoque.
	
	private int quantidadeVenda; // quantidade do produto a ser vendida.

	/**
	 * Método construtor da classe Produto.
	 *
	 * Pré-condição: recebe duas Strings, um objeto do tipo Fornecedor, dois floats e um vetor de Strings. 
	 * Pós-condição: instancia os atributos da classe.
	 */
	public Produto(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal,
			String[] apelido) {

		this.nome = nome;

		if (codigo.length() == 6)
			this.codigo = codigo;
		else
			System.out.println("Código inválido! Deve conter 6 dí­gitos.");

		this.fornecedor = fornecedor;

		if (fornecedor instanceof FornecedorRecorrente) {
			this.precoCusto = precoCusto - (precoCusto * ((FornecedorRecorrente) this.fornecedor).getTaxaDesconto());
		} else
			this.precoCusto = precoCusto;

		if(apelido == null || apelido.length <= 5)
			this.apelido = apelido;
		
		this.precoFinal = precoFinal;
		this.quantidade = 0;
		this.quantidadeVenda = 0;

	}

	/**
	 * Método getNome.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String, nome do produto.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método setNome.
	 *
	 * Pré-condição: recebe uma String.
	 * Pós-condição: não retorna valor. Instancia atributo do tipo String, nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método getCodigo.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String, código do produto.
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método setCodigo.
	 *
	 * Pré-condição: recebe uma String.
	 * Pós-condição: não retorna valor. Instancia atributo do tipo String, codigo.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método getFornecedor.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna objeto Fornecedor, fornecedor do produto.
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * Método setFornecedor.
	 *
	 * Pré-condição: recebe um objeto Fornecedor.
	 * Pós-condição: não retorna valor. Instancia atributo do tipo Fornecedor.
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * Método getPrecoCusto.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um float, atributo precoCusto.
	 */
	public float getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * Método setPrecoCusto.
	 *
	 * Pré-condição: recebe um float.
	 * Pós-condição: não retorna valor. Instancia atributo float precoCusto.
	 */
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * Método getPrecoFinal.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um float, atributo precoFinal.
	 */
	public float getPrecoFinal() {
		return precoFinal;
	}

	/**
	 * Método setPrecoFinal.
	 *
	 * Pré-condição: recebe um float.
	 * Pós-condição: não retorna valor. Instancia atributo float precoFinal.
	 */
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}

	/**
	 * Método getApelido.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna vetor de Strings, atributo apelido.
	 */
	public String[] getApelido() {
		return apelido;
	}

	/**
	 * Método setApelido.
	 *
	 * Pré-condição: recebe um vetor de String.
	 * Pós-condição: não retorna valor. Instancia atributo apelidos.
	 */
	public void setApelido(String[] apelido) {
		this.apelido = apelido;
	}

	/**
	 * Método getQuantidade.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um inteiro, atributo quantidade.
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Método setQuantidade.
	 *
	 * Pré-condição: recebe um inteiro.
	 * Pós-condição: não retorna valor. Instancia atributo inteiro quantidade.
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Método getQuantidadeVenda.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna um inteiro, atributo quantidadeVenda.
	 */
	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	/**
	 * Método setQuantidadeVenda.
	 *
	 * Pré-condição: recebe um inteiro.
	 * Pós-condição: não retorna valor. Instancia atributo inteiro quantidadeVenda.
	 */
	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	/**
	 * Método ehIgual.
	 *
	 * Pré-condição: recebe uma String código do produto.
	 * Pós-condição: retorna TRUE, caso produto tenha código passado como parâmetro, e FALSE, caso contrário.
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}
	
	/**
	 * Método verificaQuantidadeProduto.
	 *
	 * Pré-condição: recebe um inteiro quantidade do produto.
	 * Pós-condição: retorna TRUE, caso quantidade do produto seja válida, e FALSE, caso cotrário.
	 */
	public boolean verificaQuantidadeProduto(int quantidade) {
		if((this.quantidade + quantidade) < 1 || (this.quantidade + quantidade) > 30)
			return false;
		else {
			this.quantidade += quantidade;
			return true;
		}
	}
	
	/**
	 * Método verificaQuantidadeVenda.
	 *
	 * Pré-condição: recebe um inteiro quantidade do produto a ser vendida.
	 * Pós-condição: retorna TRUE, caso quantidade do produto seja válida, e FALSE, caso cotrário.
	 */
	public boolean verificaQuantidadeVenda(int quantidade) {
		if(this.quantidade - quantidade > 0) {
			this.quantidade -= quantidade;
			this.quantidadeVenda = quantidade;
			return true;
		}
		return false;
	}
	
	/**
	 * Método toString.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String, atributo nome.
	 */
	public String toString() {
		return this.getNome();
	}

	/**
	 * Método hasApelido.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean hasApelido() {
		if (this.apelido != null)
			return true;
		return false;
	}

	/**
	 * Método imprimeInformacoesProduto.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna valor. Imprime atributos da classe.
	 */
	public void imprimeInformacoesProduto() {
		System.out.println("Produto: " + this.nome + ".");
		System.out.println("Código: " + this.codigo + ".");

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if(i != null)
					System.out.println(i);
		}

		fornecedor.imprimeInformacoesFornecedor();
		System.out.printf("Preço de custo: %.2fR$. ", this.precoCusto);
		System.out.printf("\nPreço de final: %.2fR$.\n\n", this.precoFinal);
	}

	/**
	 * Método exibeInfoVendaProdutos.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String com atributos da classe relevantes para a venda do produto.
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Produto: %s\nCódigo: %s\n", this.nome, this.codigo);
		String apelidos = "";

//		if (hasApelido()) {
//			apelidos += "Apelido(s): \n";
//			for (String i : apelido)
//				if (i != null)
//					apelidos += i + "\n";
//		}
//		info += apelidos;
		info += String.format("Unidades compradas: %d.\nPreço de final: %.2f.\n", this.quantidadeVenda, (this.precoFinal * this.quantidadeVenda));
		return info;
	}
}
