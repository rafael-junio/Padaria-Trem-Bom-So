package pessoa.funcionario;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	/**
	 * M�todo construtor da classe Gerente.
	 * 
	 * Pr�-condi��o: recebimento de cinco String como par�metros: nome, endere�o, telefone, codigo e cnpj e um float: taxaDesconto. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo e salarioBase conforme recebidos pelos par�metros.
	 */
	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
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
	 * M�todo calcularSalarioFinal.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	/**
	 * M�todo imprimeInformacoesFuncionario.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do gerente em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		
		if(this.salarioFinal == 0f)
			System.out.println("SAL�RIO FINAL N�O FOI CALCULADO.");
		else
			System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}
}
