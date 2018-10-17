package produtos;

import fornecedores.Fornecedor;
import fornecedores.FornecedorRecorrente;

public abstract class Produto implements Cloneable {

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

	public Produto clone() {
		try {
			return (Produto) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(" Clonagem não permitida.");
			return this;
		}
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

				if (i != null)

				if(i != null && !i.equals(""))
					System.out.println(i);
		}

		fornecedor.imprimeInformacoesFornecedor();
		System.out.printf("Preço de custo: %.2f. ", this.precoCusto);
		System.out.printf("\nPreço de final: %.2f.\n\n", this.precoFinal);

	}

	public void imprimeInformacoesProdutoVenda() {
		System.out.println("Produto: " + this.nome + ".");
		System.out.println("Código: " + this.codigo + ".");

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if (i != null)
					System.out.println(i);
		}

		System.out.printf("Unidades compradas: %d.\n", this.quantidadeVenda);
		System.out.printf("Preço de final: %.2f.\n\n", this.precoFinal * this.quantidadeVenda);

	}
}
