package trabalhoProgooII;

public class Vendedor extends Vendedores {

    public Vendedor(String nome, String endereco, float salarioBase, String codigoFuncionario) {
	super(nome, endereco, salarioBase, codigoFuncionario);
	super.bonificacaoVendedor = 0.1f;
    }

}
