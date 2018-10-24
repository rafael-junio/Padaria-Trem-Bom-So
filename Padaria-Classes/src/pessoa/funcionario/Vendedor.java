package pessoa.funcionario;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class Vendedor extends Funcionario{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	/**
	 * M�todo construtor da classe Vendedor.
	 * 
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo, telefone e cnpj e um float: metaVendas. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo, salarioBase e metaVendas conforme recebidos pelos par�metros.
	 */
	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	/**
	 * M�todo getBONIFICACAO.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo BONIFICACAO.
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * M�todo getMontanteVendas.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo montanteVendas.
	 */
	public float getMontanteVendas() {
		return montanteVendas;
	}

	/**
	 * M�todo setMontanteVendas.
	 * 
     * Pr�-condi��o: recebimento de um float como par�metro: montanteVendas.
     * P�s-condi��o: atribui��o do novo valor no atributo montanteVendas. 
	 */
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	/**
	 * M�todo getMetaVendas.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo metaVendas.
	 */
	public float getMetaVendas() {
		return metaVendas;
	}

	/**
	 * M�todo setMetaVendas.
	 * 
     * Pr�-condi��o: recebimento de um float como par�metro: metaVendas.
     * P�s-condi��o: atribui��o do novo valor no atributo metaVendas. 
	 */
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	/**
	 * M�todo atualizaMontanteVendas.
	 * 
	 * Pr�-condi��o: recebimento de um float como par�metro: valorVenda.
	 * P�s-condi��o: retorna o valor do atributo montanteVendas ap�s o incremento do valor de valorVenda passado como par�metro.
	 */
	public float atualizaMontanteVendas(float valorVenda) {
		return this.montanteVendas += valorVenda;
	}

	/**
	 * M�todo calcularSalarioFinal.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
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
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do vendedor.
	 */
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nC�digo de Funcion�rio: %s", this.nome, this.codigo);
		return info;
	}

	/**
	 * M�todo imprimeInformacoesFuncionario.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do vendedor em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		
		if(this.salarioFinal == 0f)
			System.out.println("SAL�RIO FINAL N�O FOI CALCULADO.");
		else
			System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}

}
