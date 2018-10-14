package funcionarios;

public class Vendedor extends Vendedores {

	public Vendedor(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		super.bonificacaoVendedor = 0.1f;
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Vendedor: %s.\n", getNome());
		super.imprimeInformacoesFuncionario();
	}

}
