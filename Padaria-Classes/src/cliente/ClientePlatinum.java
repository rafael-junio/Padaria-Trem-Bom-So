package cliente;

public final class ClientePlatinum extends Cliente {
	private final float DESCONTO = 1.1f;
	
	public ClientePlatinum(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	public float getDESCONTO() {
		return DESCONTO;
	}

	public void imprimeInformacoesCliente() {
		super.imprimeInformacoesCliente();
	}
}
