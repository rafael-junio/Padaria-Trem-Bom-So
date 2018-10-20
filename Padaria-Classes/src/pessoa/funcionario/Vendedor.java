package pessoa.funcionario;


public final class Vendedor extends Funcionario implements SalarioFinal{
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase, float metaVendas) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
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
	
	public float atualizaMontanteVendas(float valorVenda) {
		return this.montanteVendas += valorVenda;
	}

	@Override
	public float calcularSalarioFinal() {
		if (montanteVendas > metaVendas)
			return salarioFinal = salarioBase * BONIFICACAO;
		else
			return salarioFinal = salarioBase;
	}
	
	public String exibeInfoVendaVendedor() {
		String info = String.format("\nNome Vendedor(a): %s\nCódigo de Funcionário: %s", this.nome, this.codigo);
		return info;
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		System.out.printf("Salário final: %.2fR$.\n", this.salarioFinal);
	}

}
