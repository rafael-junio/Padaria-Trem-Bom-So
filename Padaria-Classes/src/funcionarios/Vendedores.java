package funcionarios;

public abstract class Vendedores extends Funcionario {
	protected float montanteVendas;
	protected float metaVendas;
	protected float bonificacaoVendedor;

	public Vendedores(String nome, String endereco, String cpf, String telefone, String codigoFuncionario,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigoFuncionario, salarioBase);
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

	public float getBonificacaoVendedor() {
		return bonificacaoVendedor;
	}

	public void setBonificacaoVendedor(float bonificacaoVendedor) {
		this.bonificacaoVendedor = bonificacaoVendedor;
	}

	public float calculaSalario(float montante, float meta) {
		this.montanteVendas = montante;
		this.metaVendas = meta;
		if (getMontanteVendas() > getMetaVendas()) {
			return this.salarioFinal = this.salarioBase * (1f + this.bonificacaoVendedor);
		} else
			return this.salarioFinal = this.salarioBase;
	}

	public void imprimeInformacoesFuncionario() {
		super.imprimeInformacoesFuncionario();
		if (this.montanteVendas != 0f) {
			System.out.printf("Montante de vendas: %.2fR$.\n", getMontanteVendas());
			System.out.printf("Meta de vendas: %.2fR$.\n", getMetaVendas());
		} else
			System.out.println("Cálculo do salário com base nas metas de venda não foi realizado!");
		System.out.printf("Salário final: %.2fR$.\n", getSalarioFinal());
	}

}
