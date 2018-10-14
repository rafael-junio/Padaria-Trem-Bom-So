package funcionarios;

import funcionalidades.PessoaFisica;

public abstract class Funcionario extends PessoaFisica {
	protected float salarioBase;
	protected float salarioFinal;
	protected String codigo;

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

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigoFuncionario) {
		this.codigo = codigoFuncionario;
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Endere�o: %s.\n", getEndereco());
		System.out.printf("Telefone: %s.\n", getTelefone());
		System.out.printf("CPF: %s.\n", getCpf());
		System.out.printf("C�digo do funcion�rio: %s.\n", getCodigo());
		System.out.printf("Sal�rio base: %.2fR$.\n", getSalarioBase());
	}
}