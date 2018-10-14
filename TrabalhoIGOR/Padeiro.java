package trabalhoProgooII.TrabalhoIGOR;

public class Padeiro extends Funcionario implements SalarioFinal {
	private float salarioFinal;
	private float valorPorHora;
	private int horasPorMes = 160;
	private float percentual = (float) 0.25;
	private int horasTrabalhadas;
	
	public Padeiro(String nome, String endereco, String telefone, String cpf, float salarioBase,
			String codigoFuncionario, int horasTrabalhadas) {
		super(nome, endereco, telefone, cpf, salarioBase, codigoFuncionario);
		this.horasTrabalhadas = horasTrabalhadas;
		calcularSalarioFinal();
	}

	@Override
	public float calcularSalarioFinal() {
		valorPorHora = (salarioBase/horasPorMes); 
		salarioFinal = salarioBase + (((horasTrabalhadas-horasPorMes)*valorPorHora)*(1+ percentual));
		return salarioFinal;
	}
	
	public float getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getHorasPorMes() {
		return horasPorMes;
	}

	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public void ImprimeInformacoesFuncionarios()
	{
		super.ImprimeInformacoesFuncionarios();
		System.out.println("Salário Final: " +getSalarioFinal());
	}
}
