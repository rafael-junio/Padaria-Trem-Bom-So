package cliente;

public final class ClienteRegular extends Cliente {

	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
