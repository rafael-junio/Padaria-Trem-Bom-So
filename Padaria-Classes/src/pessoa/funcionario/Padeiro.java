/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.funcionario;

public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasNoturnas;
	
	/**
	 * M�todo construtor da classe Padeiro.java.
	 * M�todo para a inicializa��o da classe Padeiro.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj e um float: taxaDesconto. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf, telefone, codigo e salarioBase conforme recebidos pelos par�metros.
	 */
	public Padeiro(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		this.horasPorMes = 160;
		this.horasNoturnas = 0;
		
		
	}
	
	/**
	 * M�todo getGRATIFICACAO.
	 * M�todo para permitir acesso ao valor do atributo GRATIFICACAO.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo GRATIFICACAO.
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * M�todo getValorPorHora.
	 * M�todo para permitir acesso ao valor do atributo valorPorHora.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo valorPorHora.
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * M�todo setValorPorHora.
	 * M�todo que permite altera��o do valor do atributo valorPorHora.
     * Pr�-condi��o: recebimento de um float como par�metro: valorPorHora.
     * P�s-condi��o: atribui��o do novo valor no atributo valorPorHora. 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * M�todo getHorasPorMes.
	 * M�todo para permitir acesso ao valor do atributo horasPorMes.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo horasPorMes.
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * M�todo setHorasPorMes.
	 * M�todo que permite altera��o do valor do atributo horasPorMes.
     * Pr�-condi��o: recebimento de um float como par�metro: horasPorMes.
     * P�s-condi��o: atribui��o do novo valor no atributo horasPorMes. 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	
	/**
	 * M�todo calcularSalarioFinal.
	 * M�todo para calcular o valor do atributo salarioFinal de acordo com as peculariedades do cargo.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna um float com o valor do atributo salarioFinal acrescido do resultado da multiplica��o entre as horasNoturas, o valorPorHora e a GRATIFICAO.
	 */
	@Override
	public float calcularSalarioFinal() {
		valorPorHora = (salarioBase/horasPorMes); 
		return salarioFinal = salarioBase + ((horasNoturnas*valorPorHora) * GRATIFICACAO);
	}
	
	/**
	 * M�todo informaHoraNoturnaPadeiro.
	 * M�todo que informa a quantidade de horas trabalhadas em per�odo noturno.
     * Pr�-condi��o: recebimento de um int como par�metro: hora.
     * P�s-condi��o: atribui��o do novo valor no atributo horasNoturnas. 
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
	 * M�todo imprimeInformacoesFuncionario.
	 * M�todo para imprimir em tela as informa��es referentes ao padeiro.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do padeiro em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		
		if(this.horasNoturnas == 0f)
			System.out.println("SAL�RIO FINAL N�O FOI CALCULADO.");
		else {
			System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasNoturnas));
			System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
		}
	}
}
