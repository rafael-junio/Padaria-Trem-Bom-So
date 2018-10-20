package pessoa.funcionario;

public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasTrabalhadas;

	/**
	 * Método construtor da classe Padeiro.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		this.horasPorMes = 160;
		this.horasTrabalhadas = 160;
	}
	
	/**
	 * Método getGRATIFICACAO.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * Método getValorPorHora.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * Método setValorPorHora.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * Método getHorasPorMes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * Método setHorasPorMes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	/**
	 * Método getHorasTrabalhadas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	/**
	 * Método setHorasTrabalhadas.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	/* (non-Javadoc)
	 * @see pessoa.funcionario.SalarioFinal#calcularSalarioFinal()
	 */
	@Override
	public float calcularSalarioFinal() {
		valorPorHora = (salarioBase/horasPorMes); 
		return salarioFinal = salarioBase + (((horasTrabalhadas-horasPorMes)*valorPorHora) * GRATIFICACAO);
	}
	
	/**
	 * Método informaHoraNoturnaPadeiro.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean informaHoraNoturnaPadeiro(int hora) {
		if(hora > 0) {
			this.horasTrabalhadas = hora;
			return true;
		}
		else
			return false;
	}
	
	/* (non-Javadoc)
	 * @see pessoa.funcionario.Funcionario#imprimeInformacoesFuncionario()
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasTrabalhadas - this.horasPorMes));
		System.out.printf("Salário final: %.2f.\n", this.salarioFinal);
	}
}
