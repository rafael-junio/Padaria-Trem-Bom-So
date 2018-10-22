/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	/**
	 * M�todo construtor da classe Gerente.java.
	 * M�todo para a inicializa��o da classe Gerente.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj e um float: taxaDesconto. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo e salarioBase conforme recebidos pelos par�metros.
	 */
	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
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
	 * M�todo calcularSalarioFinal.
	 * M�todo para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	/**
	 * M�todo imprimeInformacoesFuncionario.
	 * M�todo para imprimir em tela as informa��es referentes ao gerente.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do gerente em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}
}
