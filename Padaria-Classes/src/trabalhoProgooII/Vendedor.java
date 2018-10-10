package trabalhoProgooII;

public final class Vendedor extends Funcionario {
	
	protected float montanteVendas;
	protected float bonificacaoVendedor;
	
	public Vendedor(String nome, String endereco, float salarioBase, String codigoFuncionario, float montanteVendas, float bonificacaoVendedor) {
		super(nome, endereco, salarioBase, codigoFuncionario);
		this.montanteVendas = montanteVendas;
		this.bonificacaoVendedor = bonificacaoVendedor;
	}

	public float getMontanteVendas() {
		return montanteVendas;
	}

	public void setMontanteVendas(float montanteVendas) {
		this.montanteVendas = montanteVendas;
	}

	public float getBonificacaoVendedor() {
		return bonificacaoVendedor;
	}

	public void setBonificacaoVendedor(float bonificacaoVendedor) {
		this.bonificacaoVendedor = bonificacaoVendedor;
	}

}
