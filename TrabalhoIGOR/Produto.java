package trabalhoProgooII.TrabalhoIGOR;

public abstract class Produto {
	
	protected String nome;
	protected String codigoProduto;
	protected String fornecedorProduto;
	protected float precoCusto;
	protected float precoFinal;
	protected String [] apelidos; 
	public int qtdProdutos;
	
	
	public Produto(String nome, String codigoProduto, String fornecedorProduto, float precoCusto, float precoFinal, int qtdProdutos) {
		apelidos = new String[5];
		this.nome = nome;
		this.codigoProduto = codigoProduto;
		this.fornecedorProduto = fornecedorProduto;
		this.precoCusto = precoCusto;
		this.precoFinal = precoFinal;
		this.qtdProdutos = qtdProdutos;
		
		
	}
	
	public void cadastrarApelido(String apelido) {
		boolean cadastrado = false;
		for(int i=0; i < apelidos.length && !cadastrado; i++) {
			if(apelidos[i] == null) {
				apelidos[i] = apelido;
				cadastrado = true;
			}
		}
		if (cadastrado)
			System.out.println("Cadastrado com Sucesso");
		else
			System.out.println("Erro ao cadastrar");
		
	}
	public void descadastrarApelido(String apelido) {
		boolean descadastrado = false;
		for(int i=0; i < apelidos.length && !descadastrado; i++) {
			if(apelidos[i].equals(apelido)) {
				apelidos[i] = null;
				descadastrado = true;
			}
		}
		if (descadastrado)
			System.out.println("Descadastrado com Sucesso");
		else
			System.out.println("Erro ao descadastrar");
		
	}

	public String[] getApelidos() {
		return apelidos;
	}

	public void setApelidos(String[] apelidos) {
		this.apelidos = apelidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	

	public String getFornecedorProduto() {
		return fornecedorProduto;
	}

	public void setFornecedorProduto(String fornecedorProduto) {
		this.fornecedorProduto = fornecedorProduto;
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

	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	
	
}
		
	

