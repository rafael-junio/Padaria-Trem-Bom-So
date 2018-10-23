/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;


public final class Vendedor extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	/**
	 * M�todo construtor da classe Vendedor.java.
	 * M�todo para a inicializa��o da classe Vendedor.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj e dois float: taxaDesconto e metaVendas. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo, salarioBase e metaVendas conforme recebidos pelos par�metros.
	 */
	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	/**
	 * M�todo getBONIFICACAO.
	 * M�todo para permitir acesso ao valor do atributo BONIFICACAO.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo BONIFICACAO.
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * M�todo getMontanteVendas.
	 * M�todo para permitir acesso ao valor do atributo montanteVendas.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo montanteVendas.
	 */
	public float getMontanteVendas() {
		return montanteVendas;
	}

	/**
	 * M�todo setMontanteVendas.
	 * M�todo que permite altera��o do valor do atributo montanteVendas.
     * Pr�-condi��o: recebimento de um float como par�metro: montanteVendas.
     * P�s-condi��o: atribui��o do novo valor no atributo montanteVendas. 
	 */
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	/**
	 * M�todo getMetaVendas.
	 * M�todo para permitir acesso ao valor do atributo metaVendas.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo metaVendas.
	 */
	public float getMetaVendas() {
		return metaVendas;
	}

	/**
	 * M�todo setMetaVendas.
	 * M�todo que permite altera��o do valor do atributo metaVendas.
     * Pr�-condi��o: recebimento de um float como par�metro: metaVendas.
     * P�s-condi��o: atribui��o do novo valor no atributo metaVendas. 
	 */
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	/**
	 * M�todo atualizaMontanteVendas.
	  * M�todo que atualiza o valor do montante de vendas do vendedor, ou seja, o valor das vendas j� realizadas pelo vendedor.
	 * Pr�-condi��o: recebimento de um float como par�metro: valorVenda.
	 * P�s-condi��o: retorna o valor do atributo montanteVendas ap�s o incremento do valor de valorVenda passado como par�metro.
	 */
	public float atualizaMontanteVendas(float valorVenda) {
		return this.montanteVendas += valorVenda;
	}

	/**
	 * M�todo calcularSalarioFinal.
	 * M�todo para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
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
	 * M�todo para converter informa��es dos atributos relacionados � venda do vendedor para o formato de String.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do vendedor.
	 */
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nC�digo de Funcion�rio: %s", this.nome, this.codigo);
		return info;
	}

	/**
	 * M�todo imprimeInformacoesFuncionario.
	 * M�todo para imprimir em tela as informa��es referentes ao vendedor.
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
