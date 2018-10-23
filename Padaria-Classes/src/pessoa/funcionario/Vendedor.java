/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;


public final class Vendedor extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	/**
	 * Método construtor da classe Vendedor.java.
	 * Método para a inicialização da classe Vendedor.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj e dois float: taxaDesconto e metaVendas. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf, telefone, codigo, salarioBase e metaVendas conforme recebidos pelos parâmetros.
	 */
	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}

	/**
	 * Método getBONIFICACAO.
	 * Método para permitir acesso ao valor do atributo BONIFICACAO.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo BONIFICACAO.
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * Método getMontanteVendas.
	 * Método para permitir acesso ao valor do atributo montanteVendas.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo montanteVendas.
	 */
	public float getMontanteVendas() {
		return montanteVendas;
	}

	/**
	 * Método setMontanteVendas.
	 * Método que permite alteração do valor do atributo montanteVendas.
     * Pré-condição: recebimento de um float como parâmetro: montanteVendas.
     * Pós-condição: atribuição do novo valor no atributo montanteVendas. 
	 */
	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	/**
	 * Método getMetaVendas.
	 * Método para permitir acesso ao valor do atributo metaVendas.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo metaVendas.
	 */
	public float getMetaVendas() {
		return metaVendas;
	}

	/**
	 * Método setMetaVendas.
	 * Método que permite alteração do valor do atributo metaVendas.
     * Pré-condição: recebimento de um float como parâmetro: metaVendas.
     * Pós-condição: atribuição do novo valor no atributo metaVendas. 
	 */
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	/**
	 * Método atualizaMontanteVendas.
	  * Método que atualiza o valor do montante de vendas do vendedor, ou seja, o valor das vendas já realizadas pelo vendedor.
	 * Pré-condição: recebimento de um float como parâmetro: valorVenda.
	 * Pós-condição: retorna o valor do atributo montanteVendas após o incremento do valor de valorVenda passado como parâmetro.
	 */
	public float atualizaMontanteVendas(float valorVenda) {
		return this.montanteVendas += valorVenda;
	}

	/**
	 * Método calcularSalarioFinal.
	 * Método para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
	 * Pré-condição: não há.
	 * Pós-condição: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
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
	 * Método para converter informações dos atributos relacionados à venda do vendedor para o formato de String.
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do vendedor.
	 */
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nCódigo de Funcionário: %s", this.nome, this.codigo);
		return info;
	}

	/**
	 * Método imprimeInformacoesFuncionario.
	 * Método para imprimir em tela as informações referentes ao vendedor.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do vendedor em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		
		if(this.salarioFinal == 0f)
			System.out.println("SALÁRIO FINAL NÃO FOI CALCULADO.");
		else
			System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}

}
