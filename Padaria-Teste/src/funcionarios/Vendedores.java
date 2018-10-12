package funcionarios;

public abstract class Vendedores extends Funcionario{
	protected float montanteVendas;
	protected float metaVendas;
	protected float bonificacaoVendedor;
	
	public Vendedores(String nome, String endereco, float salarioBase, String codigoFuncionario) {
		super(nome, endereco, salarioBase, codigoFuncionario);
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
		    return this.salarioBase + this.salarioBase * this.bonificacaoVendedor;
		} else
		    return super.salarioBase;
	    }
	
}
