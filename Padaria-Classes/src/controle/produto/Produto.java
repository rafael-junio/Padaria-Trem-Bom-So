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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public float getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(float precoCusto) {
		this.precoCusto = precoCusto;
	}

	public float getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}

	public String[] getApelido() {
		return apelido;
	}

	public void setApelido(String[] apelido) {
		this.apelido = apelido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}
	
	public boolean verificaQuantidadeProduto(int quantidade) {
		if((this.quantidade + quantidade) < 1 || (this.quantidade + quantidade) > 30)
			return false;
		else {
			this.quantidade += quantidade;
			return true;
		}
	}
	
	public boolean verificaQuantidadeVenda(int quantidade) {
		if(this.quantidade - quantidade > 0) {
			this.quantidade -= quantidade;
			this.quantidadeVenda = quantidade;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}

	public boolean hasApelido() {
		if (this.apelido != null)
			return true;
		return false;
	}

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
