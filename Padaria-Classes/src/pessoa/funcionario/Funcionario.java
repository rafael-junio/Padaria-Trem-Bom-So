/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

import pessoa.PessoaFisica;
import pessoa.funcionario.SalarioFinal;

public abstract class Funcionario extends PessoaFisica implements SalarioFinal {
	protected float salarioBase;
	protected float salarioFinal;
	protected String codigo;

	/**
	 * Método construtor da classe Funcionario.java.
	 * Método para a inicialização da classe Funcionário
	 * Pré-condição: recebimento de cinco String como parâmetros: nome, endereço, cpf, telefone, codigo e um float: salarioBase. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf, telefone, codigo e salarioBase conforme recebidos pelos parâmetros.
	 */
	public Funcionario(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone);

		if (salarioBase > 0)
			this.salarioBase = salarioBase;
		else
			System.out.println("Salário base inválido! Deve ser maior que zero.");

		if (codigo.length() == 4)
			this.codigo = codigo;
		else
			System.out.println("Código do funcionário inválido! Deve conter 4 dígitos.");
	}

	/**
	 * Método getSalarioBase.
	 * Método para permitir acesso ao valor do atributo salarioBase.
     * Pré-condição: não há.
     * Pós-condição: retorna um float com o valor do atributo salarioBase. 
	 */
	public float getSalarioBase() {
		return salarioBase;
	}

	/**
	 * Método setSalarioBase.
	 * Método que permite alteração do valor do atributo salarioBase.
     * Pré-condição: recebimento de um float como parâmetro: salarioBase.
     * Pós-condição: atribuição do novo valor no atributo salarioBase. 
	 */
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * Método getSalarioFinal.
	 * Método para permitir acesso ao valor do atributo salarioFinal.
     * Pré-condição: não há.
     * Pós-condição: retorna um float com o valor do atributo salarioFinal. 
	 */
	public float getSalarioFinal() {
		return salarioFinal;
	}

	/**
	 * Método setSalarioBase.
	 * Método que permite alteração do valor do atributo salarioFinal.
     * Pré-condição: recebimento de um float como parâmetro: salarioFinal.
     * Pós-condição: atribuição do novo valor no atributo salarioFinal. 
	 */
	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	/**
	 * Método getCodigo.
	 * Método para permitir acesso ao valor do atributo codigo.
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo codigo. 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método setCodigo.
	 * Método que permite alteração do valor do atributo codigo.
     * Pré-condição: recebimento de uma String como parâmetro: codigo.
     * Pós-condição: atribuição do novo valor no atributo codigo. 
	 */
	public void setCodigo(String codigoFuncionario) {
		this.codigo = codigoFuncionario;
	}
	
	/**
	 * Método toString().
	 * Método que converte o objeto original em formato String por meio do atributo nome;
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * Método ehIgual.
	 * Método que compara se o valor do atributo codigo é igual ao passado como parâmetro.
	 * Pré-condição: recebimento de uma String como parâmetro: codigo.
	 * Pós-condição: retorna true caso o valor do atributo codigo comparado seja igual ao valor do parâmetro codigo passado, caso contrário, retorna false;
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		return false;
	}

	/**
	 * Método imprimeInformacoesFuncionario.
	 * Método para imprimir em tela as informações referentes ao funcionário.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do funcionário em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.cpf);
		System.out.printf("Código do funcionário: %s.\n", this.codigo);
		System.out.printf("Salário base: %.2fR$.\n", this.salarioBase);
	}
}