package pessoa.funcionario;

public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasTrabalhadas;

	/**
	 * M�todo construtor da classe Padeiro.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		this.horasPorMes = 160;
		this.horasTrabalhadas = 160;
	}
	
	/**
	 * M�todo getGRATIFICACAO.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * M�todo getValorPorHora.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * M�todo setValorPorHora.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * M�todo getHorasPorMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * M�todo setHorasPorMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	/**
	 * M�todo getHorasTrabalhadas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	/**
	 * M�todo setHorasTrabalhadas.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo informaHoraNoturnaPadeiro.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
		System.out.printf("Sal�rio final: %.2f.\n", this.salarioFinal);
	}
}
