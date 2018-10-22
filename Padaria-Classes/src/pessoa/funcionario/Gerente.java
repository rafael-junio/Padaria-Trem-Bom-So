/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	/**
	 * Método construtor da classe Gerente.java.
	 * Método para a inicialização da classe Gerente.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj e um float: taxaDesconto. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf, telefone, codigo e salarioBase conforme recebidos pelos parâmetros.
	 */
	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
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
	 * Método calcularSalarioFinal.
	 * Método para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
	 * Pré-condição: não há.
	 * Pós-condição: retorna um float com o valor do atributo salarioFinal multiplicado pelo valor da BONIFICACAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	/**
	 * Método imprimeInformacoesFuncionario.
	 * Método para imprimir em tela as informações referentes ao gerente.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do gerente em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
