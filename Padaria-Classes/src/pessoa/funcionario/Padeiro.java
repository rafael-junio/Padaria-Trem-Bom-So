package pessoa.funcionario;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasNoturnas;
	
	/**
	 * Método construtor da classe Padeiro.
	 * 
	 * Pré-condição: recebimento de cinco String como parâmetros: nome, endereço, telefone, codigo e cnpj e um float: taxaDesconto. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf, telefone, codigo e salarioBase conforme recebidos pelos parâmetros.
	 */
	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		this.horasPorMes = 160;
		this.horasNoturnas = 0;
		
		
	}
	
	/**
	 * Método getGRATIFICACAO.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo GRATIFICACAO.
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * Método getValorPorHora.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo valorPorHora.
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * Método setValorPorHora.
	 * 
     * Pré-condição: recebimento de um float como parâmetro: valorPorHora.
     * Pós-condição: atribuição do novo valor no atributo valorPorHora. 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * Método getHorasPorMes.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo horasPorMes.
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * Método setHorasPorMes.
	 * 
     * Pré-condição: recebimento de um float como parâmetro: horasPorMes.
     * Pós-condição: atribuição do novo valor no atributo horasPorMes. 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	
	/**
	 * Método calcularSalarioFinal.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: retorna um float com o valor do atributo salarioFinal acrescido do resultado da multiplicação entre as horasNoturas, o valorPorHora e a GRATIFICAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		valorPorHora = (salarioBase/horasPorMes); 
		return salarioFinal = salarioBase + ((horasNoturnas*valorPorHora) * GRATIFICACAO);
	}
	
	/**
	 * Método informaHoraNoturnaPadeiro.
	 * 
     * Pré-condição: recebimento de um int como parâmetro: hora.
     * Pós-condição: atribuição do novo valor no atributo horasNoturnas. 
	 */
	public boolean informaHoraNoturnaPadeiro(int hora) {
		if(hora > 1 && hora < 100 ) {
			this.horasNoturnas = hora;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Método imprimeInformacoesFuncionario.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do padeiro em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasNoturnas));
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
