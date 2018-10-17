package produtos;

import java.util.Scanner;

import fornecedores.Fornecedor;
import fornecedores.FornecedorRecorrente;

public abstract class Produto {

	Scanner teclado = new Scanner(System.in);

	protected String nome;
	protected String codigo;
	protected Fornecedor fornecedor;
	protected float precoCusto;
	protected float precoFinal;
	protected String[] apelido;

	public Produto(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal,
			String[] apelido) {
		
		this.nome = nome;

		if (codigo.length() == 6)
			this.codigo = codigo;
		else
			System.out.println("Código inválido! Deve conter 6 dí­gitos.");

		this.fornecedor = fornecedor;

		if (fornecedor instanceof FornecedorRecorrente) {
			this.precoCusto = precoCusto + (precoCusto * ((FornecedorRecorrente) this.fornecedor).getTaxaDesconto());
		} else
			this.precoCusto = precoCusto;

		this.precoFinal = precoFinal;

		this.apelido = apelido;

	}

	private boolean cadastrarApelido(String apelido, int i) {

		if(i != 4)
			System.out.print("Deseja cadastrar outro? ");
		if (i < 4 && teclado.nextBoolean()) {
			teclado.nextLine();
			return true;
		}
		else
			return false;
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

	public String[] getApelidoRegiao() {
		return apelido;
	}

	public void setApelidoRegiao(String[] apelidoRegiao) {
		this.apelido = apelidoRegiao;
	}

	public boolean hasApelido() {
		if (this.apelido != null)
			return true;
		return false;
	}

	public void imprimeInformacoesProduto() {
		System.out.println("Produto: " + this.nome + ".");
		System.out.println("Código: " + this.codigo + ".");
		fornecedor.imprimeInformacoesFornecedor();
		System.out.printf("Preçoo de custo: %.2f. ", this.precoCusto);
		System.out.printf("\nPreço de final: %.2f.\n", this.precoFinal);

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelido)
				if(i != null && !i.equals(""))
					System.out.println(i);
		}

	}
}
