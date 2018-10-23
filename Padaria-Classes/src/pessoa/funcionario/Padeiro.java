/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasNoturnas;
	
	/**
	 * Método construtor da classe Padeiro.java.
	 * Método para a inicialização da classe Padeiro.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj e um float: taxaDesconto. 
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
	 * Método para permitir acesso ao valor do atributo GRATIFICACAO.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo GRATIFICACAO.
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * Método getValorPorHora.
	 * Método para permitir acesso ao valor do atributo valorPorHora.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo valorPorHora.
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * Método setValorPorHora.
	 * Método que permite alteração do valor do atributo valorPorHora.
     * Pré-condição: recebimento de um float como parâmetro: valorPorHora.
     * Pós-condição: atribuição do novo valor no atributo valorPorHora. 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * Método getHorasPorMes.
	 * Método para permitir acesso ao valor do atributo horasPorMes.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo horasPorMes.
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * Método setHorasPorMes.
	 * Método que permite alteração do valor do atributo horasPorMes.
     * Pré-condição: recebimento de um float como parâmetro: horasPorMes.
     * Pós-condição: atribuição do novo valor no atributo horasPorMes. 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	
	/**
	 * Método calcularSalarioFinal.
	 * Método para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
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
	 * Método que informa a quantidade de horas trabalhadas em período noturno.
     * Pré-condição: recebimento de um int como parâmetro: hora.
     * Pós-condição: atribuição do novo valor no atributo horasNoturnas. 
	 */
	public boolean informaHoraNoturnaPadeiro(int hora) {
		if(hora > 0) {
			this.horasNoturnas = hora;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Método imprimeInformacoesFuncionario.
	 * Método para imprimir em tela as informações referentes ao padeiro.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do padeiro em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		
		if(this.horasNoturnas == 0f)
			System.out.println("SALÁRIO FINAL NÃO FOI CALCULADO.");
		else {
			System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasNoturnas));
			System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
		}
	}
}
