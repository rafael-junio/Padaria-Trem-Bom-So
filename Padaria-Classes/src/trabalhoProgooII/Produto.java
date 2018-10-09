package trabalhoProgooII;

public abstract class Produto {
	
	protected String nome;
	protected Fornecedor fornecedor;
	protected float precoCusto;
	protected float precoFinal;
	protected String[] apelido;
	protected int codigo;
	
	public Produto(String nome, Fornecedor fornecedor, float precoCusto, float precoFinal, String[] apelido, int codigo) {
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.precoCusto = precoCusto;
		this.precoFinal = precoFinal;
		this.apelido = apelido;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public boolean hasApelido() {
		for (int i = 0; i < apelido.length; i++) {
			if(apelido[i] != null) {
				return true;
			}
			else
				return false;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	void imprimeInformacoesProduto() {
		System.out.println("Produto: " + getNome());
		System.out.println("Fornecedor: " + "Aqui falta fazer a parte do Fornecedor");
		System.out.println("Preço de custo: " + getPrecoCusto());
		System.out.println("Preço final: " + getPrecoFinal());
		System.out.println("Código: " + getCodigo());
		if(hasApelido()) {
			for (int i = 0; i < apelido.length; i++) {
				if(apelido[i] != null)
					System.out.println("Apelido: " + apelido[i]);
			}
		}
			
	}
	
}
