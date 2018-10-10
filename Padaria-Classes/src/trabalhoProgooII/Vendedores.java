package trabalhoProgooII;

public abstract class Vendedores extends Funcionario{
	protected float montanteVendas;
	protected float metaVendas;
	protected float bonificacaoVendedor;
	
	public Vendedores(String nome, String endereco, float salarioBase, String codigoFuncionario, float montanteVendas,
			float metaVendas) {
		super(nome, endereco, salarioBase, codigoFuncionario);
		this.montanteVendas = montanteVendas;
		this.metaVendas = metaVendas;
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
	
	public abstract float calculaSalario(float montante, float meta);
	
}
