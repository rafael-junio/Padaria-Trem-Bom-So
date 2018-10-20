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
	 * M�todo construtor da classe Produto.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Produto(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal,
			String[] apelido) {

		this.nome = nome;

		if (codigo.length() == 6)
			this.codigo = codigo;
		else
			System.out.println("C�digo inv�lido! Deve conter 6 d�gitos.");

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
	 * M�todo getNome.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo setNome.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo getCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * M�todo setCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo getFornecedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * M�todo setFornecedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * M�todo getPrecoCusto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * M�todo setPrecoCusto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * M�todo getPrecoFinal.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getPrecoFinal() {
		return precoFinal;
	}

	/**
	 * M�todo setPrecoFinal.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}

	/**
	 * M�todo getApelido.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String[] getApelido() {
		return apelido;
	}

	/**
	 * M�todo setApelido.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setApelido(String[] apelido) {
		this.apelido = apelido;
	}

	/**
	 * M�todo getQuantidade.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * M�todo setQuantidade.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * M�todo getQuantidadeVenda.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	/**
	 * M�todo setQuantidadeVenda.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	/**
	 * M�todo ehIgual.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}
	
	/**
	 * M�todo verificaQuantidadeProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo verificaQuantidadeVenda.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo hasApelido.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean hasApelido() {
		if (this.apelido != null)
			return true;
		return false;
	}

	/**
	 * M�todo imprimeInformacoesProduto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void imprimeInformacoesProduto() {
		System.out.println("Produto: " + this.nome + ".");
		System.out.println("C�digo: " + this.codigo + ".");

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if(i != null)
					System.out.println(i);
		}

		fornecedor.imprimeInformacoesFornecedor();
		System.out.printf("Pre�o de custo: %.2fR$. ", this.precoCusto);
		System.out.printf("\nPre�o de final: %.2fR$.\n\n", this.precoFinal);
	}

	/**
	 * M�todo exibeInfoVendaProdutos.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Produto: %s\nC�digo: %s\n", this.nome, this.codigo);
		String apelidos = "";

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if (i != null)
					apelidos += i + "\n";
		}
		info += apelidos;
		info += String.format("Unidades compradas: %d.\nPre�o de final: %.2f.\n", this.quantidadeVenda, (this.precoFinal * this.quantidadeVenda));
		return info;
	}
}
