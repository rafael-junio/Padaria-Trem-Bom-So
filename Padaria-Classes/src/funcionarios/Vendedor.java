package funcionarios;

public final class Vendedor extends Vendedores {

	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		super.bonificacaoVendedor = 0.1f;
	}
	
	public void atualizarMontanteVendas(float valor) {
		this.montanteVendas += valor;
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
	}

}
