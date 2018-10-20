package pessoa.funcionario;


public final class Vendedor extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	/**
	 * Método construtor da classe Vendedor.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	/**
	 * Método getBONIFICACAO.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * Método getMontanteVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getMontanteVendas() {
		return montanteVendas;
	}

	/**
	 * Método setMontanteVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	/**
	 * Método getMetaVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getMetaVendas() {
		return metaVendas;
	}

	/**
	 * Método setMetaVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	/**
	 * Método atualizaMontanteVendas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float atualizaMontanteVendas(float valorVenda) {
		return this.montanteVendas += valorVenda;
	}

	/* (non-Javadoc)
	 * @see pessoa.funcionario.SalarioFinal#calcularSalarioFinal()
	 */
	@Override
	public float calcularSalarioFinal() {
		if (montanteVendas > metaVendas)
			return salarioFinal = salarioBase * BONIFICACAO;
		else
			return salarioFinal = salarioBase;
	}
	
	/**
	 * Método exibeInfoVendaVendedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nCódigo de Funcionário: %s", this.nome, this.codigo);
		return info;
	}

	/* (non-Javadoc)
	 * @see pessoa.funcionario.Funcionario#imprimeInformacoesFuncionario()
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}

}
