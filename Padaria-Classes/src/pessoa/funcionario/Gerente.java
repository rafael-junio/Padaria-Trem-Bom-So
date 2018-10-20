package pessoa.funcionario;

public final class Gerente extends Funcionario{
	private final float BONIFICACAO = 1.2f;

	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
	}
	
	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	@Override
	public float calcularSalarioFinal() {
		return this.salarioFinal = this.salarioBase * BONIFICACAO;
	}
	
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}
}
