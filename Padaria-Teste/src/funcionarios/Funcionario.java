package funcionarios;

import funcionalidades.Pessoa;

public abstract class Funcionario extends Pessoa {
    protected float salarioBase;
    protected String codigoFuncionario;

    public Funcionario(String nome, String endereco, float salarioBase, String codigoFuncionario) {
	super(nome, endereco);

	if (salarioBase > 0)
	    this.salarioBase = salarioBase;
	else
	    System.out.println("Salário base inválido! Deve ser maior que zero.");

	if (codigoFuncionario.length() == 4)
	    this.codigoFuncionario = codigoFuncionario;
	else
	    System.out.println("Código do funcionário inválido! Deve conter 4 dígitos.");
    }

    public float getSalarioBase() {
	return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
	this.salarioBase = salarioBase;
    }

    public String getCodigoFuncionario() {
	return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
	this.codigoFuncionario = codigoFuncionario;
    }
}