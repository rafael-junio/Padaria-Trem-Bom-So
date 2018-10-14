package funcionarios;

public class Gerente extends Vendedores {

	public Gerente(String nome, String endereco, String cpf, String telefone, String codigo,
			float salarioBase) {
		super(nome, endereco, cpf, telefone, codigo, salarioBase);
		super.bonificacaoVendedor = 0.2f;
	}

	public void imprimeInformacoesFuncionario() {
		System.out.printf("Nome Gerente: %s.\n", getNome());
		super.imprimeInformacoesFuncionario();
	}
}
