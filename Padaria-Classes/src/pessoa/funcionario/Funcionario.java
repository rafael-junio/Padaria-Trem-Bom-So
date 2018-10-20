package pessoa.funcionario;

import pessoa.PessoaFisica;

public abstract class Funcionario extends PessoaFisica implements SalarioFinal {
	protected float salarioBase;
	protected float salarioFinal;
	protected String codigo;

	/**
	 * M�todo construtor da classe Funcionario.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getSalarioBase() {
		return salarioBase;
	}

	/**
	 * M�todo setSalarioBase.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * M�todo getSalarioFinal.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getSalarioFinal() {
		return salarioFinal;
	}

	/**
	 * M�todo setSalarioFinal.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	/**
	 * M�todo getCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * M�todo setCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo ehIgual.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		return false;
	}

	/**
	 * M�todo imprimeInformacoesFuncionario.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.cpf);
		System.out.printf("C�digo do funcion�rio: %s.\n", this.codigo);
		System.out.printf("Sal�rio base: %.2fR$.\n", this.salarioBase);
	}
}