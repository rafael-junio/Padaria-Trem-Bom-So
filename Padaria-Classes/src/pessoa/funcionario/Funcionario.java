/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

import pessoa.PessoaFisica;
import pessoa.funcionario.SalarioFinal;

public abstract class Funcionario extends PessoaFisica implements SalarioFinal {
	protected float salarioBase;
	protected float salarioFinal;
	protected String codigo;

	/**
	 * M�todo construtor da classe Funcionario.java.
	 * M�todo para a inicializa��o da classe Funcion�rio
	 * Pr�-condi��o: recebimento de cinco String como par�metros: nome, endere�o, cpf, telefone, codigo e um float: salarioBase. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo e salarioBase conforme recebidos pelos par�metros.
	 */
	public Funcionario(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone);

		if (salarioBase > 0)
			this.salarioBase = salarioBase;
		else
			System.out.println("Sal�rio base inv�lido! Deve ser maior que zero.");

		if (codigo.length() == 4)
			this.codigo = codigo;
		else
			System.out.println("C�digo do funcion�rio inv�lido! Deve conter 4 d�gitos.");
	}

	/**
	 * M�todo getSalarioBase.
	 * M�todo para permitir acesso ao valor do atributo salarioBase.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float com o valor do atributo salarioBase. 
	 */
	public float getSalarioBase() {
		return salarioBase;
	}

	/**
	 * M�todo setSalarioBase.
	 * M�todo que permite altera��o do valor do atributo salarioBase.
     * Pr�-condi��o: recebimento de um float como par�metro: salarioBase.
     * P�s-condi��o: atribui��o do novo valor no atributo salarioBase. 
	 */
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * M�todo getSalarioFinal.
	 * M�todo para permitir acesso ao valor do atributo salarioFinal.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float com o valor do atributo salarioFinal. 
	 */
	public float getSalarioFinal() {
		return salarioFinal;
	}

	/**
	 * M�todo setSalarioBase.
	 * M�todo que permite altera��o do valor do atributo salarioFinal.
     * Pr�-condi��o: recebimento de um float como par�metro: salarioFinal.
     * P�s-condi��o: atribui��o do novo valor no atributo salarioFinal. 
	 */
	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	/**
	 * M�todo getCodigo.
	 * M�todo para permitir acesso ao valor do atributo codigo.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo codigo. 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * M�todo setCodigo.
	 * M�todo que permite altera��o do valor do atributo codigo.
     * Pr�-condi��o: recebimento de uma String como par�metro: codigo.
     * P�s-condi��o: atribui��o do novo valor no atributo codigo. 
	 */
	public void setCodigo(String codigoFuncionario) {
		this.codigo = codigoFuncionario;
	}
	
	/**
	 * M�todo toString().
	 * M�todo que converte o objeto original em formato String por meio do atributo nome;
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * M�todo ehIgual.
	 * M�todo que compara se o valor do atributo codigo � igual ao passado como par�metro.
	 * Pr�-condi��o: recebimento de uma String como par�metro: codigo.
	 * P�s-condi��o: retorna true caso o valor do atributo codigo comparado seja igual ao valor do par�metro codigo passado, caso contr�rio, retorna false;
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		return false;
	}

	/**
	 * M�todo imprimeInformacoesFuncionario.
	 * M�todo para imprimir em tela as informa��es referentes ao funcion�rio.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do funcion�rio em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.cpf);
		System.out.printf("C�digo do funcion�rio: %s.\n", this.codigo);
		System.out.printf("Sal�rio base: %.2fR$.\n", this.salarioBase);
	}
}