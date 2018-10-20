package pessoa.funcionario;


public final class Vendedor extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	/**
	 * M�todo construtor da classe Vendedor.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	/**
	 * M�todo getBONIFICACAO.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * M�todo getMontanteVendas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getMontanteVendas() {
		return montanteVendas;
	}

	/**
	 * M�todo setMontanteVendas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	/**
	 * M�todo getMetaVendas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getMetaVendas() {
		return metaVendas;
	}

	/**
	 * M�todo setMetaVendas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	/**
	 * M�todo atualizaMontanteVendas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo exibeInfoVendaVendedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nC�digo de Funcion�rio: %s", this.nome, this.codigo);
		return info;
	}

	/* (non-Javadoc)
	 * @see pessoa.funcionario.Funcionario#imprimeInformacoesFuncionario()
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}

}
