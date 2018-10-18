package funcionarios;

import produtos.Produto;

public final class Vendedor extends Funcionario implements SalarioFinal, Cloneable {
	private final float BONIFICACAO = 1.1f;

	private float montanteVendas;
	private float metaVendas;

	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo, float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		calcularSalarioFinal();
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

	public Vendedor clone() throws CloneNotSupportedException {
		return (Vendedor) super.clone();
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
		System.out.printf("Montante de vendas: %.2fR$.\n", this.montanteVendas);
		System.out.printf("Sal�rio final: %.2fR$.\n", this.salarioFinal);
	}

}
