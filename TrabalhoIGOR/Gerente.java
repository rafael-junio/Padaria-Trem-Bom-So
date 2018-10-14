package trabalhoProgooII.TrabalhoIGOR;

public class Gerente extends Funcionario implements SalarioFinal {
	private float salarioFinal;
	private float percentual = (float) 0.2;
	
	public Gerente(String nome, String endereco, String telefone, String cpf, float salarioBase,
			String codigoFuncionario) {
		super(nome, endereco, telefone, cpf, salarioBase, codigoFuncionario);
		calcularSalarioFinal();
	}

	
	public float calcularSalarioFinal() {
		salarioFinal = salarioBase * (1+percentual);
		return salarioFinal;
	}


	public float getSalarioFinal() {
		return salarioFinal;
	}


	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}


	public float getPercentual() {
		return percentual;
	}


	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	public void ImprimeInformacoesFuncionarios()
	{
		super.ImprimeInformacoesFuncionarios();
		System.out.println("Salário Final: " +getSalarioFinal());
	}
}
