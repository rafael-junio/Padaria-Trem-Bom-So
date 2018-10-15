package cliente;

public final class ClientePlatinum extends Cliente {

	public ClientePlatinum(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		if (super.valorCompras > 500f)
			super.desconto = 0.1f;
	}
	
	public void imprimeInformacoesCliente() {
		super.imprimeInformacoesCliente();
	}
}
