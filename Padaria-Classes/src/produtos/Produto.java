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
	protected int quantidade;
	protected String[] apelidoRegiao;

	public Produto(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal,
			boolean temApelido) {
		
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
		this.quantidade = 0;

		if (temApelido) {
			this.apelidoRegiao = new String[5];
			System.out.println("Apelido para " + this.nome);

			int i = 0;
			
			while (temApelido) {
				System.out.print("Digite o apelido: ");
				temApelido = cadastrarApelido(teclado.nextLine(), i);
				i += 1;
			}
		}


	}

	private boolean cadastrarApelido(String apelido, int i) {
		apelidoRegiao[i] = apelido;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String[] getApelidoRegiao() {
		return apelidoRegiao;
	}

	public void setApelidoRegiao(String[] apelidoRegiao) {
		this.apelidoRegiao = apelidoRegiao;
	}

	public boolean hasApelido() {
		if (this.apelidoRegiao != null)
			return true;
		return false;
	}

	public void imprimeInformacoesProduto() {
		System.out.println("Produto: " + getNome() + ".");
		System.out.println("Código: " + getCodigo() + ".");
		fornecedor.imprimeInformacoesFornecedor();
		System.out.printf("Preçoo de custo: %.2f. ", getPrecoCusto());
		System.out.printf("\nPreço de final: %.2f.\n", getPrecoFinal());

		if (hasApelido()) {
			System.out.println("Apelido(s): ");
			for (String i : apelidoRegiao)
				if(i != null)
					System.out.println(i);
		}

	}
}
