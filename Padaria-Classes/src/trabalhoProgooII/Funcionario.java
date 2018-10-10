package trabalhoProgooII;

public abstract class Funcionario extends Pessoa {
	
	protected float salarioBase;
	protected String codigoFuncionario;
	
	public Funcionario(String nome, String endereco, float salarioBase, String codigoFuncionario) {
		super(nome, endereco);
		this.salarioBase = salarioBase;
		this.codigoFuncionario = codigoFuncionario;
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
