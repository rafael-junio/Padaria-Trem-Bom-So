package funcionarios;

public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasTrabalhadas;

	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		this.horasPorMes = 160;
		this.horasTrabalhadas = 160;
	}
	
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
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

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public float calcularSalarioFinal() {
		valorPorHora = (salarioBase/horasPorMes); 
		return salarioFinal = salarioBase + (((horasTrabalhadas-horasPorMes)*valorPorHora) * GRATIFICACAO);
	}
	
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasTrabalhadas - this.horasPorMes));
		System.out.printf("Salário final: %.2f.\n", this.salarioFinal);
	}
}
