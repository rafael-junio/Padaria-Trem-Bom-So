package funcionarios;

public class Gerente extends Vendedores {

    public Gerente(String nome, String endereco, float salarioBase, String codigoFuncionario) {
	super(nome, endereco, salarioBase, codigoFuncionario);
	super.bonificacaoVendedor = 0.2f;
    }

}
