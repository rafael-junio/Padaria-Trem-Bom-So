package pessoa.funcionario;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class Padeiro extends Funcionario{
	private final float GRATIFICACAO = 1.25f;

	private float valorPorHora;
	private int horasPorMes;
	private int horasNoturnas;
	
	/**
	 * M�todo construtor da classe Padeiro.
	 * 
	 * Pr�-condi��o: recebimento de cinco String como par�metros: nome, endere�o, telefone, codigo e cnpj e um float: taxaDesconto. 
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
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo GRATIFICACAO.
	 */
	public float getGRATIFICACAO() {
		return this.GRATIFICACAO;
	}
	
	/**
	 * M�todo getValorPorHora.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo valorPorHora.
	 */
	public float getValorPorHora() {
		return valorPorHora;
	}

	/**
	 * M�todo setValorPorHora.
	 * 
     * Pr�-condi��o: recebimento de um float como par�metro: valorPorHora.
     * P�s-condi��o: atribui��o do novo valor no atributo valorPorHora. 
	 */
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	/**
	 * M�todo getHorasPorMes.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo horasPorMes.
	 */
	public int getHorasPorMes() {
		return horasPorMes;
	}

	/**
	 * M�todo setHorasPorMes.
	 * 
     * Pr�-condi��o: recebimento de um float como par�metro: horasPorMes.
     * P�s-condi��o: atribui��o do novo valor no atributo horasPorMes. 
	 */
	public void setHorasPorMes(int horasPorMes) {
		this.horasPorMes = horasPorMes;
	}

	
	/**
	 * M�todo calcularSalarioFinal.
	 * 
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
	 * 
     * Pr�-condi��o: recebimento de um int como par�metro: hora.
     * P�s-condi��o: atribui��o do novo valor no atributo horasNoturnas. 
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
	 * M�todo imprimeInformacoesFuncionario.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do padeiro em tela.
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Padeiro: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Horas excedente de trabalho noturno: %02d hora(s).\n", (this.horasNoturnas));
		System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}
}
