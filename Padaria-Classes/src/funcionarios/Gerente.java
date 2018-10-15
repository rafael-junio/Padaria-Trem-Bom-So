package funcionarios;

public final class Gerente extends Vendedores {

	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		super.bonificacaoVendedor = 0.2f;
	}

	public void atualizarMontanteVendas(float valor) {
		this.montanteVendas += valor;
	}
	
	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", this.nome);
		super.imprimeInformacoesFuncionario();
	}
}
