package pessoa.funcionario;

public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	/**
	 * Método construtor da classe Gerente.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}
	
	/**
	 * Método getBONIFICACAO.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	/* (non-Javadoc)
	 * @see pessoa.funcionario.SalarioFinal#calcularSalarioFinal()
	 */
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	/* (non-Javadoc)
	 * @see pessoa.funcionario.Funcionario#imprimeInformacoesFuncionario()
	 */
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
