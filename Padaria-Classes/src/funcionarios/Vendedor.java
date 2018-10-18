package funcionarios;


public final class Vendedor extends Funcionario implements SalarioFinal, Cloneable {
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		calcularSalarioFinal();
	}

	public float getBONIFICACAO() {
		return this.BONIFICACAO;
	}
	
	public float getMontanteVendas() {
		return montanteVendas;
	}

	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	public float getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}

	@Override
	public void calcularSalarioFinal() {
		if (montanteVendas > metaVendas)
			salarioFinal = salarioBase * BONIFICACAO;
		else
			salarioFinal = salarioBase;
	}

	@Override
	public Vendedor clone() {
		try {
			return (Vendedor) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}

}
