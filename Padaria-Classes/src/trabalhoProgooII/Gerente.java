package trabalhoProgooII;

public class Gerente extends Vendedores {

	public Gerente(String nome, String endereco, float salarioBase, String codigoFuncionario, float montanteVendas,
			float metaVendas) {
		super(nome, endereco, salarioBase, codigoFuncionario, montanteVendas, metaVendas);
		super.bonificacaoVendedor = 0.2f;
	}
	
		

	@Override
	public float calculaSalario(float montante, float meta) {
		if(getMontanteVendas() > getMetaVendas()) {
			return super.salarioBase + super.salarioBase * super.bonificacaoVendedor;
		}
		else
			return super.salarioBase;
		}

}
	
	