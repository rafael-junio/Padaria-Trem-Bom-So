package pessoa.funcionario;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	/**
	 * Método construtor da classe Gerente.
	 * 
	 * Pré-condição: recebimento de cinco String como parâmetros: nome, endereço, telefone, codigo e cnpj e um float: taxaDesconto. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf, telefone, codigo e salarioBase conforme recebidos pelos parâmetros.
	 */
	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}
	
	/**
	 * Método getBONIFICACAO.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo BONIFICACAO.
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/**
	 * Método calcularSalarioFinal.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	/**
	 * Método imprimeInformacoesFuncionario.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do gerente em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		
		if(this.salarioFinal == 0f)
			System.out.println("SALÁRIO FINAL NÃO FOI CALCULADO.");
		else
			System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
