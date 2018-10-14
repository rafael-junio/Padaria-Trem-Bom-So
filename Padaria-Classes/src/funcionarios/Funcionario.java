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
			System.out.println("Salá¡rio base invá¡lido! Deve ser maior que zero.");

		if (codigo.length() == 4)
			this.codigo = codigo;
		else
			System.out.println("Código do funcionário inválido! Deve conter 4 dígitos.");
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
		System.out.printf("Endereço: %s.\n", getEndereco());
		System.out.printf("Telefone: %s.\n", getTelefone());
		System.out.printf("CPF: %s.\n", getCpf());
		System.out.printf("Código do funcionário: %s.\n", getCodigo());
		System.out.printf("Salário base: %.2fR$.\n", getSalarioBase());
	}
}