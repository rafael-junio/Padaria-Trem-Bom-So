package cliente;

public final class ClienteRegular extends Cliente {

	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.desconto = 0;
	}
	
	public void imprimeInformacoesCliente() {
		super.imprimeInformacoesCliente();
	}
}
