package pessoa.funcionario;

import pessoa.PessoaFisica;

public abstract class Funcionario extends PessoaFisica implements SalarioFinal {
	protected float salarioBase;
	protected float salarioFinal;
	protected String codigo;

	/**
	 * Método construtor da classe Funcionario.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Funcionario(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone);

		if (salarioBase > 0)
			this.salarioBase = salarioBase;
		else
			System.out.println("Salá¡rio base invá¡lido! Deve ser maior que zero.");

		if (codigo.length() == 4)
			this.codigo = codigo;
		else
			System.out.println("Código do funcionário inválido! Deve conter 4 dígitos.");
	}

	/**
	 * Método getSalarioBase.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getSalarioBase() {
		return salarioBase;
	}

	/**
	 * Método setSalarioBase.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * Método getSalarioFinal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getSalarioFinal() {
		return salarioFinal;
	}

	/**
	 * Método setSalarioFinal.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	/**
	 * Método getCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Método setCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setCodigo(String codigoFuncionario) {
		this.codigo = codigoFuncionario;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * Método ehIgual.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		return false;
	}

	/**
	 * Método imprimeInformacoesFuncionario.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.cpf);
		System.out.printf("Código do funcionário: %s.\n", this.codigo);
		System.out.printf("Salário base: %.2fR$.\n", this.salarioBase);
	}
}