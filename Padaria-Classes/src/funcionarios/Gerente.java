package funcionarios;

public final class Gerente extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.2f;

	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		calcularSalarioFinal();
	}
	
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	@Override
	public void calcularSalarioFinal() {
		this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
