package controle.produto;

import pessoa.fornecedor.Fornecedor;
import pessoa.fornecedor.FornecedorRecorrente;

public abstract class Produto {

	protected String nome;
	protected String codigo;
	protected Fornecedor fornecedor;
	protected float precoCusto;
	protected float precoFinal;
	protected String[] apelido;
	protected int quantidade;
	private int quantidadeVenda;

	/**
	 * Método construtor da classe Produto.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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

		this.precoFinal = precoFinal;
		this.apelido = apelido;
		this.quantidade = 0;
		this.quantidadeVenda = 0;

	}

	/**
	 * Método getNome.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método setNome.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método getCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método setCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método getFornecedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * Método setFornecedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * Método getPrecoCusto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * Método setPrecoCusto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * Método getPrecoFinal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getPrecoFinal() {
		return precoFinal;
	}

	/**
	 * Método setPrecoFinal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}

	/**
	 * Método getApelido.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String[] getApelido() {
		return apelido;
	}

	/**
	 * Método setApelido.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setApelido(String[] apelido) {
		this.apelido = apelido;
	}

	/**
	 * Método getQuantidade.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Método setQuantidade.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Método getQuantidadeVenda.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	/**
	 * Método setQuantidadeVenda.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	/**
	 * Método ehIgual.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean verificaQuantidadeVenda(int quantidade) {
		if(this.quantidade - quantidade > 0) {
			this.quantidade -= quantidade;
			this.quantidadeVenda = quantidade;
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
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
	 * Pré-condição: 
	 * Pós-condição: 
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
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Produto: %s\nCódigo: %s\n", this.nome, this.codigo);
		String apelidos = "";

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if (i != null)
					apelidos += i + "\n";
		}
		info += apelidos;
		info += String.format("Unidades compradas: %d.\nPreço de final: %.2f.\n", this.quantidadeVenda, (this.precoFinal * this.quantidadeVenda));
		return info;
	}
}
