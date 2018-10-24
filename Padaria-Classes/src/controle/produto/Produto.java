package controle.produto;

import pessoa.fornecedor.Fornecedor;
import pessoa.fornecedor.FornecedorRecorrente;


public abstract class Produto {

	protected String nome; // nome do produto.
	
	protected String codigo; // c�digo do produto.
	
	protected Fornecedor fornecedor; // c�digo do fornecedor.
	
	protected float precoCusto; // pre�o de custo do produto.
	
	protected float precoFinal; // pre�o final do produto.
	
	protected String[] apelido; // apelidos do produto.
	
	protected int quantidade; // quantidade do produto em estoque.
	
	private int quantidadeVenda; // quantidade do produto a ser vendida.

	/**
	 * M�todo construtor da classe Produto.
	 *
	 * Pr�-condi��o: recebe duas Strings, um objeto do tipo Fornecedor, dois floats e um vetor de Strings. 
	 * P�s-condi��o: instancia os atributos da classe.
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

		if(apelido == null || apelido.length <= 5)
			this.apelido = apelido;
		
		this.precoFinal = precoFinal;
		this.quantidade = 0;
		this.quantidadeVenda = 0;

	}

	/**
	 * M�todo getNome.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String, nome do produto.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo setNome.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo do tipo String, nome.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo getCodigo.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String, c�digo do produto.
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * M�todo setCodigo.
	 *
	 * Pr�-condi��o: recebe uma String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo do tipo String, codigo.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo getFornecedor.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna objeto Fornecedor, fornecedor do produto.
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * M�todo setFornecedor.
	 *
	 * Pr�-condi��o: recebe um objeto Fornecedor.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo do tipo Fornecedor.
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * M�todo getPrecoCusto.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um float, atributo precoCusto.
	 */
	public float getPrecoCusto() {
		return precoCusto;
	}

	/**
	 * M�todo setPrecoCusto.
	 *
	 * Pr�-condi��o: recebe um float.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo float precoCusto.
	 */
	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	/**
	 * M�todo getPrecoFinal.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um float, atributo precoFinal.
	 */
	public float getPrecoFinal() {
		return precoFinal;
	}

	/**
	 * M�todo setPrecoFinal.
	 *
	 * Pr�-condi��o: recebe um float.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo float precoFinal.
	 */
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}

	/**
	 * M�todo getApelido.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna vetor de Strings, atributo apelido.
	 */
	public String[] getApelido() {
		return apelido;
	}

	/**
	 * M�todo setApelido.
	 *
	 * Pr�-condi��o: recebe um vetor de String.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo apelidos.
	 */
	public void setApelido(String[] apelido) {
		this.apelido = apelido;
	}

	/**
	 * M�todo getQuantidade.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um inteiro, atributo quantidade.
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * M�todo setQuantidade.
	 *
	 * Pr�-condi��o: recebe um inteiro.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo inteiro quantidade.
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * M�todo getQuantidadeVenda.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna um inteiro, atributo quantidadeVenda.
	 */
	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	/**
	 * M�todo setQuantidadeVenda.
	 *
	 * Pr�-condi��o: recebe um inteiro.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo inteiro quantidadeVenda.
	 */
	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	/**
	 * M�todo ehIgual.
	 *
	 * Pr�-condi��o: recebe uma String c�digo do produto.
	 * P�s-condi��o: retorna TRUE, caso produto tenha c�digo passado como par�metro, e FALSE, caso contr�rio.
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
	 * Pr�-condi��o: recebe um inteiro quantidade do produto.
	 * P�s-condi��o: retorna TRUE, caso quantidade do produto seja v�lida, e FALSE, caso cotr�rio.
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
	 * Pr�-condi��o: recebe um inteiro quantidade do produto a ser vendida.
	 * P�s-condi��o: retorna TRUE, caso quantidade do produto seja v�lida, e FALSE, caso cotr�rio.
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
	 * M�todo toString.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String, atributo nome.
	 */
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
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna valor. Imprime atributos da classe.
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
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String com atributos da classe relevantes para a venda do produto.
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Produto: %s\nC�digo: %s\n", this.nome, this.codigo);
		String apelidos = "";

//		if (hasApelido()) {
//			apelidos += "Apelido(s): \n";
//			for (String i : apelido)
//				if (i != null)
//					apelidos += i + "\n";
//		}
//		info += apelidos;
		info += String.format("Unidades compradas: %d.\nPre�o de final: %.2f.\n", this.quantidadeVenda, (this.precoFinal * this.quantidadeVenda));
		return info;
	}
}
